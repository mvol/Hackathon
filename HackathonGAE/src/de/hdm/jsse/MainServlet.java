package de.hdm.jsse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {
        Gson gson = new Gson();

        String requestString = httpRequest.getParameter("request");
        Request request = gson.fromJson(requestString, Request.class);

        String response = process(request);

    }

    private String process(Request request) {
        switch(request.action){

            case 0:


                break;



            default:
                System.err.println("Unknown request code!");

        }

        return null;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }







}
