
    package javaaaa;

    /**
     *
     * @author samuelvera
     */
    public class Bano extends Habitacion {

        private boolean tieneTina;

        public Bano() {
            super();
        }

        public Bano(String nombre, double area, int piso, boolean tieneTina) {
            super(nombre, area, piso);
            this.tieneTina = tieneTina;
        }

        public boolean isTieneTina() {
            return tieneTina;
        }

        public void setTieneTina(boolean tieneTina) {
            this.tieneTina = tieneTina;
        }
    }



