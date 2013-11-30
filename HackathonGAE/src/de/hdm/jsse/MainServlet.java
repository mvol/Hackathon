package de.hdm.jsse;

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
        Gson gson = new Gson();

        String requestString = httpRequest.getParameter("request");
        Request request = gson.fromJson(requestString, Request.class);

        String response = process(request);
    }

    private String process(Request request) {
        switch(request.action){
            case JSSEProtocol.ACTION_REGISTER:
                break;
            case JSSEProtocol.ACTION_LOGIN:
                break;
            case JSSEProtocol.ACTION_GET_EVENTS:
                break;
            case JSSEProtocol.ACTION_NEW_EVENT:
                break;
        }

        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/plain");
        response.getWriter().println("Hello, world");


    }
}
