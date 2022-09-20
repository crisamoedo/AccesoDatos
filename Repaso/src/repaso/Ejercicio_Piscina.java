/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import repaso.util.IOManager;


import repaso.model.Piscina;
import repaso.servicios.BookingManager;

/**
 *
 * @author mfernandez
 */
public class Ejercicio_Piscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookingManager bookingManager;
        int franja = 0;
        String dni;
        int long_vaso = IOManager.leerEntero("Introduzca longitud de la piscina:");
        int ancho_vaso = IOManager.leerEntero("Introduzca anchura de la piscina:");

        int long_parcela = IOManager.leerEntero("Introduzca longitud de la parcela:");
        int ancho_parcela = IOManager.leerEntero("Introduzca anchura de la parcela:");

        Piscina piscina = new Piscina(long_vaso, ancho_vaso, long_parcela, ancho_parcela);
        //int aforo = piscina.calcularAforo();

        System.out.println("El aforo de la piscina es: " + piscina.getAforo() + " personas");

        bookingManager = new BookingManager(piscina);

        do {
            franja = IOManager.leerEntero("Introduzca número de franja donde quiere reservar [1-6]:");

        } while (!IOManager.isInRange(BookingManager.MIN_FRANJA,
                BookingManager.MAX_FRANJAS, franja));

        
        boolean disponible = bookingManager.isDisponible(franja);
        dni = IOManager.leerCadena("Introduzca dni:");
        System.out.println("El dni es: " + dni);
    }

}
