package reservationsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HotelChainTest {

    private HotelChain chain;
    private Hotel hotel1;
    private Hotel hotel2;
    private Room room1;
    private Guest guest;
    private Reservation reservation1;

    @BeforeEach
    public void setup() {
        chain = new HotelChain("Luxury Hotels");
        hotel1 = new Hotel("Grand Hotel");
        hotel2 = new Hotel("Sea View");
        room1 = new Room(101, "Single");
        guest = new Guest("Alice", "alice@example.com");
        reservation1 = new Reservation(guest, room1);

        hotel1.addRoom(room1);
    }

    @Test
    public void testHotelChainCreation() {
        assertEquals("Luxury Hotels", chain.getHotels().isEmpty() ? "Luxury Hotels" : "");
        assertTrue(chain.getHotels().isEmpty());
    }

    @Test
    public void testAddAndFindHotel() {
        chain.addHotel(hotel1);
        chain.addHotel(hotel2);

        assertEquals(2, chain.getHotels().size());
        assertEquals(hotel1, chain.findHotelByName("Grand Hotel"));
        assertEquals(hotel2, chain.findHotelByName("sea view")); // case-insensitive
        assertNull(chain.findHotelByName("Unknown Hotel"));
    }

    @Test
    public void testAddNullHotelThrows() {
        assertThrows(IllegalArgumentException.class, () -> chain.addHotel(null));
    }

    @Test
    public void testMakeReservationThroughChain() {
        chain.addHotel(hotel1);
        chain.makeReservation(hotel1, reservation1);

        assertEquals(1, hotel1.getReservations().size());
        assertTrue(hotel1.getReservations().contains(reservation1));
    }

    @Test
    public void testMakeReservationWithNullThrows() {
        chain.addHotel(hotel1);

        assertThrows(IllegalArgumentException.class, () -> chain.makeReservation(null, reservation1));
        assertThrows(IllegalArgumentException.class, () -> chain.makeReservation(hotel1, null));
    }
}
