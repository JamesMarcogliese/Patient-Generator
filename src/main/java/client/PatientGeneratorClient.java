package client;
import client.classes.GenerationResponse;
import client.classes.GenerationService;
import client.classes.GenerationService_Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "PatientGeneratorClient")
public class PatientGeneratorClient extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        client.classes.GenerationService service = new GenerationService_Service().getPort(GenerationService.class);

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

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
