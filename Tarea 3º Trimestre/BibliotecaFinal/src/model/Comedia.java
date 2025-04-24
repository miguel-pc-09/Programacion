package model;

import enums.TipoHumor;

public class Comedia extends Libro {

    private TipoHumor tipoHumor;

    // Constructor vacio
    public Comedia() {}

    // Constructor conTodo
    public Comedia(String titulo, String autor, int nPaginas, int isbn, TipoHumor tipoHumor) {
        super(titulo, autor, nPaginas, isbn);
        this.tipoHumor = tipoHumor;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatosLibro() {
        super.mostrarDatosLibro();
        System.out.println("Tipo de humor: " + tipoHumor);
    }

    // Getters y Setters

    public TipoHumor getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(TipoHumor tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
