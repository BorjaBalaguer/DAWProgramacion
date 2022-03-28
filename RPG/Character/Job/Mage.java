package RPG.Character.Job;

import RPG.Character.Stat.*;

public class Mage extends Job{
    
    int resultado = 0;

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength){
            resultado = -4;
        }else if(stat instanceof Constitution){
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Mage";
    }
}
