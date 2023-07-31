package JuegoBasketball;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuBasketball {
    public static void menuJuegoBasketball(){

        Scanner sn=new Scanner(System.in);

        boolean salir = false;
        int opcion;

        while (!salir){

            System.out.println("|****************************************************|");
            System.out.println("|                                                    |");
            System.out.println("|                B I E N V E N I D O                 |");
            System.out.println("|                  A L   J U E G O                   |");
            System.out.println("|                B A S K E T B A L L                 |");
            System.out.println("|                                                    |");
            System.out.println("|   El juego es de 2 jugadores,                      |");
            System.out.println("|   A continuación elija una opcion:                 |");
            System.out.println("|                                                    |");
            System.out.println("|   1 - Empezar juego.                               |");
            System.out.println("|   2 - Regresar al menú general.                    |");
            System.out.println("|                                                    |");
            System.out.println("|****************************************************|");

            try {
                System.out.println("|   Su selección es:                                 |");
                opcion = sn.nextInt();

                switch (opcion){
                    case 1:
                        OpcionJugarBasket();
                        break;
                    case 2:
                        System.out.println("Regresando al menu General.");
                        salir=true;
                        break;
                    default:
                        System.out.println("las opciones son entre 1 y 2");
                }
            }catch (InputMismatchException e){
                System.out.println("Debe de ser un numero");
                sn.next();

            }

        }
    }
    public static void OpcionJugarBasket(){
        IniciarBasketball inicarBasketball = new IniciarBasketball();
        inicarBasketball.empezarJuegoBasketball();
    }
}
