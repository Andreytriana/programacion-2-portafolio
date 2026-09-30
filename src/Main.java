import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ServicioPersonas servicio = new ServicioPersonas();

        int opcion;

        do {

            System.out.println("\n========== MENU STREAM ==========");
            System.out.println("1. Mostrar personas");
            System.out.println("2. Filtrar personas mayores de 18");
            System.out.println("3. Aplicar dos filtros");
            System.out.println("4. Utilizar Predicate");
            System.out.println("5. Utilizar map");
            System.out.println("6. Ordenar por edad");
            System.out.println("7. Ordenar por nombre");
            System.out.println("8. Mostrar personas de 20 años");
            System.out.println("9. Contar personas mayores de edad");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            System.out.println();

            switch (opcion) {

                case 1:
                    servicio.mostrarPersonas();
                    break;

                case 2:
                    servicio.personasMayores();
                    break;

                case 3:
                    servicio.dosFiltros();
                    break;

                case 4:
                    servicio.usarPredicate();
                    break;

                case 5:
                    servicio.usarMap();
                    break;

                case 6:
                    servicio.ordenarPorEdad();
                    break;

                case 7:
                    servicio.ordenarPorNombre();
                    break;

                case 8:
                    servicio.personasDe20();
                    break;

                case 9:
                    servicio.contarMayores();
                    break;

                case 10:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 10);

        teclado.close();
    }
}