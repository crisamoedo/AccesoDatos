package repaso.util;

import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mfernandez
 */
public class IOManager {

    public static int leerEntero(String cadena) {
        Scanner sc = new Scanner(System.in);
        int entero = 0;
        try {
            do {
                System.out.print(cadena);
                while (!sc.hasNextInt()) {
                    System.out.println("Ha ocurrido una excepción. Solo se permiten enteros");
                    sc.next();
                    System.out.print("Introduce un número entero positivo: ");
                }

                entero = sc.nextInt();
                if (entero <= 0) {
                    System.out.println("El número debe ser positivo");
                }

            } while (entero <= 0);
            //  System.out.println("Número introducido: " + entero);
        } catch (NoSuchElementException | IllegalStateException nse) {
            System.out.println("Se produjo una excepción " + nse.getMessage());
        }

        return entero;
    }
    //inclusive
    public static boolean isInRange(int min, int max, int valor) {
        return ((valor >= min) && (valor <= max));
    }

    public static String leerCadena(String cadena) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        try {
            do {
                System.out.print(cadena);
                entrada = sc.nextLine();

            } while (entrada.isEmpty());

        } catch (NoSuchElementException | IllegalStateException nse) {
            System.out.println("Se produjo una excepción " + nse.getMessage());
        }

        return entrada;
    }
}
