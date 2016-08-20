import java.util.Scanner;

public class convertidor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double centimetros;
        double resultado;


        System.out.println("CENTIMEROS A PULGADAS");
        System.out.println("Ingrese los centimetros:");
        centimetros = leer.nextInt();
        resultado = centimetros/ 2.54;
        System.out.println("La respuesta es: " + resultado + " pulgadas");


    }
}
