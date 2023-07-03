package com.example.jeep.s03;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s03/radice")
public class Radice extends HttpServlet {
    private static final Logger log = LogManager.getLogger(Radice.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String number = req.getParameter("number");
        log.trace("Number is (" + number + ")");

        if (number != null) {
            double x = Double.parseDouble(number);
            double result = Math.sqrt(x);
            req.setAttribute("result", result);
        }
        req.getRequestDispatcher("radice.jsp").forward(req, resp);
    }

}
