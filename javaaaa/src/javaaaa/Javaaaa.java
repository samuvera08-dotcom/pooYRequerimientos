package javaaaa;

/**
 *
 * @author samuelvera
 */
public class Javaaaa {

    public static void main(String[] args) {

        cuartoPrincipal miCuarto = new cuartoPrincipal("Cuarto Principal",20.5, 2, "king", 1 );
        miCuarto.describir();
        System.out.println("Cama: " + miCuarto.getCama());

        CuartoInvitados cuartoInv = new CuartoInvitados("Cuarto de Invitados", 15.0, 2, true);
        cuartoInv.describir();

        Baño miBaño = new Baño("Baño Principal", 8.0, 2, true);
        miBaño.describir();

        Sala miSala = new Sala("Sala Principal", 6, true);
        miSala.describir();

        Cocina miCocina = new Cocina("Cocina", 4, 5);
        miCocina.describir();

        Jardin miJardin = new Jardin("Jardín Trasero", false, true);
        miJardin.describir();

        Garaje miGaraje = new Garaje("Garaje", true, 2);
        miGaraje.describir();
    }
}