package Java_Basic.ClaseScanner;

import java.util.Scanner;

public class ClaseScanner
{
    public static void main(String[] args)
    {

        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in); // Esta funciòn nos sirve para mandar datos a la consola
        var usuario = consola.nextLine();
        System.out.println("Nombre : " + usuario);
        System.out.println("Escribe tu profesiòn");
        var profesion = consola.nextLine();
        System.out.println("Usuario: " + profesion + " " + usuario);

    }


}
