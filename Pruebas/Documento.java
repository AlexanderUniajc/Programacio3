class Documento {
    private int id;
    private String tipo;
    private String url;
    private java.util.Date fechaSubida;

    public Documento(int id, String tipo, String url, java.util.Date fechaSubida) {
        this.id = id;
        this.tipo = tipo;
        this.url = url;
        this.fechaSubida = fechaSubida;
    }

    public String getTipo() {
        return tipo;
    }
}