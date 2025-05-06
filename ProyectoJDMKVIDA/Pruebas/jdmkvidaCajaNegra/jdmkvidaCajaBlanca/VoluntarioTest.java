@Test
public void testRegistrarActividadDuplicada() {
    voluntario.registrarActividad(actividad);
    voluntario.registrarActividad(actividad);
    assertEquals(1, voluntario.getActividades().size());
}

@Test
public void testRegistrarActividadNull() {
    try {
        voluntario.registrarActividad(null);
        fail("Se esperaba una excepción al registrar una actividad nula.");
    } catch (NullPointerException e) {
        assertNotNull(e.getMessage());
    }
}

@Test
public void testGetDisponibilidad() {
    assertEquals("Fines de semana", voluntario.getDisponibilidad());
}

@Test
public void testSetDisponibilidad() {
    voluntario.setDisponibilidad("Lunes a viernes");
    assertEquals("Lunes a viernes", voluntario.getDisponibilidad());
}

@Test
public void testSetHabilidades() {
    String[] nuevasHabilidades = {"Mecánica", "Primeros Auxilios"};
    voluntario.setHabilidades(nuevasHabilidades);
    String[] habilidades = voluntario.getHabilidades();
    assertEquals(2, habilidades.length);
    assertEquals("Mecánica", habilidades[0]);
    assertEquals("Primeros Auxilios", habilidades[1]);
}
        assertEquals(1, voluntario.getActividades().size());
        assertEquals(actividad, voluntario.getActividades().get(0));
    }

    @Test
    public void testGetHabilidades() {
        String[] habilidades = voluntario.getHabilidades();
        assertNotNull(habilidades);
        assertEquals(3, habilidades.length);
        assertEquals("Enseñanza", habilidades[0]);
        assertEquals("Programación", habilidades[1]);
        assertEquals("Cocina", habilidades[2]);
    }
}
