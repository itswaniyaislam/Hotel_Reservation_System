package reservationsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuestTest {

    @Test
    public void testGuestCreationValid() {
        Guest g = new Guest("John", "john@example.com");
        assertEquals("John", g.getName());
        assertEquals("john@example.com", g.getContactInfo());
    }

    @Test
    public void testGuestCreationInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Guest("", "contact");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Guest("John", "");
        });
    }

    @Test
    public void testUpdateInfo() {
        Guest g = new Guest("John", "john@example.com");
        g.updateInfo("Jane", "jane@example.com");
        assertEquals("Jane", g.getName());
        assertEquals("jane@example.com", g.getContactInfo());
    }
}
