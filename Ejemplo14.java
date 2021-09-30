import java.util.Scanner;
public class Ejemplo14 {

    public static void main(String[] args) {
        int nota;
        int l = 0;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;

        System.out.println("Cual es tu nota del examen?");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        nota = inputValue.nextInt();

        if (nota == l){
            System.out.println("Muy deficiente");
        }else if (nota == a){
            System.out.println("Muy deficiente");
        }else if(nota == b){
            System.out.println("Muy deficiente");
        }else if(nota == c){
            System.out.println("Insuficiente");
        }else if(nota == d){
            System.out.println("Insuficiente");
        }else if(nota == e){
            System.out.println("Suficiente");
        }else if(nota == f){
            System.out.println("Bien");
        }else if(nota == g){
            System.out.println("Notable");
        }else if(nota == h){
            System.out.println("Notable");
        }else if(nota == i){
            System.out.println("Sobresaliente");
        }else if(nota == j){
            System.out.println("Muy deficiente");
        }else {
            System.out.println("Pon una nota entre el rango 0-10.");
        }


        inputValue.close();
    }
}