<%-- 
    Document   : Contact
    Created on : Oct 9, 2013, 4:08:19 PM
    Author     : emilbogren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us!</title>
    </head>
    <body>
        <div class="container">
        <div class="row">
            <div class="col-lg-6 col-offset-3">
                
                <h1>Contact Us!</h1>
                <form action="EmailSendingServlet" method="post">
                    <table border="0" width="35%" align="center">
                        <caption><h2>Fill in form</h2></caption>
                        <tr>
                            <td width="50%">Your email </td>
                            <td><input type="text" name="fromAddress" size="50"/></td>
                        </tr>
                        <tr>
                            <td>Subject </td>
                            <td><input type="text" name="subject" size="50"/></td>
                        </tr>
                        <tr>
                            <td>Content </td>
                            <td><textarea rows="10" cols="39" name="content"></textarea></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><input type="submit" value="Send"/></td>
                        </tr>
                    </table>
                    
                </form>
            </div>
        </div>
    </div>
</body>
</html>
