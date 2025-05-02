import java.util.ArrayList;
class Fundacion {
    private Usuario usuario;
    private String estadoVerificacion;
    private ArrayList<Documento> documentos = new ArrayList<>();
    private ArrayList<Evento> eventos = new ArrayList<>();

    public void agregarDocumento(Documento doc) {
        documentos.add(doc);
        System.out.println("Documento agregado: " + doc.getTipo());
    }

    public void crearEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento creado con ID: " + evento.getId());
    }
}