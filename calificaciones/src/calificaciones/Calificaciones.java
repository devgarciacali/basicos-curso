package calificaciones;
import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        float a, b, c ,d, promedio;
        
        
        System.out.println("DAME LA CALIFICACION NUMERO 1: ");
        a = tecla.nextFloat();
        System.out.println("DAME LA CALIFICACION NUMERO 2: ");
        b = tecla.nextFloat();
        System.out.println("DAME LA CALIFICACION NUMERO 3: ");
        c = tecla.nextFloat();
        System.out.println("DAME LA CALIFICACION NUMERO 4: ");
        d = tecla.nextFloat();
        
        promedio = (a + b + c + d) / 4;
        
        System.out.println("SU CALIFICACION ES: " + promedio);
        
        if(promedio >= 6.5 ){
            System.out.println("APROBADO");
        }else{
            System.out.println("REPROBADO");
        }
    }
    
}
