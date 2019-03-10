package ua.azbest.servlet;

import ua.azbest.util.Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteUserServlet extends BaseServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        req.setCharacterEncoding("UTF-8");

        if (Utils.idIsNumber(req)) {
            users.remove(Integer.valueOf(req.getParameter("id")));
        }

        resp.sendRedirect(req.getContextPath() + "/");
    }
}
