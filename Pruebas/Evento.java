import java.util.ArrayList;
class Evento {
    private String id;
    private java.time.LocalDateTime fecha;
    private String ubicacion;
    private ArrayList<Usuario> asistentes = new ArrayList<>();

    public Evento() {}

    public Evento(String id, java.time.LocalDateTime fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public void registrarAsistente(Usuario usuario) {
        asistentes.add(usuario);
        System.out.println("Asistente registrado: " + usuario.nombre);
    }
}