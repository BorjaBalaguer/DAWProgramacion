import java.util.Scanner;

public class Ejemplo17 {
    
    public static void main(String[] args) {
        
        String mes;

        System.out.println("Dame un mes:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        mes = inputValue.nextLine();

        inputValue.close();

        switch (mes) {
            case ("Enero"):
                System.out.println("31 días");
                break;

            case "Febrero":
                System.out.println("28 días o 29 si el año fuera bisiesto");
                break;

            case "Marzo":
                System.out.println("31 días");
                break;

            case "Abril":
                System.out.println("30 días");
                break;

            case "Mayo":
                System.out.println("31 días");
                break;

            case "Junio":
                System.out.println("30 días");
                break;

            case "Julio":
                System.out.println("31 días");
                break;

            case "Agosto":
                System.out.println("31 días");
                break;

            case "Septiembre":
                System.out.println("30 días");
                break;

            case "Octubre":
                System.out.println("31 días");
                break;
            case "Noviembre":
                System.out.println("30 días");
                break;

            case "Diciembre":
                System.out.println("31 días");
                break;

            default:
                System.out.println("Dame un numero del 1 al 10!"); 
                break;
        }
    }
}
