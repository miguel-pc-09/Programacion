package model;

import enums.TipoFantasia;

public class Fantasia extends Libro {

    private TipoFantasia tipoFantasia; // Tipo de fantasía: épica, urbana, etc.

    // Constructor vacio
    public Fantasia() {}

    // Constructor conTodo
    public Fantasia(String titulo, String autor, int nPaginas, int isbn, TipoFantasia tipoFantasia) {
        super(titulo, autor, nPaginas, isbn);
        this.tipoFantasia = tipoFantasia;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatosLibro() {
        super.mostrarDatosLibro();
        System.out.println("Tipo de fantasía: " + tipoFantasia);
    }


    // Getters y Setters
    public TipoFantasia getTipoFantasia() {
        return tipoFantasia;
    }

    public void setTipoFantasia(TipoFantasia tipoFantasia) {
        this.tipoFantasia = tipoFantasia;
    }
}
