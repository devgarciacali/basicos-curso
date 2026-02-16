package sumadenumbers;
//LIBRERIA PARA QUE EL USUARIO MANDE DATOS POR TECLADO
import java.util.Scanner;

public class Sumadenumbers {

    public static void main(String[] args) {
     
        Scanner tecla = new Scanner(System.in);
        double number1, number2;
        
        System.out.println("Dame primer numero:");
        number1 = tecla.nextDouble();
        
        System.out.println("Dame segundo numero:");
        number2 = tecla.nextDouble();
       
        System.out.println("El resultado es: " + (number1 + number2));
        
    }
}
