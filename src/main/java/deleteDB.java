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
@WebServlet("/deleteDB")
public class deleteDB extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        DB db = new DB();
        db.delete();

        StringBuilder dbResp = new StringBuilder();

        dbResp.append(db.read());

        out.println(dbResp);

    }
}
