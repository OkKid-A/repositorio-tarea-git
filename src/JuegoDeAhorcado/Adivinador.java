package JuegoDeAhorcado;

public class Adivinador {

    private String palabraRespuesta;
    private char[] letrasAdivinadas;
    private char[] letrasRespuesta;

    public Adivinador(String palabraRespuesta){
        this.palabraRespuesta = palabraRespuesta;
        letrasRespuesta = new char[0];

        separarPalabra();
    }

    public boolean revisarErrores(){
        boolean gano = true;
        for (int i = 0; i < palabraRespuesta.length();i++){
            if (letrasAdivinadas[i] == '_'){
                gano = false;
            }
        }
        return gano;
    }

    public void separarPalabra(){
        letrasRespuesta= palabraRespuesta.toLowerCase().toCharArray();
        letrasAdivinadas = new char[letrasRespuesta.length];
        letrasAdivinadas[0] = '_';
        for (int i = 0; i < letrasRespuesta.length; i++){
            letrasAdivinadas[i] = '_';
        }
    }

    public boolean adivinarLetra(char letraPosible){
        boolean adivino = false;
        for (int i = 0; i < palabraRespuesta.length();i++){
            if (letrasRespuesta[i] == letraPosible){
                letrasAdivinadas[i] = letraPosible;
                adivino = true;
            }
        }
        return adivino;
    }

    public boolean adivinarPalabra(String palabraPosible){
        if (palabraRespuesta.contentEquals(palabraPosible)){
            return true;
        } else {
            return false;
        }
    }

    public char[] getLetrasAdivinadas() {
        return letrasAdivinadas;
    }

    public char[] getLetrasRespuesta() {
        return letrasRespuesta;
    }
}
