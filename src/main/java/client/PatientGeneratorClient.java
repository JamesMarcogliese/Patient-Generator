package client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
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

       /* client.classes.GenerationService service = new GenerationService_Service().getPort(GenerationService.class);
        String selection = request.getParameter("element_8");

        if(Objects.equals(selection, "random")){

            int count = Integer.valueOf(request.getParameter("element_3"));

            GenerationResponse generationResponse = service.generatePatients(count,false);
            List<String> list = generationResponse.getPatients().getPatient();
            String str = String.join("\n", list);
            request.setAttribute("patients", str);
            RequestDispatcher view = request.getRequestDispatcher("result.jsp");
            view.forward(request,response);

        } else if (Objects.equals(selection, "options")){

            core.model.componentModel.Demographic options = new core.model.componentModel.Demographic();
            //
            Demographic demo = new Demographic();
            Address add = new Address();
            Demographic.Addresses adds = new Demographic.Addresses();
            //adds.setAddress();
            //demo.setAddresses(Demographic.Addresses.address = "");
            //
            core.model.componentModel.Address address = new core.model.componentModel.Address();
            address.setCity(request.getParameter("element_1_1"));
            address.setCountry(request.getParameter("element_1_6"));
            address.setStateProvince(request.getParameter("element_1_4"));
            address.setStreetAddress(request.getParameter("element_1_1"));
            address.setZipPostalCode(request.getParameter("element_1_5"));
            ArrayList<core.model.componentModel.Address> addresses = new ArrayList<>();
            addresses.add(address);
            options.setAddresses(addresses);

            Calendar calStart = Calendar.getInstance();
            calStart.set(Integer.valueOf(request.getParameter("element_4_3")),
                         Integer.valueOf(request.getParameter("element_4_2")),
                         Integer.valueOf(request.getParameter("element_4_1")));
            Calendar calEnd = Calendar.getInstance();
            calEnd.set(Integer.valueOf(request.getParameter("element_5_3")),
                       Integer.valueOf(request.getParameter("element_5_2")),
                       Integer.valueOf(request.getParameter("element_5_1")));

            DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
            //dateOfBirthOptions.
            options.setDateOfBirthOptions();
            options.setGender();
            options.setMetadata();
            options.setNames();
            options.setOtherIdentifiers();
            options.setPersonIdentifier();
            options.setRelatedPersons();
            options.setTelecomOptions();

        }*/
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
