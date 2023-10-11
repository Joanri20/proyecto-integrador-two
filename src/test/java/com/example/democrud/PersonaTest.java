package com.example.democrud;

import com.example.democrud.model.Persona;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {

    @Test
    public void testGetNombre() {
        Persona persona = new Persona();
        persona.setNombre("Johny");
        assertEquals("Johny", persona.getNombre());
    }

    @Test
    public void testSetNombre() {
        Persona persona = new Persona();
        persona.setApellido("Marin");
    }

    @Test
    public void testSetDireccion(){
        Persona persona = new Persona();
        persona.setDireccion("Calle falsa 123");
        assertEquals("Calle falsa 123", persona.getDireccion());
    }

    @Test
    public void testSetTelefono(){
        Persona persona = new Persona();
        persona.setTelefono("604-1234");
        assertEquals("604-1234", persona.getTelefono());
    }

}