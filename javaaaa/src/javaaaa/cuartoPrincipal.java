/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaaa;

/**
 *
 * @author samuelvera
 */
public class cuartoPrincipal extends Habitacion {

    private String cama;
    private int bano;

    public cuartoPrincipal() {
        super();
    }

    public cuartoPrincipal(String nombre, double area, int piso, String cama, int bano) {
        super(nombre, area, piso);
        this.cama = cama;
        this.bano = bano;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public int getBano() {
        return bano;
    }

    public void setBano(int bano) {
        this.bano = bano;
    }
}