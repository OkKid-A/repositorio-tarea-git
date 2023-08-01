package JuegoDeAhorcado;

import Herramientas.Lector;

public class JuegoDeAhorcado {
    private Lector lector;
    private String palabraObjetivo;
    private Doodle doodle;
    private Adivinador adivinador;
    private int errores;
    private boolean fin;

    public JuegoDeAhorcado(){
        palabraObjetivo = "";
        errores = 0;
        lector = new Lector();
        fin = false;
        doodle = new Doodle();
        iniciarJuego();
    }

    public void iniciarJuego(){
        imprimirInstrucciones();
        this.palabraObjetivo = lector.getString("Jugador 2, por favor ingrese la palabra a adivinar.");
        this.adivinador = new Adivinador(palabraObjetivo);
        correrJuego();
    }

    public void correrJuego(){
        while (errores < 5 && !fin ){
            seleccionarModo();
        }
        finDelJuego();
    }

    public void seleccionarModo(){
        int respuesta;
        respuesta = lector.getDigit("Elige lo que quieres adivinar: \n1. Letra. \n2.Palabra.",2);
        if (respuesta == 1){
            if (adivinador.adivinarLetra(lector.getChar("Ingresa una de las letras que estan en la palabra."))){
                System.out.println("Buen trabajo! Adivinaste una letra!");
            } else {
                errores++;
                System.out.println("Esa letra no esta en la palabra...");
            }
            doodle.dibujarDoodle(errores);
            doodle.dibujarPalabra(adivinador.getLetrasAdivinadas());
            if (adivinador.revisarErrores()){
                fin = true;
            }
        } else if (respuesta == 2){
            if(this.adivinador.adivinarPalabra(lector.getString("Por favor ingresa la palabra que pienses es la correcta:"))){
                System.out.println("Buen trabajo! Adivinaste la palabra:" + palabraObjetivo);
                fin = true;
            } else {
                errores++;
                System.out.println("Esa no es la palabra...");
                doodle.dibujarDoodle(errores);
                doodle.dibujarPalabra(adivinador.getLetrasAdivinadas());
            }
        }
    }

    public void finDelJuego(){
        fin = true;
        if (errores < 5){
            System.out.println("Felicidades!\nHas conseguido ser el ganador, adivinaste la palabra correcta!");
        } else {
            System.out.println("No has conseguido adivinar la palabra correcta... El juego ha terminado!.\nLa palabra correcta era:" + palabraObjetivo);
        }
    }

    public void imprimirInstrucciones(){
        System.out.println("\nEn el juego de ahorcado el segundo jugador debe ingresar la palabra a adivinar.\nLuego " +
                "el primer jugador puede decidir si intenta adivinar una letra de la palabra hasta adivinar todas las letras,\no puede ganar inmediatamente " +
                "intentando adivinar la palabra completa.\nTen cuidado, solo tienes 5 intentos!\n");
        lector.getDigit("1. Continuar",1);
    }
}
