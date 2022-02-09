package Tema5.Mail;

import javax.security.auth.Subject;

public class MailClient {
     // The server used for sending and receiving.
     private MailServer server;
     // The user running this client.
     private String user;
 
     /**
      * Create a mail client run by user and attached to the given server.
      */
     public MailClient(MailServer server, String user)
     {
         this.server = server;
         this.user = user;
     }
 
     /**
      * Return the next mail item (if any) for this user.
      */
     public MailItem getNextMailItem()
     {
         return server.getNextMailItem(user);
     }
 
     /**
      * Print the next mail item (if any) for this user to the text 
      * terminal.
      */
     public void printNextMailItem()
     {
         MailItem item = server.getNextMailItem(user);
         if(item == null) {
             System.out.println("No new mail.");
         }
         else {
             item.print();
         }
     }
 
     /**
      * Send the given message to the given recipient via
      * the attached mail server.
      *  The intended recipient.
      *  The text of the message to be sent.
      */
     public void sendMailItem(String to, String subject, String message)
     {
        String[] nombres = to.split(";");

        for (String nombre : nombres) {
            MailItem item = new MailItem(user, nombre, subject, message);
            server.post(item);
            System.out.println("Correo enviado a " + nombre);
        }
        
     }

     public void forwardLastMailItem(String forwardTo){
         
        MailItem item = server.getNextMailItem(user);
         
        if(item == null) {
            System.out.println("No new mail to forward.");
        }
        else {
            item.print();
            MailItem nuevo = new MailItem(item.getFrom(),forwardTo,item.getSubject(),item.getMessage());
            server.post(item);
        }
     }
}
