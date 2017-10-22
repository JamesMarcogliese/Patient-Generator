package client;

import client.classes.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Web Client Servlet.
 */
@WebServlet(name = "PatientGeneratorClient")
public class PatientGeneratorClient extends HttpServlet {
    /**
     * Handle POST request from index.jsp.
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @throws ServletException Servlet Exception
     * @throws IOException IO Exception
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        client.classes.GenerationService service = new GenerationService_Service().getPort(GenerationService.class);
        String selection = request.getParameter("element_8");

        if(Objects.equals(selection, "random")){

            int count = Integer.valueOf(request.getParameter("element_3"));

            GenerationResponse generationResponse = service.generatePatients(count,false);
            List<String> list = generationResponse.getPatients();
            String str = String.join("\n", list);
            request.setAttribute("patients", str);
            RequestDispatcher view = request.getRequestDispatcher("result.jsp");
            view.forward(request,response);

        } else if (Objects.equals(selection, "options")){

            Demographic options = new Demographic();

            Address address = new Address();
            address.setCity(request.getParameter("element_1_1"));
            address.setCountry(request.getParameter("element_1_6"));
            address.setStateProvince(request.getParameter("element_1_4"));
            address.setStreetAddress(request.getParameter("element_1_1"));
            address.setZipPostalCode(request.getParameter("element_1_5"));
            options.getAddresses().add(address);

            try{
                XMLGregorianCalendar calStart = DatatypeFactory.newInstance()
                        .newXMLGregorianCalendarDate(Integer.valueOf(request.getParameter("element_4_3")),
                                Integer.valueOf(request.getParameter("element_4_2")),
                                Integer.valueOf(request.getParameter("element_4_1")),
                        DatatypeConstants.FIELD_UNDEFINED);
                XMLGregorianCalendar calEnd = DatatypeFactory.newInstance()
                        .newXMLGregorianCalendarDate(Integer.valueOf(request.getParameter("element_5_3")),
                                Integer.valueOf(request.getParameter("element_5_2")),
                                Integer.valueOf(request.getParameter("element_5_1")),
                        DatatypeConstants.FIELD_UNDEFINED);

                DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
                dateOfBirthOptions.setStart(calStart);
                dateOfBirthOptions.setEnd(calEnd);
                options.setDateOfBirthOptions(dateOfBirthOptions);

            } catch (DatatypeConfigurationException e){
                e.printStackTrace();
            }

            options.setGender(request.getParameter("element_9"));

            Metadata metadata = new Metadata();
            metadata.setAssigningAuthority("None");
            metadata.setReceivingApplication("webService");
            metadata.setReceivingFacility("webService");
            metadata.setSendingApplication("webClient");
            metadata.setSendingFacility("webClient");
            metadata.setUseFhir(true);
            options.setMetadata(metadata);

            Name name = new Name();
            name.setFirstName(request.getParameter("element_2_1"));
            name.setLastName(request.getParameter("element_2_2"));
            name.setPrefix(null);
            options.getNames().add(name);

            AlternateIdentifier alternateIdentifier = new AlternateIdentifier();
            alternateIdentifier.setAssigningAuthority("None");
            alternateIdentifier.setType("None");
            alternateIdentifier.setValue("None");
            options.getOtherIdentifiers().add(alternateIdentifier);

            //options.setPersonIdentifier(null);

            //options.getRelatedPersons();

            Telecommunication telecommunication = new Telecommunication();
            telecommunication.getEmailAddresses().add(request.getParameter("element_6"));

            ArrayList<String> arr = new ArrayList<>();
            arr.add(request.getParameter("element_7_1"));
            arr.add(request.getParameter("element_7_2"));
            arr.add(request.getParameter("element_7_3"));
            String phoneStr = String.join("", arr);
            telecommunication.getPhoneNumbers().add(phoneStr);
            options.setTelecomOptions(telecommunication);

            GenerationResponse generationResponse = service.generatePatientsWithOptions(options, false);
            if (generationResponse.isHasErrors()){
                String str = String.join("\n", generationResponse.getMessages());
                request.setAttribute("patients", str);
                RequestDispatcher view = request.getRequestDispatcher("result.jsp");
                view.forward(request,response);
            } else {
                List<String> list = generationResponse.getPatients();
                String str = String.join("\n", list);
                request.setAttribute("patients", str);
                RequestDispatcher view = request.getRequestDispatcher("result.jsp");
                view.forward(request, response);
            }
        }
    }

    /**
     * Handle GET request from index.jsp. NOT IMPLEMENTED.
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @throws ServletException Servlet Exception
     * @throws IOException IO Exception
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
