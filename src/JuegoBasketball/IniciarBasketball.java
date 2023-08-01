package JuegoBasketball;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class IniciarBasketball {
    public static void empezarJuegoBasketball(){
        //Aqui definimos los jugadores y turnos
        Scanner sn=new Scanner(System.in);
        System.out.println("|****************************************************|");
        System.out.println("|   Por favor ingrese el nombre del jugador N.1:     |");
        String jugador1=sn.nextLine();
        System.out.println("|****************************************************|");
        System.out.println("|   Por favor ingrese el nombre del jugador N.2:     |");
        String jugador2=sn.nextLine();
        System.out.println("|****************************************************|");
        System.out.println("|   Por favor defina la cantidad de turnos           |");
        System.out.println("|   que tendra el partido:                           |");
        int turnosPartido=sn.nextInt();

        //Aqui definimos quien tira de primero
        String turno1;
        String turno2;
        int numero = 0;
        Random random = new Random();
        numero = random.nextInt(2);
        if (numero==0){
            turno1 = jugador1;
            turno2 = jugador2;
        }else {
            turno1 = jugador2;
            turno2 = jugador1;
        }
        System.out.println("|****************************************************|");
        System.out.println("|                                                    |");
        System.out.println("|                   P A R T I D O                    |");
        System.out.println("|                                                    |");
        System.out.println("|****************************************************|");
        System.out.println("    "+jugador1);
        System.out.println("                          VS                          ");
        System.out.println("                                        "+jugador2);
        System.out.println("|****************************************************|");
        System.out.println("    El jugador que empieza el partido es: "+turno1);
        System.out.println("    El partido contara con: "+turnosPartido+" turnos");
        System.out.println("|****************************************************|");

        //Aqui empieza el juego
        int contadorTurnos = 0;
        String ganador;
        int puntosTiroLargo = 3;
        int puntosTiroCorto = 2;
        int puntosTiroLibre = 2;
        int puntosTurno1 = 0;
        int puntosTurno2 = 0;

        do {

            boolean salirAtaqueTurno1 = false;
            int opcionTurno1;

            while (!salirAtaqueTurno1){

                System.out.println("|****************************************************|");
                System.out.println("   Jugador "+turno1+" seleccione una opcion: ");
                System.out.println("  1 - Tiro largo de 5 metros para 3 puntos.");
                System.out.println("  2 - Tiro corto de 3 metros para 2 puntos.");
                System.out.println("|****************************************************|");
                try {
                    System.out.println("|   Su selección es:                                 |");
                    opcionTurno1 = sn.nextInt();

                    switch (opcionTurno1){
                        case 1:
                            boolean salirDefensaTurno2 = false;
                            int opcionturno2;

                            while (!salirDefensaTurno2){

                                System.out.println("|****************************************************|");
                                System.out.println("   Jugador "+turno2+" seleccione una opcion: ");
                                System.out.println("  1 - Defensa cuerpo a cuerpo, posibilidad de falta baja.");
                                System.out.println("  2 - Defensa fuerte, posibilidad de falta alta");
                                System.out.println("|****************************************************|");

                                try {
                                    System.out.println("|   Su selección es:                                 |");
                                    opcionturno2 = sn.nextInt();

                                    switch (opcionturno2){
                                        case 1:
                                            int posibilidadFaltaCuerpo = 0;
                                            Random randomFaltaCuerpo = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaCuerpo.nextInt(100);
                                            if (posibilidadFaltaCuerpo <=34){
                                                System.out.println("   Falta!! Tiro libre para "+turno1);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("   Anoto!! Gano 2 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   No anoto.");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }

                                            salirDefensaTurno2 = true;
                                            break;
                                        case 2:
                                            int posibilidadFaltaFuerte = 0;
                                            Random randomFaltaFuerte = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaFuerte.nextInt(100);
                                            if (posibilidadFaltaFuerte <=64){
                                                System.out.println("   Falta!! Tiro libre para "+turno1);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("   Anoto!! Gano 2 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   No anoto.");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }
                                            salirDefensaTurno2 = true;
                                            break;
                                            default:
                                            System.out.println("las opciones son entre 1 y 2");
                                    }
                                }catch (InputMismatchException e){
                                    System.out.println("Debe de ser un numero");
                                    sn.next();

                                }

                            }
                            salirAtaqueTurno1 = true;
                            break;
                        case 2:
                            boolean salirDefensa2Turno2 = false;
                            int opcion2turno2;

                            while (!salirDefensa2Turno2){

                                System.out.println("|****************************************************|");
                                System.out.println("   Jugador "+turno2+" seleccione una opcion: ");
                                System.out.println("  1 - Defensa cuerpo a cuerpo, posibilidad de falta baja.");
                                System.out.println("  2 - Defensa fuerte, posibilidad de falta alta");
                                System.out.println("|****************************************************|");

                                try {
                                    System.out.println("|   Su selección es:                                 |");
                                    opcion2turno2 = sn.nextInt();

                                    switch (opcion2turno2){
                                        case 1:
                                            int posibilidadFaltaCuerpo = 0;
                                            Random randomFaltaCuerpo = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaCuerpo.nextInt(100);
                                            if (posibilidadFaltaCuerpo <=34){
                                                System.out.println("   Falta!! Tiro libre para "+turno1);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("   Anoto!! Gano 2 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   No anoto.");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }

                                            salirDefensa2Turno2 = true;
                                            break;
                                        case 2:
                                            int posibilidadFaltaFuerte = 0;
                                            Random randomFaltaFuerte = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaFuerte.nextInt(100);
                                            if (posibilidadFaltaFuerte <=64){
                                                System.out.println("   Falta!! Tiro libre para "+turno1);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("Anoto!! Gano 2 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("No anoto.");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno1 = puntosTurno1 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno1+" tiene: "+puntosTurno1+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }
                                            salirDefensa2Turno2 = true;
                                            break;
                                        default:
                                            System.out.println("las opciones son entre 1 y 2");
                                    }
                                }catch (InputMismatchException e){
                                    System.out.println("Debe de ser un numero");
                                    sn.next();

                                }

                            }
                            salirAtaqueTurno1 = true;
                            break;
                        default:
                            System.out.println("las opciones son entre 1 y 2");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Debe de ser un numero");
                    sn.next();

                }
            }


            boolean salirAtaqueTurno2 = false;
            int opcionTurno2;

            while (!salirAtaqueTurno2){

                System.out.println("|****************************************************|");
                System.out.println("   Jugador "+turno2+" seleccione una opcion: ");
                System.out.println("  1 - Tiro largo de 5 metros para 3 puntos.");
                System.out.println("  2 - Tiro corto de 3 metros para 2 puntos.");
                System.out.println("|****************************************************|");
                try {
                    System.out.println("|   Su selección es:                                 |");
                    opcionTurno2 = sn.nextInt();

                    switch (opcionTurno2){
                        case 1:
                            boolean salirDefensaTurno1 = false;
                            int opcionturno2;

                            while (!salirDefensaTurno1){

                                System.out.println("|****************************************************|");
                                System.out.println("   Jugador "+turno1+" seleccione una opcion: ");
                                System.out.println("  1 - Defensa cuerpo a cuerpo, posibilidad de falta baja.");
                                System.out.println("  2 - Defensa fuerte, posibilidad de falta alta");
                                System.out.println("|****************************************************|");

                                try {
                                    System.out.println("|   Su selección es:                                 |");
                                    opcionTurno2 = sn.nextInt();

                                    switch (opcionTurno2){
                                        case 1:
                                            int posibilidadFaltaCuerpo = 0;
                                            Random randomFaltaCuerpo = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaCuerpo.nextInt(100);
                                            if (posibilidadFaltaCuerpo <=34){
                                                System.out.println("   Falta!! Tiro libre para "+turno2);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("   Anoto!! Gano 2 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   No anoto.");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }

                                            salirDefensaTurno1 = true;
                                            break;
                                        case 2:
                                            int posibilidadFaltaFuerte = 0;
                                            Random randomFaltaFuerte = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaFuerte.nextInt(100);
                                            if (posibilidadFaltaFuerte <=64){
                                                System.out.println("   Falta!! Tiro libre para "+turno2);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("   Anoto!! Gano 2 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   No anoto.");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }
                                            salirDefensaTurno1 = true;
                                            break;
                                        default:
                                            System.out.println("las opciones son entre 1 y 2");
                                    }
                                }catch (InputMismatchException e){
                                    System.out.println("Debe de ser un numero");
                                    sn.next();

                                }

                            }
                            salirAtaqueTurno2 = true;
                            break;
                        case 2:
                            boolean salirDefensa2Turno1 = false;
                            int opcion2turno1;

                            while (!salirDefensa2Turno1){

                                System.out.println("|****************************************************|");
                                System.out.println("   Jugador "+turno1+" seleccione una opcion: ");
                                System.out.println("  1 - Defensa cuerpo a cuerpo, posibilidad de falta baja.");
                                System.out.println("  2 - Defensa fuerte, posibilidad de falta alta");
                                System.out.println("|****************************************************|");

                                try {
                                    System.out.println("|   Su selección es:                                 |");
                                    opcion2turno1 = sn.nextInt();

                                    switch (opcion2turno1){
                                        case 1:
                                            int posibilidadFaltaCuerpo = 0;
                                            Random randomFaltaCuerpo = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaCuerpo.nextInt(100);
                                            if (posibilidadFaltaCuerpo <=34){
                                                System.out.println("   Falta!! Tiro libre para "+turno2);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("   Anoto!! Gano 2 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   No anoto.");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }

                                            salirDefensa2Turno1 = true;
                                            break;
                                        case 2:
                                            int posibilidadFaltaFuerte = 0;
                                            Random randomFaltaFuerte = new Random();
                                            posibilidadFaltaCuerpo=randomFaltaFuerte.nextInt(100);
                                            if (posibilidadFaltaFuerte <=64){
                                                System.out.println("   Falta!! Tiro libre para "+turno2);
                                                int posibilidadTiroLibre = 0;
                                                Random randomTiroLibre = new Random();
                                                posibilidadTiroLibre=randomTiroLibre.nextInt(100);
                                                if (posibilidadTiroLibre<=89){
                                                    System.out.println("   Anoto!! Gano 2 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLibre;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   No anoto.");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }else {
                                                int posibilidadTiroLargo = 0;
                                                Random randomTiroLargo = new Random();
                                                posibilidadTiroLargo= randomTiroLargo.nextInt(100);
                                                if (posibilidadTiroLargo<=49){
                                                    System.out.println("   Anoto!! Gano 3 puntos");
                                                    puntosTurno2 = puntosTurno2 + puntosTiroLargo;
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }else {
                                                    System.out.println("   Defendio!! ");
                                                    System.out.println("   Jugador "+turno2+" tiene: "+puntosTurno2+" puntos.");
                                                    System.out.println("|****************************************************|");
                                                }
                                            }
                                            salirDefensa2Turno1 = true;
                                            break;
                                        default:
                                            System.out.println("las opciones son entre 1 y 2");
                                    }
                                }catch (InputMismatchException e){
                                    System.out.println("Debe de ser un numero");
                                    sn.next();

                                }

                            }
                            salirAtaqueTurno2 = true;
                            break;
                        default:
                            System.out.println("las opciones son entre 1 y 2");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Debe de ser un numero");
                    sn.next();

                }
            }


            contadorTurnos++;
        }while (!(contadorTurnos==turnosPartido));
        if(puntosTurno1 > puntosTurno2){
            System.out.println("|****************************************************|");
            System.out.println("|                                                    |");
            System.out.println("|                   G A N A D O R                    |");
            System.out.println("|                                                    |");
            System.out.println("|****************************************************|");
            System.out.println("|                                                    |");
            System.out.println("                        "+turno1);
            System.out.println("                     Con "+puntosTurno1+" puntos.");
            System.out.println("|                                                    |");
            System.out.println("|****************************************************|");
    }else{
            if(puntosTurno1==puntosTurno2){
                System.out.println("|****************************************************|");
                System.out.println("|                                                    |");
                System.out.println("|                   E M P A T E                      |");
                System.out.println("|                                                    |");
                System.out.println("|****************************************************|");
                System.out.println("    "+jugador1);
                System.out.println("                          VS                          ");
                System.out.println("                                        "+jugador2);
                System.out.println("               Ambos con "+puntosTurno1+" puntos.");
                System.out.println("|****************************************************|");
            }else{
                System.out.println("|****************************************************|");
                System.out.println("|                                                    |");
                System.out.println("|                   G A N A D O R                    |");
                System.out.println("|                                                    |");
                System.out.println("|****************************************************|");
                System.out.println("|                                                    |");
                System.out.println("                        "+turno2);
                System.out.println("                     Con "+puntosTurno2+" puntos.");
                System.out.println("|                                                    |");
                System.out.println("|****************************************************|");
            }
        }
    }
}

