package Herramientas;

import java.util.Scanner;

public class Lector {
    private String pregunta;
    private int respuesta;
private String respuestaEscrita;
private Scanner scanner;
private char respuestaChar;

    public Lector() {
        this.scanner = new Scanner(System.in);
    }

    public int getDigit(String pregunta){
        String respuestaBruta;
        int respuesta = 0;
        System.out.println(pregunta);
        try{
            respuestaBruta = scanner.nextLine();
            respuesta = Integer.parseInt(respuestaBruta);
        } catch(Exception e){
            System.out.println("El dato no es aceptable");
            getDigit(pregunta);
        }
        return respuesta;
       }

    public int getDigit(String pregunta, int limite){
        int respuesta = 0;
        System.out.println(pregunta);
        scanner = new Scanner(System.in);
        try{
            this.respuesta = scanner.nextInt();
            if(this.respuesta > limite || this.respuesta < 1){
                throw new RuntimeException();
            }
        } catch(Exception e){
            System.out.println("El dato no es aceptable");
            getDigit(pregunta,limite);
        }
        return this.respuesta;
    }

    public int getDigitMin(String pregunta, int limite){
        String respuestaBruta;
        int respuesta = 0;
        System.out.println(pregunta);
        scanner = new Scanner(System.in);
        try{
            this.respuesta = scanner.nextInt();
            if(this.respuesta < limite || this.respuesta > 10000){
                throw new ArithmeticException("El numero no es valido.");
            }
        } catch(Exception e){
            System.out.println("El dato no es aceptable");
            getDigitMin(pregunta,limite);
        }
        return this.respuesta;
    }

    public String getString(String pregunta){
        System.out.println(pregunta);
        String respuesta = null;
        try {
            respuesta = scanner.next().toLowerCase();
            scanner.nextLine();
            if (respuesta == ""){
                throw new StringIndexOutOfBoundsException("La palabra es vacia o no valida.");
            }
        } catch (Exception e){
            getString(pregunta);
        }
        return respuesta;
    }

    public char getChar(String pregunta){
        System.out.println(pregunta);
        char respuestaChar = ' ';
        scanner = new Scanner(System.in);
        try {
            this.respuestaChar = scanner.next("[a-zA-Z]").charAt(0);
            scanner.nextLine();
        } catch (Exception e){
            System.out.println("Por favor inserte solo un caracter");
            getChar(pregunta);
        }
        return this.respuestaChar;
    }
}








