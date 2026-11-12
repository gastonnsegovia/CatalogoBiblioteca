package Biblioteca;
public class MainBiblioteca {
    public static void main(String[] args) {
        //creacion de los 3 objetos
        Libro libro1 = new Libro("fisica", "carlos", "123456789", 2, 10000.0);
        Libro libro2 = new Libro("Matematica", "Miguel", "12345678");
        Libro libro3 = new Libro("", "", "");

    //comprobacion que el objeto se crea con un titulo, autor, isbn, copias disponibles o precio de reposicion por defecto
        System.out.println("comprobando que el objeto se crea con un titulo, autor, isbn, copias disponibles o precio de reposicion por defecto");
        System.out.println(libro3.getTitulo() + '\n' + libro3.getAutor() + "\n" + libro3.getIsbn() + "\n" + "copias disponibles: " + libro3.getCopiasDisponibles() + "\n" + "precio de reposicion: " + libro3.getPrecioReposicion());

        System.out.println();

    //comprobacion que el objeto no cambia cuando se ingresa un valor invalido
        System.out.println("comprobando que el objeto no cambia cuando se ingresa un valor invalido");
        libro3.setPrecioReposicion(-2);
        System.out.println(libro3.getPrecioReposicion());

        System.out.println();

    //agotar las copias de un libro y comprobar que no deja el atributo en negativo
        System.out.println("agotando las copias de un libro y comprobar que no deja el atributo en negativo");
        libro1.prestar();
        System.out.println("copias disponibles: " + libro1.getCopiasDisponibles());
        libro1.prestar();
        System.out.println("copias disponibles: " + libro1.getCopiasDisponibles());
        libro1.prestar();
        System.out.println("copias disponibles: " + libro1.getCopiasDisponibles());


        System.out.println();

    //comprobar funcionamiento de devolver
        libro1.devolver();
        System.out.println("copias disponibles: " + libro1.getCopiasDisponibles());

        System.out.println();

        //utilizacion del metodo mostrarFicha con todos los libros
        System.out.println('\n' + "mostrando ficha del libro 1" + '\n');
        Libro.mostrarFicha(libro1);

        System.out.println('\n' + "mostrando ficha del libro 2" + '\n');
        Libro.mostrarFicha(libro2);

        System.out.println('\n' + "mostrando ficha del libro 3" + '\n');
        Libro.mostrarFicha(libro3);
    }
}
