/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author HP
 */
public class SendMailConfirm {

    public static void send(String to, String sub,
            String msg, final String user, final String pass) {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.allow8bitmime", "true");
        props.put("mail.smtps.allow8bitmime", "true");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setContent(msg, "text/html; charset=UTF-8");
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void SendMailConfirm(String email, String FullName) {
        String subject = "[Reservation Successfully]";
        String code = "http://localhost:8080/ChildrenCare_SWP391/submitreservation";
        String fromEmail = "leemuld10@gmail.com";
        String password = "levu050721";
        String message = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n "
                + "\n"
                + "<head>\n "
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<h3 style=\"color: orange;\">Xin ch??o " + FullName + " !</h3>\n"
                + "<div>C???m ??n b???n ???? tin t?????ng ?????t d???ch v??? ??? trang web ch??ng t??i </div>"
                + "<div> ????? x??c nh???n l???ch ?????t ch???, b???n vui l??ng nh???n v??o link sau ????y: <a href=\"" + code + "\">Nh???n v??o ????y!</a></div>\n"
                + "<div>Th?? n??y ???????c t???o ra t??? ?????ng.</div>\n"
                + "<div>N???u b???n c???n tr??? gi??p ho???c c?? c??u h???i, h??y g???i email ?????n ChildrenCare@gmail.com b???t c??? l??c n??o.</div>\n"
                + "<h3 style=\"color: orange;\">Tr??n tr???ng!</h3>\n"
                + "\n"
                + "</body>\n"
                + "\n"
                + "</html>";
        SendMailConfirm.send(email, subject, message, fromEmail, password);
        
        
    }
}
