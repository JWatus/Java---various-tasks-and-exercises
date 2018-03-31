package com.infoshareacademy.web;

import com.infoshareacademy.dao.ProductDao;
import com.infoshareacademy.model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    private Logger LOG = LoggerFactory.getLogger(ProductServlet.class);

    @Inject
    private ProductDao productDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final String action = req.getParameter("action");
        LOG.info("Requested action: {}", action);
        if (action == null || action.isEmpty()) {
            resp.getWriter().write("Empty action parameter.");
            return;
        }

        if (action.equals("FindAll")) {
            FindAll(req, resp);
        } else if (action.equals("FindAllReversed")) {
            FindAllReversed(req, resp);
        } else if (action.equals("FindAllByName")) {
            FindAllByName(req, resp);
        } else if (action.equals("FindAllByQuantity")) {
            FindAllByQuantity(req, resp);
        } else if (action.equals("Add")) {
            AddProduct(req, resp);
        } else if (action.equals("Delete")) {
            DeleteProduct(req, resp);
        } else if (action.equals("Update")) {
            UpdateProduct(req, resp);
        } else {
            resp.getWriter().write("Unknown action.");
        }
    }

    private void UpdateProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final Long id = Long.parseLong(req.getParameter("id"));
        LOG.info("Updating Product with id = {}", id);

        final Product existingProduct = productDao.findById(id);

        if (existingProduct == null) {
            LOG.info("No Product found for id = {}, nothing to be updated", id);
        } else {

            existingProduct.setName(req.getParameter("name"));
            existingProduct.setQuantity(Integer.parseInt(req.getParameter("quantity")));

            productDao.update(existingProduct);
            LOG.info("Product object updated: {}", existingProduct);
        }

        FindAll(req, resp);
    }

    private void AddProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final Product p = new Product();
        p.setName(req.getParameter("name"));
        p.setQuantity(Integer.parseInt(req.getParameter("quantity")));

        productDao.save(p);
        LOG.info("Saved a new Product object: {}", p);

        FindAll(req, resp);
    }

    private void DeleteProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final Long id = Long.parseLong(req.getParameter("id"));
        LOG.info("Removing Product with id = {}", id);

        productDao.delete(id);

        FindAll(req, resp);
    }

    private void FindAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final List<Product> result = productDao.findAll();
        LOG.info("Found {} objects", result.size());

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html>");
        printWriter.write("<body>");
        printWriter.write("<form method=\"get\" action=\"/shopping_list.html\">");
        printWriter.write("<input type=\"submit\" value=\"Go back to shop\"/>");
        printWriter.write("</br>");
        printWriter.write("</br>");
        printWriter.write("</form>");

        for (Product p : result) {
            resp.getWriter().write(p.toString() + "<br/><br/>");
        }

        printWriter.write("</body>");
        printWriter.write("</html>");
    }

    private void FindAllReversed(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        final List<Product> result = productDao.findAllReversed();
        LOG.info("Found {} objects", result.size());

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html>");
        printWriter.write("<body>");
        printWriter.write("<form method=\"get\" action=\"/shopping_list.html\">");
        printWriter.write("<input type=\"submit\" value=\"Go back to shop\"/>");
        printWriter.write("</br>");
        printWriter.write("</br>");
        printWriter.write("</form>");

        for (Product p : result) {
            resp.getWriter().write(p.toString() + "<br/><br/>");
        }

        printWriter.write("</body>");
        printWriter.write("</html>");
    }

    private void FindAllByName(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final List<Product> result = productDao.findAllByName();
        LOG.info("Found {} objects", result.size());

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html>");
        printWriter.write("<body>");
        printWriter.write("<form method=\"get\" action=\"/shopping_list.html\">");
        printWriter.write("<input type=\"submit\" value=\"Go back to shop\"/>");
        printWriter.write("</br>");
        printWriter.write("</br>");
        printWriter.write("</form>");

        for (Product p : result) {
            resp.getWriter().write(p.toString() + "<br/><br/>");
        }

        printWriter.write("</body>");
        printWriter.write("</html>");
    }

    private void FindAllByQuantity(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        final List<Product> result = productDao.findAllByQuantity();
        LOG.info("Found {} objects", result.size());

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html>");
        printWriter.write("<body>");
        printWriter.write("<form method=\"get\" action=\"/shopping_list.html\">");
        printWriter.write("<input type=\"submit\" value=\"Go back to shop\"/>");
        printWriter.write("</br>");
        printWriter.write("</br>");
        printWriter.write("</form>");

        for (Product p : result) {
            resp.getWriter().write(p.toString() + "<br/><br/>");
        }

        printWriter.write("</body>");
        printWriter.write("</html>");
    }
}
