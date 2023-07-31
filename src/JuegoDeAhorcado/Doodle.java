package JuegoDeAhorcado;

public class Doodle {

    private int errores;
    private String cabeza;
    private String torzo;
    private String brazos;
            private String piernas;

    public Doodle(){
        this.errores = 0;
        cabeza = " ";
        torzo = " ";
        brazos = " " + torzo + " ";
        piernas = "   ";
    }

    public void dibujarDoodle(int errores){
        seleccionarPartes(errores);
        System.out.println("  +---+  ");
        System.out.println("  |   |  ");
        System.out.println("  " + cabeza + "   |  ");
        System.out.println(" " + brazos + "  |  ");
        System.out.println(" " + piernas + "  |  ");
        System.out.println("=========");
    }

    public void seleccionarPartes(int errores){
        switch (errores){
            case 0:
                return;
            case 1:
                cabeza = "0";
                return;
            case 2:
                brazos = " | ";
                return;
            case 3:
                brazos = "/|\\";
                return;
            case 4:
                piernas = "/  ";
                return;
            case 5:
                piernas = "/ \\";
        }
    }

    public void dibujarPalabra(char[] letrasAdivinadas){
        String dibujoLetra = "";
        int i = 0;
        do{
            dibujoLetra = dibujoLetra + letrasAdivinadas[i] + ' ';
            i++;
        } while (i<letrasAdivinadas.length);
        System.out.println(dibujoLetra);
    }
}
