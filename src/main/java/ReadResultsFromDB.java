import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sebastian on 23.06.2016.
 */
@WebServlet("/readResultsFromDB")
public class ReadResultsFromDB extends HttpServlet{


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter htmlResponse = resp.getWriter();

        DB db = new DB();

        StringBuilder dbResp = new StringBuilder();

        dbResp.append(db.read());

        //server response
        htmlResponse.println(dbResp);
    }
}

