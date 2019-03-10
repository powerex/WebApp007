package ua.azbest.servlet;

import ua.azbest.model.User;
import ua.azbest.util.Utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class AddUserServlet extends BaseServlet {

    private AtomicInteger id;

    @Override
    public void init() throws ServletException {
        super.init();
        id = new AtomicInteger(2);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        if (Utils.requestIsValid(req)) {

            final String name = req.getParameter("name");
            final String age = req.getParameter("age");

            final User user = new User();
            final int id = this.id.getAndIncrement();
            user.setId(id);
            user.setAge(Integer.valueOf(age));
            user.setName(name);

            users.put(id, user);
        }

        resp.sendRedirect(req.getContextPath() + "/");
    }
}
