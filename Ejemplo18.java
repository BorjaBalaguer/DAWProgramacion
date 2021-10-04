import java.util.Scanner;
public class Ejemplo18 {
  public static void main(String[] args) {
    int horasTotales, minutosTotales, segundosTotales, segundosRestantesHoras, segundosRestantesMinutos;
       
        System.out.println("Dame unas horas");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int horas = inputValue.nextInt();

        System.out.println("Dame unos minutos");
        int minutos = inputValue.nextInt();

        System.out.println("Dame unos segundos");
        int segundos = inputValue.nextInt();

        inputValue.close();

        segundosTotales = (1 + (horas * 3600) + (minutos * 60) + segundos);
        horasTotales = (segundosTotales/3600);
        segundosRestantesHoras = horasTotales * 3600;
        minutosTotales = ((segundosTotales-segundosRestantesHoras)/60);
        segundosRestantesMinutos = ((segundosTotales-segundosRestantesHoras) - minutosTotales*60);
        System.out.println(horasTotales + ":" + minutosTotales + ":" + segundosRestantesMinutos);
  }
}
