package cambio;
import java.util.Scanner;


public class Cambio {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int number;
        float dolar, cambio;
        
        System.out.println("CUANTOS DOLARES DESEA CAMBIAR?");
        number = tecla.nextInt();
        
        System.out.println("CUANTO VALE EL DOLAR ACTUALMENTE: ");
        dolar = tecla.nextFloat();
        
        cambio = (number * dolar);
        System.out.println("SU CAMBIO ES: " + cambio);
    }    
}
