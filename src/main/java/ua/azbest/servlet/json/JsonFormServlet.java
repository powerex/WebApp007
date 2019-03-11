package ua.azbest.servlet.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ua.azbest.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// {"id":1,"name":"Драгоманов","age":148}

public class JsonFormServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/view/json.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        final String data = req.getParameter("data");
        final User user = new ObjectMapper().readValue(data, User.class);

        logUser(user);
    }

    private void logUser(final User user) {
        System.out.println("User unmapping : " + user);
        System.out.println("Id\t\t: " + user.getId());
        System.out.println("Name\t: " + user.getName());
        System.out.println("Age\t: " + user.getAge());
    }

}
