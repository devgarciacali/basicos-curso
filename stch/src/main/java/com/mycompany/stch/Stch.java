package com.mycompany.stch;
import java.util.Scanner;

public class Stch {

    public static void main(String[] args) {
        //SWITCH DIA DE LAS SEMANAS SI ESCRIBE ALGUN OTRO NUMERO MANDE ERROR!
        Scanner tecla = new Scanner(System.in);
        int opcion;
        System.out.println("1-LUNES\n2-MARTES\n3-MIERCOLES\n4-JUEVES\n5-VIERNES\n6-SABADO\n7-DOMINGO\n");
        System.out.println("DIJITE NUMERO DEL 1-7: ");
        opcion = tecla.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;  
            default:
                System.out.println("EEROR OPCION NO EXISTE EN MENU");
                break;
        }
    }
}
