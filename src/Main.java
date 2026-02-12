import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Vamos a llamar la funcion
        condicionales();
    }

     static void condicionales(){
        Scanner input = new Scanner(System.in);
        int edad;

         System.out.println("ingrese su edad");
         edad = input.nextInt();

        if (edad >= 18){
           System.out.println("El edad es mayor a 18");
       }

    }
}