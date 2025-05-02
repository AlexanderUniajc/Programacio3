class Encuesta {
    private String[] preguntas;

    public void analizarResultados() {}
}
// Interfaz ContenidoEducativo
interface ContenidoEducativo {
    java.util.Date fechaCreacion = null;
    Usuario autor = null;

    void mostrarContenido();
    void editarContenido();
    void eliminarContenido();
}