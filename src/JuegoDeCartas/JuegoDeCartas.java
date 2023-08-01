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
        imprimirInstrucciones();
        dinero = lector.getDigitMin("Cuanto dinero tendra el jugador?", 151);
        System.out.println("Empezando el juego:");
        barajar();
    }

    public void barajar(){
        System.out.println("Monedas actuales: " + dinero);
        System.out.println("Barajando...");
        carta1 = casino.producirValorAzar();
        carta2 = casino.compararCartas(carta1);
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
            if (casino.getCartaMayor() > cartaJugador && casino.getCartaMenor() < cartaJugador){
                dinero += 50;
                System.out.println("Has ganado 50 monedas!");
                barajar();
            } else if(dinero > 150){
                dinero -= 150;
                System.out.println("Has perdido 150 monedas...");
                barajar();
            } else {
                System.out.println("Te has quedado sin dinero... \n Juego Terminado");
            }
        } else {
            barajar();
        }
    }

    public void imprimirInstrucciones(){
        System.out.println("\nEn el juego de Cartas primero debes definir el dinero que tendras (siempre debe ser menor a " +
                "100000).\nLuego nuestro casino te barajara dos cartas, puedes decidir si apostar o no con esas dos cartas.\n" +
                "Si apuestas, nuestro casino te barajara una nueva carta y ganaras 50 monedas si el valor de tu carta esta " +
                "\nentre las dos del casino, si pierdes la apuesta perderas 150 monedas!\nEl juego termina cuando te quedas sin dinero\n");
        lector.getDigit("1. Continuar",1);
    }
}
