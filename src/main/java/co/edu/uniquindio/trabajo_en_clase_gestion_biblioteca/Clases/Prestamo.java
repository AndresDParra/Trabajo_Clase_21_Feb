package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.Date;

    public class Prestamo {

        private Material_Bibliografico material_bibliografico;
        private Bibliotecario miembro;
        private ClienteCorregido empleado;
        private Date fechaPrestamo;
        private Date fechaEntrega;
        private int diasPrestamo;
        private int precioDia;

        public Prestamo(Material_Bibliografico material_bibliografico, Bibliotecario miembro, ClienteCorregido clienteCorregido, Date fechaPrestamo, Date fechaEntrega, int diasPrestamo, int precioDia) {
            this.material_bibliografico = material_bibliografico;
            this.miembro = miembro;
            this.empleado = clienteCorregido;
            this.fechaPrestamo = fechaPrestamo;
            this.fechaEntrega = fechaEntrega;
            this.diasPrestamo = diasPrestamo;
            this.precioDia = precioDia;
        }

        public Material_Bibliografico getMaterialBibliograficoPrestado() {
            return material_bibliografico;
        }

        public void setMaterial_bibliografico(Material_Bibliografico material_bibliografico) {
            this.material_bibliografico = material_bibliografico;
        }

        public Material_Bibliografico getMaterial_bibliografico() {
            return material_bibliografico;
        }

        public Bibliotecario getMiembro() {
            return miembro;
        }

        public void setMiembro(Bibliotecario miembro) {
            this.miembro = miembro;
        }

        public ClienteCorregido getEmpleado() {
            return empleado;
        }

        public void setEmpleado(ClienteCorregido empleado) {
            this.empleado = empleado;
        }

        public Date getFechaPrestamo() {
            return fechaPrestamo;
        }

        public void setFechaPrestamo(Date fechaPrestamo) {
            this.fechaPrestamo = fechaPrestamo;
        }

        public Date getFechaEntrega() {
            return fechaEntrega;
        }

        public void setFechaEntrega(Date fechaEntrega) {
            this.fechaEntrega = fechaEntrega;
        }

        public int getDiasPrestamo() {
            return diasPrestamo;
        }

        public void setDiasPrestamo(int diasPrestamo) {
            this.diasPrestamo = diasPrestamo;
        }

        public int getPrecioDia() {
            return precioDia;
        }

        public void setPrecioDia(int precioDia) {
            this.precioDia = precioDia;
        }

        public double calcularValorPrestamo(){

            return precioDia * diasPrestamo;
        }

        @Override
        public String toString() {
            return "Prestamo{" +
                    "libro=" + material_bibliografico +
                    ", miembro=" + miembro +
                    ", empleado=" + empleado +
                    ", fechaPrestamo=" + fechaPrestamo +
                    ", fechaEntrega=" + fechaEntrega +
                    ", diasPrestamo=" + diasPrestamo +
                    ", precioDia=" + precioDia +
                    ", costo total=" + calcularValorPrestamo() +
                    '}';
        }
        public static void instanciarPrestamos() {
            Material_Bibliografico material1 = new Material_Bibliografico("Libro1", "Autor1", "nada",  Estado.DISPONIBLE);
            Bibliotecario bibliotecario = new Bibliotecario("Juan Perez", "123456", 1000000, 40, 25000);
            ClienteCorregido clienteCorregido1 = new ClienteCorregido("Carlos", "789", "2000", new Multa("2023-01-01", "Late return", 5));
            Date fechaPrestamo = new Date();
            Date fechaEntrega = new Date(fechaPrestamo.getTime() + (7 * 24 * 60 * 60 * 1000)); // 7 days later
            Biblioteca.CrearPrestamos(material1, clienteCorregido1,bibliotecario , fechaPrestamo, fechaEntrega, 7, 500);
        }
    }
