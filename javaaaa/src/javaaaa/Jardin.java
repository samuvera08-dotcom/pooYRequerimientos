package javaaaa;

/**
 *
 * @author samuelvera
 */
public class Jardin extends EspacioExterior {

    private boolean tienePiscina;

    public Jardin() {
        super();
    }

    public Jardin(String nombre, boolean techado, boolean tienePiscina) {
        super(nombre, techado);
        this.tienePiscina = tienePiscina;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }
}