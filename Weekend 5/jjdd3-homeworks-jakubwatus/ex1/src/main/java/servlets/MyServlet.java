package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet("/JakubWatus")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();

        printWriter.write("Name: " + "Jakub" + "\n");
        printWriter.write("Surame: " + "Watus" + "\n");
        printWriter.write("Team: " + "Javersi" + "\n");
        printWriter.write("Date: " + LocalDate.now() + "\n");
        printWriter.write("Time: " + LocalTime.now() + "\n");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String team = req.getParameter("team");

        PrintWriter printWriter = resp.getWriter();

        printWriter.write("Name: " + name + "\n");
        printWriter.write("Surame: " + surname + "\n");
        printWriter.write("Team: " + team + "\n");
        printWriter.write("Date: " + LocalDate.now() + "\n");
        printWriter.write("Time: " + LocalTime.now() + "\n");

    }
}
