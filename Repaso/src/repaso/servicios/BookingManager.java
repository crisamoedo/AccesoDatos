/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.servicios;

import repaso.model.Piscina;

/**
 *
 * @author mfernandez
 */
public class BookingManager {

    public static final int MAX_FRANJAS = 6;
    public static final int MIN_FRANJA = 1;

    private Piscina piscina;
    private String[][] reservasPorFranja;

    public BookingManager(Piscina piscina) {
        this.piscina = piscina;

        this.reservasPorFranja = new String[MAX_FRANJAS][piscina.getAforo()];
    }

//    public boolean isDisponible(int franja){
//        boolean encontrado = false;
//        for (int i = 0; ((!encontrado) && (i < reservasPorFranja[franja-1].length)); i++) {
//           if( reservasPorFranja[franja-1][i]==null)
//               encontrado= true;
//        }
//        return encontrado;
//    }
    public boolean isDisponible(int franja) {

        for (String item : reservasPorFranja[franja - 1]) {
            if( item == null)
                return true;
        }
        return false;

    }
}
