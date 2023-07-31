import Herramientas.Lector;

import java.util.Scanner;

public class MenuPrincipal {



    public static void menuJuegos(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("|****************************************************|");
            System.out.println("|                                                    |");
            System.out.println("|                B I E N V E N I D O                 |");
            System.out.println("|                                                    |");
            System.out.println("|   Por favor seleccione un opcion a continuación,   |");
            System.out.println("|                                                    |");
            System.out.println("|   1 - Juego de Ahorcado.                           |");
            System.out.println("|   2 - Juego de Basketball.                         |");
            System.out.println("|   3 - Juego de Cartas.                             |");
            System.out.println("|                                                    |");
            System.out.println("|   4 - Salir.                                       |");
            System.out.println("|                                                    |");
            System.out.println("|   Hecho por 201830233.                             |");
            System.out.println("|                                                    |");
            System.out.println("|****************************************************|");

            System.out.println("|   Su selección es:                                 |");
            opcion = sn.nextInt();

        }


    }
}
