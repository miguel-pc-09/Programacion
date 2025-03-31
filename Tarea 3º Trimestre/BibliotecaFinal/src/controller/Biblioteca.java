package controller;

import model.Libro;

import java.util.ArrayList;
import java.util.Hashtable;

public class Biblioteca {
    private String nombre;
    private String director;
    private Catalogo catalogo;

    //Constructor vacio
    public Biblioteca() {}

    //Constructor conTodo
    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.catalogo = null;
    }

    // Metodo para construir catalogo dependiendo de la capacidad
    public void construirCatalogo(int capacidad) {
        this.catalogo = new Catalogo(capacidad);
    }

    // metodo para agregar un libro con excepcion si queda espacio
    public void agregarLibro(Libro libro) throws CatalogoLlenoException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.agregarLibro(libro);
    }

    // Metodo eliminar libro con excepcion
    public void eliminarLibro(int isbn) throws LibroNoEncontradoException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.eliminarLibro(isbn);
    }

    // Busca libro por isbn con excpecion
    public Libro buscarLibro(int isbn) throws LibroNoEncontradoException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        return catalogo.buscarLibro(isbn);
    }

    // Metodo para mostrar libro
    public void mostrarLibros() {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.mostrarLibros();
    }

    // Metodo para mostrar Todos los libros del catalogo
    public int cuantosLibros() {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        return catalogo.getCantidad();
    }

    public void guardarCatalogo(String ruta) throws IOException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.guardarCatalogo(ruta);
    }

    public void cargarCatalogo(String ruta) throws IOException, ClassNotFoundException {
        construirCatalogo(100); // capacidad arbitraria para reconstrucción
        catalogo.cargarCatalogo(ruta);
    }


    // Clase anidada Catalogo
    public class Catalogo {
        private int capacidad;
        private Hashtable<Integer, Libro> libros;

        // Constructor vacio
        public Catalogo() {}


        // Constructor conTodo
        public Catalogo(int capacidad) {
            this.capacidad = capacidad;
            this.libros = new Hashtable<>();
        }

        //
        public void agregarLibro(Libro libro) throws CatalogoLlenoException {
            if (libros.size() >= capacidad) {
                throw new CatalogoLlenoException("No hay espacio en el catálogo");
            }
            if (libros.containsKey(libro.getIsbn())) {
                System.out.println("El libro ya existe");
            } else {
                libros.put(libro.getIsbn(), libro);
            }
        }

        public void eliminarLibro(int isbn) throws LibroNoEncontradoException {
            if (!libros.containsKey(isbn)) {
                throw new LibroNoEncontradoException("Libro con ISBN " + isbn + " no encontrado");
            }
            libros.remove(isbn);
        }

        public Libro buscarLibro(int isbn) throws LibroNoEncontradoException {
            if (!libros.containsKey(isbn)) {
                throw new LibroNoEncontradoException("Libro con ISBN " + isbn + " no encontrado");
            }
            return libros.get(isbn);
        }

        public void mostrarLibros() {
            for (Libro libro : libros.values()) {
                libro.mostrarDatosLibro();
                System.out.println("------");
            }
        }

        public int getCantidad() {
            return libros.size();
        }

        public void guardarCatalogo(String ruta) throws IOException {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
                oos.writeObject(new ArrayList<>(libros.values()));
            }
        }

        public void cargarCatalogo(String ruta) throws IOException, ClassNotFoundException {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
                ArrayList<Libro> lista = (ArrayList<Libro>) ois.readObject();
                for (Libro libro : lista) {
                    libros.put(libro.getIsbn(), libro);
                }
            }
        }
    }

}
