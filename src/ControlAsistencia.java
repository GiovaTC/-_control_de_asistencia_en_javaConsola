import java.util.Scanner;

public class ControlAsistencia {

    static Scanner sc = new Scanner(System.in);

    static String[] estudiantes = new String[50];
    static boolean[] asistencia = new boolean[50];

    static int contador = 0;

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== CONTROL DE ASISTENCIA =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Marcar asistencia");
            System.out.println("3. Mostrar asistencia");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    registrarEstudiante();
                    break;

                case 2:
                    marcarAsistencia();
                    break;

                case 3:
                    mostrarAsistencia();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);
    }

    public static void registrarEstudiante() {

        System.out.println("Ingresa nombre del estudiante: ");
        String nombre = sc.nextLine();

        estudiantes[contador] = nombre;
        asistencia[contador] = false;

        contador++;
        System.out.println("Estudiante registrado correctamente!");
    }
    
    public static void marcarAsistencia() {}
    public static void mostrarAsistencia() {}
}
