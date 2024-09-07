package examen;

public class Cancion {
    // Constante estática para segundos por minuto
    private static final int SEGUNDOS_POR_MINUTO = 60;

    // Atributos privados
    private String titulo;
    private String artista;
    private int duracion; // Duración en segundos
    private String genero;
    private String album;

    // Constructor por defecto
    public Cancion() {
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }

    // Constructor con parámetros
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = "Desconocido"; // Valor por defecto
        this.album = "Desconocido"; // Valor por defecto
    }

    // Métodos getter y setter para el atributo titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos getter y setter para el atributo artista
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    // Métodos getter y setter para el atributo duracion
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Métodos getter y setter para el atributo genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos getter y setter para el atributo album
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    // Método privado para calcular la duración en minutos
    private int calcularDuracionMinutos() {
        return duracion / SEGUNDOS_POR_MINUTO;
    }

    // Método para mostrar información sin parámetros
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion + " segundos (" + calcularDuracionMinutos() + " minutos)");
        System.out.println("Género: " + genero);
        System.out.println("Álbum: " + album);
        System.out.println(); // Línea en blanco para separar las canciones
    }

    // Sobrecarga del método mostrarInformacion con parámetro
    public void mostrarInformacion(String usuario) {
        mostrarInformacion(); // Llamada al método sin parámetros
        System.out.println("Escuchado por: " + usuario);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear instancias de Cancion
        Cancion cancion1 = new Cancion("Imagine", "John Lennon", 183);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen", 354);
        Cancion cancion3 = new Cancion("Billie Jean", "Michael Jackson", 293);

        // Mostrar información de las canciones sin parámetros
        System.out.println("Información de las canciones:");
        cancion1.mostrarInformacion();
        cancion2.mostrarInformacion();
        cancion3.mostrarInformacion();

        // Mostrar información de la primera canción con nombre de usuario
        System.out.println("Información con nombre de usuario:");
        cancion1.mostrarInformacion("Carlos");
    }
}