package Tema5.CutreCloud;

public class ParseXMLTest {

    public static void printXML(ParseXML imprimible){
        System.out.println(imprimible.generateXML());
    }
    public static void main(String[] args) {
        Usuario u1 = new Usuario("kk@gmail.com", "blablabla");
        Media m1 = new Media("peli.avi", "sdfjlaksjdflkasjdf", MediaType.VIDEO, u1);

        printXML(u1);
        printXML(m1);
    }
}