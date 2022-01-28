package Tema5;

public class HeaterTest {
    public static void main(String[] args) {
        Heater h1 = new Heater(11, 26);

        h1.setIncrement(4);
        h1.warmer();
        h1.warmer();
        h1.warmer();
        System.out.println(h1.getTemperature());
        h1.cooler();
        h1.cooler();
        System.out.println(h1.getTemperature());

    }
}
