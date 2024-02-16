import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Ejecutar Tarea");
        System.out.println("3. Tarea Siguiente");
        System.out.println("Digite una opcion");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//lector de datos por parte del usuario
        int op;//variable para opcion
        SistemaProcesamientoTareas sistemaProcesamientoTareas = new SistemaProcesamientoTareas();//instancia de la clase
        do {//inicia do while para volver al menu
            menu();//metodo para ver el menu
            op = entrada.nextInt();//usuario ingresa una opcion
            switch (op) {//ciclo para interactuar segun el menu
                case 1:
                    System.out.println(".:Nueva Tarea:.");
                    System.out.println("Digite el identificador");
                    int id = entrada.nextInt();
                    System.out.println("Digite la prioridad");
                    int prioridad = entrada.nextInt();
                    Tarea tarea = new Tarea(id, prioridad);
                    sistemaProcesamientoTareas.agregarTarea(tarea);
                    break;
                case 2:
                    // Obtener tarea con prioridad máxima
                    sistemaProcesamientoTareas.ejecutarTarea();
                    System.out.println("Ejecutada con exito");
                    break;
                case 3:

                    // Mostrar tareas en la pila
                    sistemaProcesamientoTareas.verSiguienteTarea();


                    break;
            }
        } while (op != 0);
    }
}
