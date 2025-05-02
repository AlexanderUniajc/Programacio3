public class Main {
    public static void main(String[] args) {
        // Crear un usuario fundador
        Fundador fundador = new Fundador();
        fundador.nombre = "Ana";
        fundador.email = "ana@example.com";

        // Crear una fundación
        Fundacion fundacion = new Fundacion();
        fundador.gestionarFundacion(fundacion);

        // Crear evento
        Evento evento = new Evento("EVT01", java.time.LocalDateTime.now(), "Bogotá");
        fundacion.crearEvento(evento);

        // Registrar asistente al evento
        evento.registrarAsistente(fundador);

        // Agregar un documento
        Documento doc = new Documento(1, "Legal", "http://ejemplo.com/doc1.pdf", new java.util.Date());
        fundacion.agregarDocumento(doc);

        System.out.println("Fundación y evento creados exitosamente.");
    }
}

