package Tema5;

public class ClockDisplayTest {
    public static void main(String[] args) {
        ClockDisplay reloj;
        reloj = new ClockDisplay(23, 59, 59);
    
        reloj.timeTick();
        reloj.getTime();
    
    }
}
