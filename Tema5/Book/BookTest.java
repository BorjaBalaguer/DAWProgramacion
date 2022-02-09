package Tema5.Book;

public class BookTest {
    public static void main(String[] args) {
        Book b1;

        b1 = new Book("Jose Manuel", "Oxford", 222, "", true);
        
        b1.getRefNumber();
        b1.setRefNumber("1K2F");
        b1.getRefNumber();
        b1.borrow();
        b1.printDetails();
       
    }
}
