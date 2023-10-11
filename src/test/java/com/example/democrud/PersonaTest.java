import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {

    @Test
    public void testGetNombre() {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        assertEquals("Juan", persona.getNombre());
    }
}