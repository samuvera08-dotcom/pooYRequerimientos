
    package javaaaa;

    /**
     *
     * @author samuelvera
     */
    public class Cocina extends AreaComun {

        private int numeroElectrodomesticos;

        public Cocina() {
            super();
        }

        public Cocina(String nombre, int capacidadPersonas, int numeroElectrodomesticos) {
            super(nombre, capacidadPersonas);
            this.numeroElectrodomesticos = numeroElectrodomesticos;
        }

        public int getNumeroElectrodomesticos() {
            return numeroElectrodomesticos;
        }

        public void setNumeroElectrodomesticos(int numeroElectrodomesticos) {
            this.numeroElectrodomesticos = numeroElectrodomesticos;
        }
    }

