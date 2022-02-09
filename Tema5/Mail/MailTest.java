package Tema5.Mail;

public class MailTest {
    public static void main(String[] args) {
    MailServer m1 = new MailServer();
    MailClient m2 = new MailClient(m1, "Borja");
    
    System.out.println(m1.howManyMailItems("Pepito"));

    m2.sendMailItem("Pepito;Jose;Pedro", "Holaaaa", "Bla bla bla bla bla");
    
    System.out.println(m1.howManyMailItems("Borja"));

    } 
}