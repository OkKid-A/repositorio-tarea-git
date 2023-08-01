package JuegoDeCartas;

import java.util.Random;

public class Casino {

    private int cartaMenor;
    private int cartaMayor;
    private int cartaCorrecta;
    private Random azar;
    public Casino(){
        this.azar = new Random();
    }

    public int producirValorAzar(){
        int valor = azar.nextInt(12);
        return valor;
    }

    public void ordernarCartas(int cartaMayor, int cartaMenor){
        int cartaMedia = 0;
        this.cartaMayor = cartaMayor;
        this.cartaMenor = cartaMenor;
        if(cartaMayor < cartaMenor){
            cartaMedia = cartaMayor;
            this.cartaMayor = cartaMenor;
            this.cartaMenor = cartaMedia;
        }
    }

    public int compararCartas(int carta){
        this.cartaCorrecta = producirValorAzar();
        if (carta == this.cartaCorrecta){
            compararCartas(carta);
        }
        return this.cartaCorrecta;
    }

    public int getCartaMayor() {
        return cartaMayor;
    }

    public int getCartaMenor() {
        return cartaMenor;
    }


}
