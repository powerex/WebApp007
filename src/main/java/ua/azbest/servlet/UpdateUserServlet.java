package ua.azbest.servlet;

import ua.azbest.model.User;
import ua.azbest.util.Utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateUserServlet extends BaseServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        req.setCharacterEncoding("UTF-8");

        final String id = req.getParameter("id");
        final String name = req.getParameter("name");

        final User user = users.get(Integer.parseInt(id));
        user.setName(name);

        resp.sendRedirect(req.getContextPath() + "/");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        final String id = req.getParameter("id");

        if (Utils.idIsInvalid(id, users)) {
            resp.sendRedirect(req.getContextPath() + "/");
            return;
        }

        final User user = users.get(Integer.parseInt(id));
        req.setAttribute("user", user);

        req.getRequestDispatcher("/WEB-INF/view/update.jsp")
                .forward(req, resp);
    }
}
