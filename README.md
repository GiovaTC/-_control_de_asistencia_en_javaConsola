# -_control_de_asistencia_en_javaConsola :.
📘 Control de Asistencia en Java (Consola):

<img width="1024" height="1024" alt="image" src="https://github.com/user-attachments/assets/5126d84f-d80b-4fb5-bcc1-e307c7fe1361" />  

```
Sistema desarrollado en Java SE utilizando consola en IntelliJ IDEA.

El programa permite:

✅ Registrar estudiantes
✅ Marcar asistencia
✅ Consultar asistencia
✅ Mostrar listado general
✅ Menú interactivo
✅ Uso de arreglos y ciclos
✅ Programación orientada a objetos básica.

🧩 Estructura del Programa
ControlAsistencia
 ├── main()
 ├── registrarEstudiante()
 ├── marcarAsistencia()
 ├── mostrarAsistencia()
 └── mostrarLista()

💻 Código Completo
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

        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = sc.nextLine();

        estudiantes[contador] = nombre;
        asistencia[contador] = false;

        contador++;

        System.out.println("Estudiante registrado correctamente");
    }

    public static void marcarAsistencia() {

        if (contador == 0) {
            System.out.println("No hay estudiantes registrados");
            return;
        }

        mostrarLista();

        System.out.print("Seleccione numero del estudiante: ");
        int indice = sc.nextInt();

        if (indice >= 0 && indice < contador) {

            asistencia[indice] = true;

            System.out.println("Asistencia registrada");

        } else {

            System.out.println("Indice invalido");
        }
    }

    public static void mostrarAsistencia() {

        if (contador == 0) {
            System.out.println("No hay estudiantes");
            return;
        }

        System.out.println("\n===== LISTA DE ASISTENCIA =====");

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

▶️ Ejemplo de Ejecucion
===== CONTROL DE ASISTENCIA =====
1. Registrar estudiante
2. Marcar asistencia
3. Mostrar asistencia
4. Salir

Seleccione una opcion: 1

Ingrese nombre del estudiante: Carlos

Estudiante registrado correctamente .

📋 Ejemplo de Asistencia
===== LISTA DE ASISTENCIA =====

0 - Carlos -> Presente
1 - Maria -> Ausente
2 - Juan -> Presente

⚙️ Tecnologías Utilizadas
Java SE
IntelliJ IDEA
Scanner
Arreglos
Ciclos
Condicionales
Programación Orientada a Objetos (POO)

🚀 Características del Sistema
Funcionalidad	Descripción
Registrar estudiantes	Permite almacenar nombres
Marcar asistencia	Cambia estado a presente
Mostrar asistencia	Visualiza presentes y ausentes
Menú interactivo	Navegación por consola
Validaciones	Control de índices invalidos.

📌 Posibles Mejoras
🔹 Guardar información en archivos
🔹 Integración con base de datos
🔹 Interfaz gráfica con Swing
🔹 Exportar asistencia a PDF o Excel
🔹 Uso de ArrayList en lugar de arreglos
🔹 Registro por fecha
🔹 Estadísticas de asistencia

🏁 Resultado
El programa implementa un sistema básico de control de asistencia en consola utilizando Java, aplicando estructuras fundamentales de programación y logica orientada a objetos .
:. . / .
