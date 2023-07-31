package Herramientas;

import java.util.Scanner;

public class Lector {
    private String pregunta;
    private int respuesta;
private String respuestaEscrita;
private Scanner scanner;

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
        String respuestaBruta;
        int respuesta = 0;
        System.out.println(pregunta);
        try{
            respuestaBruta = scanner.nextLine();
            respuesta = Integer.parseInt(respuestaBruta);
            if(respuesta > limite || respuesta < 1){
                throw new ArithmeticException("El numero debe ser 1 o 2.");
            }
        } catch(Exception e){
            System.out.println("El dato no es aceptable");
            getDigit(pregunta);
        }
        return respuesta;
    }
}








