import java.util.Scanner;
public class Ejemplo18 {
  public static void main(String[] args) {
    int horasTotales, minutosTotales, segundosTotales, segundosRestantesHoras, segundosRestantesMinutos;
    Scanner inputValue = new Scanner(System.in);
    
        //Aqui llamamos al scanner para poder guardar tres valores.
        System.out.println("Dame unas horas");
        int horas = inputValue.nextInt();
        
        System.out.println("Dame unos minutos");
        int minutos = inputValue.nextInt();

        System.out.println("Dame unos segundos");
        int segundos = inputValue.nextInt();

        inputValue.close();
       
        //Ahora pondremos unas condiciones para no poder poner valores superiores
        if(horas < 24){
            if(minutos < 60){
              //He puesto todos los calculos en el tercer if, para si la primera condicion esta mal, no gastar recursos.
              if(segundos < 60){
              //Aqui sacamos todos los segundos de los valores dados por el usuario mas el que le añadimos.
                segundosTotales = (1 + (horas * 3600) + (minutos * 60) + segundos);
              //Primero sacaremos todas las horas
                horasTotales = (segundosTotales/3600);
              //Los segundos restantes los guardaremos en la variable "SegundosRestantesHoras"
                segundosRestantesHoras = horasTotales * 3600;
              //Con esos segundo restantes sacaremos los minutos
                minutosTotales = ((segundosTotales-segundosRestantesHoras)/60);
              //Y finalmente sacaremos los segundos restantes de los minutos
                segundosRestantesMinutos = ((segundosTotales-segundosRestantesHoras) - minutosTotales*60);
                System.out.println(horasTotales + ":" + minutosTotales + ":" + segundosRestantesMinutos);
              }else{
              System.out.println("Dame unos valores correctos, no puedes dar mas de 23h,59m,59s");
              }
            }else{
                System.out.println("Dame unos valores correctos, no puedes dar mas de 23h,59m,59s");
            }
        }else{
          System.out.println("Dame unos valores correctos, no puedes dar mas de 23h,59m,59s");
             
        }
        
  }
}