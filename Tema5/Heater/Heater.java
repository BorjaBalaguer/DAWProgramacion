package Tema5.Heater;

public class Heater {

    private double temperature ;
    private double min ;
    private double max ;
    private double increment;



    public Heater(double min, double max){
        this.temperature = 15.0;
        this.min = min;
        this.max = max;
        this.increment = 5.0;
    }

    public void setIncrement(double increment) {
        if (increment >= 1.0 && increment <= 5.0) {
            this.increment = increment;
        }    
    }

    public double getTemperature() {
        return temperature;
    }

    public void warmer() {
        if ((this.temperature + this.increment) <= max) {
            this.temperature += this.increment;
        }
    }

    public void cooler() {
        if ((this.temperature - this.increment) >= min) {
            this.temperature -= this.increment;
        }
    }


}
