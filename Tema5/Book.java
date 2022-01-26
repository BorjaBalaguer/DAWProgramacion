package Tema5;

public class Book {
    
    private String author;
    private String title;

    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    public int getPages() {
        return pages;
    }
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String author, String title, int pages, String refNumber, boolean courseText)
    {
        this.author = author;
        this.title = title;
        this.pages = pages; 
        this.refNumber = refNumber;
        this.courseText = courseText;
    }
    //1
    public String getAuthor() {
        return author;
    }
    //1
    public String getTitle() {
        return title;
    }
    //2
    public void printAuthor(){
        System.out.println(author);
    }
    //2
    public void printTitle(){
        System.out.println(title);
    }
    //4
    public void setRefNumber(String ref){
        if (ref.length() > 3) {
            this.refNumber = ref;
        }else{
            System.out.println("Eror con el codigo de referencia!");
        }
        
    }
    public String getRefNumber() {
        return refNumber;
    }
    //5
    public int getBorrowed() {
        return borrowed;
    }

    public void borrow() {
        this.borrowed++;
    }
    //6
    public boolean isCourseText() {
        return courseText;
    }
    //7
    public void printDetails(){
        System.out.println("Autor: " +  author);
        System.out.println("Titulo: " + title);
        System.out.println("Paginas: " + pages);
        System.out.println("Referencia: " + refNumber);
        System.out.println("Veces prestado: " + borrowed);
        if(courseText){
            System.out.println("Esta en algun curso: Si");
        }else{
            System.out.println("Esta en algun curso: No");
        }
        
    }


}