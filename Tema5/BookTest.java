package Tema5;

public class BookTest {
    public static void main(String[] args) {
        Book b1, b2;

        b1 = new Book("Jose Manuel", "Oxford", 222, "", true);
        
        b1.getRefNumber();
        b1.setRefNumber("1k2f");
        b1.getRefNumber();
        b1.borrow();
        b1.printDetails();
       
    }
}
