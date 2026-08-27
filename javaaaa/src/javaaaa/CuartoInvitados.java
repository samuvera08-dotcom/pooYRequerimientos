package javaaaa;

public class CuartoInvitados {
    package javaaaa;

    /**
     *
     * @author samuelvera
     */
    public class CuartoInvitados extends Habitacion {

        private boolean tieneClosetPropio;

        public CuartoInvitados() {
            super();
        }

        public CuartoInvitados(String nombre, double area, int piso, boolean tieneClosetPropio) {
            super(nombre, area, piso);
            this.tieneClosetPropio = tieneClosetPropio;
        }

        public boolean isTieneClosetPropio() {
            return tieneClosetPropio;
        }

        public void setTieneClosetPropio(boolean tieneClosetPropio) {
            this.tieneClosetPropio = tieneClosetPropio;
        }
    }


}
