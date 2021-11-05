import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        int horaActual = 0, sumaHora = 0, horaFinal = 0, numeroRestar = 0;
        Scanner lector = new Scanner(System.in);

        System.out.print("Hora actual: ");
        horaActual = lector.nextInt();

        System.out.print("Cantidad de horas: ");
        sumaHora = lector.nextInt();

        horaFinal = horaActual + sumaHora;

        if (horaFinal < 25) {
            System.out.println("En " + sumaHora + " horas, el reloj marcara las " + horaFinal);
        }else{
            //Aqui calculo las veces que se pasa la hora fianl de 24
            numeroRestar = horaFinal/24;
            //Para despues restarselo a la hora final
            horaFinal -= 24 * numeroRestar;
            System.out.println("En " + sumaHora + " horas, el reloj marcara las " + horaFinal);
        }
        lector.close();
    }
}
