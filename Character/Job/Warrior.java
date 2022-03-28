package Character.Job;

import Character.Stat.*;

public class Warrior extends Job{

    int resultado = 0;

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength){
            resultado = 3;
        }else if(stat instanceof Constitution){
            resultado = 2;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Warrior";
    }
}