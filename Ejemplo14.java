import java.util.Scanner;
public class Ejemplo14 {

    public static void main(String[] args) {
        double nota;

        System.out.println("Cual es tu nota del examen?");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        nota = inputValue.nextDouble();

        if (nota < 3){
            System.out.println("Muy deficiente");
        }else if (nota < 5){
            System.out.println("Insuficiente");
        }else if(nota < 6){
            System.out.println("Suficiente");
        }else if(nota < 7){
            System.out.println("Bien");
        }else if(nota < 9){
            System.out.println("Notable");
        }else if(nota <= 10){
            System.out.println("Sobresaliente");
        }else {
            System.out.println("Pon una nota entre el rango 0-10.");
        }
        inputValue.close();
    }
}