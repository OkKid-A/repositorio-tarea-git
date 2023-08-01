import JuegoDeAhorcado.MenuAhorcado;
import JuegoBasketball.MenuBasketball;
import JuegoDeCartas.MenuCartas;

import java.util.InputMismatchException;
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
            System.out.println("|   Hecho por 201830233 y 202031398.                 |");
            System.out.println("|                                                    |");
            System.out.println("|****************************************************|");

            try {
                System.out.println("|   Su selección es:                                 |");
                opcion = sn.nextInt();

                switch (opcion){
                    case 1:
                        OpcionAhorcado();
                        break;
                    case 2:
                        OpcionBasketball();
                        break;
                    case 3:
                        OpcionCartas();
                        break;
                    case 4:
                        salir=true;
                        break;
                    default:
                        System.out.println("las opciones son entre 1 y 4");
                }
            }catch (InputMismatchException e){
                System.out.println("Debe de ser un numero");
                sn.next();

                }

            }

        }
    static void OpcionAhorcado(){
        MenuAhorcado MAhorcado = new MenuAhorcado();
        MAhorcado.menuJuegoAhorcado();
    }
    static void OpcionBasketball(){
        MenuBasketball MBasketball = new MenuBasketball();
        MBasketball.menuJuegoBasketball();
    }static void OpcionCartas(){
        MenuCartas MCartas = new MenuCartas();
        MCartas.menuJuegoCartas();
    }
}
