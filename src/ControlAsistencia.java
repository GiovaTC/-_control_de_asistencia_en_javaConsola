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

    public static void marcarAsistencia() {

        if (contador == 0) {
            System.out.println("No hay estudiantes registrados!");
            return;
        }

        mostrarLista();

        System.out.print("Seleccione numero del estudiante: ");
        int indice = sc.nextInt();

        if (indice >= 0 && indice < contador) {
            asistencia[indice] = true;
            System.out.println("Asistencia registrada.");

        } else {
            System.out.println("Indice invalido!");
        }
    }

    public static void mostrarAsistencia() {

        if (contador == 0) {
            System.out.println("No hay estudiantes!");
            return;
        }

        System.out.println("\\n===== LISTA DE ASISTENCIA =====");

        for (int i = 0; i < contador; i++) {

            System.out.println(
                            i + " - " +
                            estudiantes[i] +
                            " -> " +
                            (asistencia[i] ? "Presente" : "Ausente")
            );
        }
    }

    public static void mostrarLista() {

        System.out.println("\n===== ESTUDIANTES =====");

        for (int i = 0; i < contador; i++) {

            System.out.println(i + ". " + estudiantes[i]);
        }
    }
}
