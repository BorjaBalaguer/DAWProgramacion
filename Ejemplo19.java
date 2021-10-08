import java.util.Scanner;
public class Ejemplo19 {
    public static void main(String[] args) {
        int horas, horasExtras;
        double precioH, pagoBruto, pagoNeto, impuestos;

        System.out.println("Dame el precio por hora");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        precioH = inputValue.nextDouble();
        
        System.out.println("Dame el numero de horas");
        horas = inputValue.nextInt();

        inputValue.close();
        
        if(horas <= 35){
            pagoBruto = horas * precioH;
        }else{
            horasExtras = horas - 35;
            pagoBruto = (((precioH * 1.5) * horasExtras) + (precioH * 35));     
        }

            if(pagoBruto <= 500){
                pagoNeto = pagoBruto;
            }else if(pagoBruto <= 900){
                pagoNeto = pagoBruto * 0.75;
            }else{
                pagoNeto = pagoBruto * 0.55;
            }
            
            impuestos = pagoBruto - pagoNeto;

            System.out.println("----------------------------");
            System.out.println("Pago neto: " + pagoNeto);
            System.out.println("Pago bruto: " + pagoBruto);
            System.out.println("Impustos: " + impuestos);

    }
}
