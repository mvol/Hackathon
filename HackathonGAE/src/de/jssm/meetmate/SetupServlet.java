package de.jssm.meetmate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class SetupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataManager dm = DataManager.getInstance();
        response.setContentType("text/plain");

        /*
        if(dm.createUser("mvol", "password", "Malte", "Vollmerhausen")){
            response.getWriter().println("added person....");
        }else{
            response.getWriter().println("add person failed.");
        }
        */

        dm.createCategory("Mathematik");
        dm.createCategory("Physik");
        dm.createCategory("Informatik");
        dm.createCategory("Elektonik");
        dm.createCategory("Filmgeschichte");



    }
}
