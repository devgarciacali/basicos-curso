package multis;
import java.util.Scanner;

public class Multis {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int number;
        
        System.out.println("INGRESE UN NUMERO: ");
        number = tecla.nextInt();   
        
        for(int i = 1; i <= 10; i++){
            System.out.println(number + "x" + i + "=" + (number * i));
        }
        
    }
}
