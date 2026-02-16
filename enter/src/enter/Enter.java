package enter;

import java.util.Scanner;

public class Enter {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        boolean respuesta = true;

        while (respuesta) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("TABLA DEL: " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + "x" + j + "=" + (i * j));
                }
                System.out.println("Presione enter para continuar...");
                tecla.nextLine();
            }
        }
    }
}
