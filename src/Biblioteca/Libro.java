package Biblioteca;
public class Libro {
    //atributos de la clase
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;
    //metodos de la clase

    //constructor canonico
    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        this.titulo = (titulo == null || titulo.isBlank()) ? "sin titulo" : titulo;
        this.autor = (autor == null || autor.isBlank()) ? "sin autor" : autor;
        this.isbn = (isbn == null || isbn.isBlank()) ? "sin isbn" : isbn;
        this.copiasDisponibles = (copiasDisponibles < 0) ? 0 : copiasDisponibles;
        this.precioReposicion = (esPrecioValido(precioReposicion)) ? precioReposicion : 15000.00;
    }

    //constructor de conveniencia
    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }

    // ==========================================
    // GETTERS
    // ==========================================
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    // ==========================================
    // SETTERS
    // ==========================================
    public boolean setPrecioReposicion(double precio) {
        if (esPrecioValido(precio) == true) {
            this.precioReposicion = precio;
            System.out.println("precio cambiado con exito");
            return true;
        }
        else {
            System.out.println("precio invalido, no se realizaron los cambios");
            return false;
        }
    }

    // ==========================================
    // VALIDADOR
    // ==========================================
    private static boolean esPrecioValido(double precio){
        if (precio > 0) {
            return true;
        }
        return false;
    }
    //=====================================
    //prestar y devolver copias disponibles
    //=====================================
    public boolean prestar(){
        if (copiasDisponibles > 0){
            copiasDisponibles -= 1;
            System.out.println("copia prestada con exito");
            return true;
        }
        else {
            System.out.println("no hay libros disponibles para prestar");
            return false;
        }
    }
    public void devolver (){
        copiasDisponibles++;
        System.out.println("copia devuelta");
    }

    //============================
    //Metodo mostrarFicha
    //============================
    public static void mostrarFicha(Libro libro) {
        System.out.println("=== Ficha de Libro ===");
        System.out.println("el titulo del libro es: " + libro.getTitulo() + "\n" + "el autor del libro es: " + libro.getAutor() + "\n" + "el isbn del libro es: " + libro.getIsbn() + "\n" + "las copias disponibles son: " + libro.getCopiasDisponibles() + "\n" + "el precio de reposicion es: " + libro.getPrecioReposicion());
    }
}