/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaaaa;

public class Javaaaa {

    /**
     *
     * @author samuelvera public class Javaaaa {
     *
     * /
     **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Jugador mijugador = new Jugador();

        System.out.println("mi jugador es" + mijugador.competenciaInternacional);

        cuartoPrincipal miCuarto = new cuartoPrincipal();

        miCuarto.setCama("king");

        miCuarto.getCama();
        System.out.println("mi cama es " + miCuarto.getCama());

    }

}
