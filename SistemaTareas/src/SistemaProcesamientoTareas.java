import java.util.Stack;
class SistemaProcesamientoTareas {
    private Stack<Tarea> pila = new Stack<>();//creamos una pila

    //metodo para apilar
    public void agregarTarea(Tarea tarea) {
        pila.push(tarea);
    }
//metodo para ordenar
    public void ordenarPilaPorPrioridad() {
        int n = pila.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Tarea tareaActual = pila.get(j);
                Tarea tareaSiguiente = pila.get(j + 1);

                if (tareaActual.getPrioridad() > tareaSiguiente.getPrioridad()) {
                    // Intercambiar las tareas si están en el orden incorrecto
                    pila.set(j, tareaSiguiente);
                    pila.set(j + 1, tareaActual);
                }
            }
        }
    }
//metodo para ejecutar la tarea
    public void ejecutarTarea() {
        ordenarPilaPorPrioridad();
        if (pila.isEmpty()) {
            System.out.println("No hay tareas para ejecutar");
        } else {
            System.out.println("Se esta ejecutando la tarea: " + pila.pop().toString());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
//metodo para ver la tarea siguiente
    public void verSiguienteTarea() {
        ordenarPilaPorPrioridad();
        if (pila.isEmpty()) {
            System.out.println("Ya no quedan tareas por realizar");
        } else {
            System.out.println("La Siguiente Tarea es: " + pila.peek().toString());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
