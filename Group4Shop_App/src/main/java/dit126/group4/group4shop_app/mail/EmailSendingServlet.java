/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.mail;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emilbogren
 */
@WebServlet("/EmailSendingServlet")
public class EmailSendingServlet extends HttpServlet {
    private String host;
    private String port;
    private String user;
    private String pass;
    
    private String recipient = "info@emilbogren.se";
 
    /*private String name;
    private String email;
    private String message;*/
   
    
    @Override
    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
        System.out.println("Emil test" + host + port + user + pass + "32");
    }
 
    
    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // reads form fields
        String from = request.getParameter("fromAddress");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");
 
        String resultMessage = "";
 
        try {
            EmailUtility.sendEmail(host, port, user, pass, recipient, from, subject,
                    content);
            resultMessage = "The e-mail was sent successfully";
        } catch (Exception ex) {
            resultMessage = "There were an error: " + ex.getMessage();
        } finally {
            /*request.setAttribute("Message", resultMessage);
            getServletContext().getRequestDispatcher("content/ResultPage.jsp").forward(
                    request, response);*/
        }
    }
    
}
