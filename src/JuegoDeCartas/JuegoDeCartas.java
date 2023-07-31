package JuegoDeCartas;

import Herramientas.Lector;

import java.awt.*;

public class JuegoDeCartas {

    private Casino casino;
    private Dibujante dibujante;
    private Lector lector;
    private int dinero;
    private int carta1;
    private int carta2;
    private int cartaJugador;


    public JuegoDeCartas(){
        this.dibujante = new Dibujante();
        this.casino = new Casino();
        this.lector = new Lector();
        this.dinero = 0;
        iniciarJuego();
    }

    public void iniciarJuego(){
        dinero = lector.getDigitMin("Cuanto dinero tendra el jugador?", 151);
        System.out.println("Empezando el juego:");
        barajar();
    }

    public void barajar(){
        System.out.println("Barajando...");
        carta1 = casino.producirValorAzar();
        carta2 = casino.producirValorAzar();
        dibujante.dibujarCarta(dibujante.traducirRandom(carta1));
        dibujante.dibujarCarta(dibujante.traducirRandom(carta2));
        apostar();
    }

    public void apostar(){
        int siApuesta = lector.getDigit("Deseas apostar? \n 1. Si \n 2. No" ,2);
        if (siApuesta == 1){
            cartaJugador = casino.producirValorAzar();
            System.out.println("Tu carta es:");
            dibujante.dibujarCarta(dibujante.traducirRandom(cartaJugador));
            casino.ordernarCartas(carta1,carta2);
            if (carta1 > cartaJugador && carta2 < cartaJugador){
                dinero += 50;
                System.out.println("Has ganado! Ahora tienes " + dinero + " monedas!");
                barajar();
            } else if(dinero > 150){
                dinero -= 150;
                System.out.println("Has perdido... Ahora tienes " + dinero + " monedas.");
                barajar();
            } else {
                System.out.println("Te has quedado sin dinero... \n Juego Terminado");
            }
        } else {
            barajar();
        }
    }


}
