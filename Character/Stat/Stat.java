package Character.Stat;

public class Stat {
    public int value;

    
    public Stat(int value) {
        this.value = value;
    }

    //Devuelve el valor actual de la característica
    public int getValue(){
        return value;
    }

    //Aumenta el valor de la carecterística en 1
    public void increase(){
        value += 1;
    }

    //Disminuye el valor de la característica en 1
    public void decrease(){
        value -= 1;
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
        return "Value" + value;
    }
}