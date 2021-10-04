import java.util.Scanner;
public class Ejemplo18 {
  public static void main(String[] args) {
    int segundosSuma, horasTotale, minutosTotales, segundosTotales, segundosRestantesHoras, segundosRestantesMinutos;
       
        System.out.println("Dame unas horas");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int horas = inputValue.nextInt();

        System.out.println("Dame unas horas");
        int minutos = inputValue.nextInt();

        System.out.println("Dame unas horas");
        int segundos = inputValue.nextInt();

        inputValue.close();

        segundosSuma = (1 + (horas * 3600) + (minutos * 60) + segundos);
        horasTotales = (segundosSuma/3600);
        segundosRestantes = horasTotales * 3600;
        minutosTotales = ((segundosSuma-segundosRestantes)/60);

  }
}
