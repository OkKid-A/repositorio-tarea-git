package JuegoDeCartas;

import java.util.Random;

public class Casino {

    private Random azar;
    public Casino(){
        this.azar = new Random();
    }

    public int producirValorAzar(){
        int valor = azar.nextInt();
        return valor;
    }

    public void ordernarCartas(int cartaMayor, int cartaMenor){
        int cartaMedia = 0;
        if(cartaMayor < cartaMenor){
            cartaMedia = cartaMayor;
            cartaMayor = cartaMenor;
            cartaMenor = cartaMedia;
        }
    }
}
