/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.model;

import repaso.util.IOManager;

/**
 *
 * @author mfernandez
 */
public class Piscina {

    private static final int MAX_DIST = 2;
    private int long_vaso;
    private int ancho_vaso;
    private int long_parcela;
    private int ancho_parcela;
    
    private int aforo;

    public int getAforo() {
        return aforo;
    }
    
    

    public Piscina(int long_vaso, int ancho_vaso, int long_parcela, int ancho_parcela) {
        this.long_vaso = long_vaso;
        this.ancho_vaso = ancho_vaso;
        this.long_parcela = long_parcela;
        this.ancho_parcela = ancho_parcela;
        
        this.aforo= calcularAforo();
    }
    
    private int calcularAforo(){
        int aforo_temp =0;
        int sup_vaso = calcularSuperficie(ancho_vaso, long_vaso);
        int sup_parcela = calcularSuperficie(ancho_parcela,long_parcela );
        
        int aforo_vaso = sup_vaso/MAX_DIST;
        int aforo_parcela = sup_parcela/MAX_DIST;
        
       aforo_temp =  Math.min(aforo_parcela, aforo_vaso);
       return aforo_temp;
    }
    
    private int calcularSuperficie(int anchura, int longitud){
        return anchura * longitud;
    }
    
}
