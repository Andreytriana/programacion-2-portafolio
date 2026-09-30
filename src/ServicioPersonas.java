import java.util.*;
import java.util.function.Predicate;

public class ServicioPersonas {

    private List<Persona> personas;

    public ServicioPersonas() {

        personas = Arrays.asList(
                new Persona("Maria", 22),
                new Persona("Juan", 18),
                new Persona("Carlos", 20),
                new Persona("Laura", 24),
                new Persona("Pedro", 19),
                new Persona("Ana", 21)
        );
    }

    // Mostrar todas las personas
    public void mostrarPersonas() {

        personas.stream()
                .forEach(System.out::println);
    }

    // Filtrar personas mayores de 18 años
    public void personasMayores() {

        personas.stream()
                .filter(p -> p.getEdad() > 18)
                .forEach(System.out::println);
    }

    // Aplicar dos filtros
    public void dosFiltros() {

        personas.stream()
                .filter(p -> p.getEdad() > 18)
                .filter(p -> p.getNombre().startsWith("A"))
                .forEach(System.out::println);
    }

    // Utilizar Predicate
    public void usarPredicate() {

        Predicate<Persona> filtroEdad = p -> p.getEdad() > 18;

        personas.stream()
                .filter(filtroEdad)
                .forEach(System.out::println);
    }

    // Utilizar map para obtener los nombres
    public void usarMap() {

        personas.stream()
                .map(Persona::getNombre)
                .forEach(System.out::println);
    }

    // Ordenar personas por edad
    public void ordenarPorEdad() {

        personas.stream()
                .sorted(Comparator.comparing(Persona::getEdad))
                .forEach(System.out::println);
    }

    // Ordenar personas por nombre
    public void ordenarPorNombre() {

        personas.stream()
                .sorted(Comparator.comparing(Persona::getNombre))
                .forEach(System.out::println);
    }

    // Mostrar solamente personas de 20 años
    public void personasDe20() {

        personas.stream()
                .filter(p -> p.getEdad() == 20)
                .forEach(System.out::println);
    }

    // Contar personas mayores de edad
    public void contarMayores() {

        long cantidad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .count();

        System.out.println("Cantidad de personas mayores de edad: " + cantidad);
    }
}