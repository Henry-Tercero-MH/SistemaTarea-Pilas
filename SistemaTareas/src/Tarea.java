class Tarea {
    //atributos
    private int identificador;
    private int prioridad;
//constructores
    public Tarea(int identificador, int prioridad) {
        this.identificador = identificador;
        this.prioridad = prioridad;
    }

    public Tarea() {
    }
//metodos de acceso
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
//mostrar datos con to String
    @Override
    public String toString() {
        return "Tarea " + identificador + " - Prioridad: " + prioridad;
    }


}