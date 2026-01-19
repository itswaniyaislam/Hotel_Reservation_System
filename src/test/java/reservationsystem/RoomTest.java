package reservationsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkInGuest_roomBecomesOccupied() {
        // Arrange
        RoomType type = new RoomType("Single", 100);
        Room room = new Room(1, type);
        Guest guest = new Guest("Ali");

        // Act
        room.checkInGuest(guest);

        // Assert
        assertTrue(room.isOccupied());
    }
}
