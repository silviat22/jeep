package com.example.jeep.s05;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s05/ex/greeter")
public class ExerciseMood extends HttpServlet {
    private static final Logger log = LogManager.getLogger(ExerciseMood.class);

    // private static final Logger log = LogManager.getLogger(ExerciseMood.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        log.trace("name is {" + name + "}");
        String mood = request.getParameter("mood");
        log.trace(name + "is feeling {" + mood + "}");

        request.setAttribute("name", name);
        request.setAttribute("mood", mood);
        request.getRequestDispatcher("mood.jsp").forward(request, response);
    }

}
