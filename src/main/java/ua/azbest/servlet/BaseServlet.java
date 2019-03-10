package ua.azbest.servlet;

import ua.azbest.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class BaseServlet extends HttpServlet {

    Map<Integer, User> users;

    @Override
    public void init() throws ServletException {
        final Object users = getServletContext().getAttribute("users");
        if (users == null || !(users instanceof ConcurrentHashMap)) {
            throw new IllegalStateException("You're repo does not initialize!");
        } else {
            this.users = (ConcurrentHashMap<Integer, User>) users;
        }
    }

}
