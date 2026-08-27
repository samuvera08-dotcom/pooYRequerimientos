

    /**
     *
     * @author samuelvera
     */
    public class EspacioExterior {

        private String nombre;
        private boolean techado;

        public EspacioExterior() {
        }

        public EspacioExterior(String nombre, boolean techado) {
            this.nombre = nombre;
            this.techado = techado;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public boolean isTechado() {
            return techado;
        }

        public void setTechado(boolean techado) {
            this.techado = techado;
        }

        public void describir() {
            System.out.println("Espacio exterior: " + nombre + ", techado: " + (techado ? "sí" : "no"));
        }
    }






