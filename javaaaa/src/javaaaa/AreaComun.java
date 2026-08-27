
    package javaaaa;

    /**
     *
     * @author samuelvera
     */
    public class AreaComun {

        private String nombre;
        private int capacidadPersonas;

        public AreaComun() {
        }

        public AreaComun(String nombre, int capacidadPersonas) {
            this.nombre = nombre;
            this.capacidadPersonas = capacidadPersonas;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCapacidadPersonas() {
            return capacidadPersonas;
        }

        public void setCapacidadPersonas(int capacidadPersonas) {
            this.capacidadPersonas = capacidadPersonas;
        }

        public void describir() {
            System.out.println("Área común: " + nombre + ", capacidad: " + capacidadPersonas + " personas");
        }
    }



