import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el edad: ");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("usted puede votar: " + nombre);
        }else{
            System.out.println("usted no puede votar: " + nombre);
        }
    }
}