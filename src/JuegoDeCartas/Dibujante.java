package JuegoDeCartas;

public class Dibujante {


    public Dibujante(){

    }

    public void dibujarCarta(String valorCarta){
        dibujarTope();
        dibujarBorder();
        dibujarValorCarta(valorCarta);
        dibujarBorder();
        dibujarTope();
    }

    public void dibujarTope(){
        System.out.println("-------");
    }

    public void dibujarBorder(){
        System.out.println("|     |");
    }

    public void dibujarValorCarta(String valorCarta){
        System.out.println("|  " + valorCarta + "  |");
    }

    public String traducirRandom(int azar){
        switch (azar){
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return null;
    }
}
