
   package javaaaa;

    /**
     *
     * @author samuelvera
     */
    public class Sala extends AreaComun {

        private boolean tieneTelevisor;

        public Sala() {
            super();
        }

        public Sala(String nombre, int capacidadPersonas, boolean tieneTelevisor) {
            super(nombre, capacidadPersonas);
            this.tieneTelevisor = tieneTelevisor;
        }

        public boolean isTieneTelevisor() {
            return tieneTelevisor;
        }

        public void setTieneTelevisor(boolean tieneTelevisor) {
            this.tieneTelevisor = tieneTelevisor;
        }
    }

