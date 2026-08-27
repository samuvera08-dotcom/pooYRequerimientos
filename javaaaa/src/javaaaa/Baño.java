
    package javaaaa;

    /**
     *
     * @author samuelvera
     */
    public class Baño extends Habitacion {

        private boolean tieneTina;

        public Baño() {
            super();
        }

        public Baño(String nombre, double area, int piso, boolean tieneTina) {
            super(nombre, area, piso);
            this.tieneTina = tieneTina;
        }

        public boolean siTieneTina() {
            return tieneTina;
        }

        public void setTieneTina(boolean tieneTina) {

            this.tieneTina = tieneTina;
        }
    }



