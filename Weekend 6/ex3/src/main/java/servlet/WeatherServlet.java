package servlet;


import client.WeatherDisplayer;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/trojmiasto")
public class WeatherServlet extends HttpServlet {

    @Inject
    WeatherDisplayer weatherDisplayer;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();

        printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html>");
        printWriter.write("<body>");
        printWriter.write("<font color=\"green\">------------------------------</font>");
        printWriter.write("</br>");
        printWriter.write("<font color=\"green\"><b>Weather for Gdansk:</b></font> ");
        printWriter.write("</br>");
        printWriter.write("<font color=\"green\">------------------------------</font>");
        printWriter.write("</br>");
        printWriter.write(weatherDisplayer.showWeatherFor("Gdańsk"));
        printWriter.write("</br>");
        printWriter.write("</br>");
        printWriter.write("<font color=\"teal\">------------------------------</font>");
        printWriter.write("</br>");
        printWriter.write("<font color=\"teal\"><b>Weather for Gdynia:</b></font> ");
        printWriter.write("</br>");
        printWriter.write("<font color=\"teal\">------------------------------</font>");
        printWriter.write("</br>");
        printWriter.write(weatherDisplayer.showWeatherFor("Gdynia"));
        printWriter.write("</br>");
        printWriter.write("</body>");
        printWriter.write("</html>");
    }
}
