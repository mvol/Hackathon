package de.jssm.meetmate;

import com.google.gson.Gson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 21:11
 * To change this template use File | Settings | File Templates.
 */
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws IOException {
        System.out.println("INCOMING CONNECTION: POST");
        // System.out.println("REQUEST IS: "+httpRequest.getParameter("content"));
        Gson gson = new Gson();

        String requestString = httpRequest.getParameter("content");
        TransferContainer transferContainer = gson.fromJson(requestString, TransferContainer.class);

        String response = process(transferContainer);
        httpResponse.setContentType("text/plain");
        httpResponse.getWriter().print(response);
    }

    private String process(TransferContainer transferContainer) {
        String out = "";

        switch(transferContainer.action){
            case JSSEProtocol.ACTION_REGISTER:
                break;
            case JSSEProtocol.ACTION_LOGIN:
                out += "Tried to login as "+transferContainer.parameters.get("username");
                System.out.println("USER CONNECTED: "+transferContainer.parameters.get("username"));
                break;
            case JSSEProtocol.ACTION_GET_EVENTS:
                break;
            case JSSEProtocol.ACTION_NEW_EVENT:
                System.out.println("CREATING NEW EVENT");
                break;
        }

        return out;  //To change body of created methods use File | Settings | File Templates.
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("INCOMING CONNECTION: GET");
        response.setContentType("text/plain");
        response.getWriter().println("Hello, world");


    }
}
