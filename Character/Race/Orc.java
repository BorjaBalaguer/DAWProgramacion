package Character.Race;
import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Orc extends Race{

    int resultado = 0;

    @Override
    public int modifier(Stat stat) {
        
        //Para saber que el tipo de stat puedes usar instanceof
        if (stat instanceof Strength){
            resultado = 5;
        }else if(stat instanceof Constitution){
            resultado = 3;
        }else if(stat instanceof Intelligence){
            resultado = -3;
        }
        return resultado;
    }

    
}
