package javaaaa;

/**
 *
 * @author samuelvera
 */
public class Garaje extends EspacioExterior {

    private int numeroCarros;

    public Garaje() {
        super();
    }

    public Garaje(String nombre, boolean techado, int numeroCarros) {
        super(nombre, techado);
        this.numeroCarros = numeroCarros;
    }

    public int getNumeroCarros() {
        return numeroCarros;
    }

    public void setNumeroCarros(int numeroCarros) {
        this.numeroCarros = numeroCarros;
    }
}