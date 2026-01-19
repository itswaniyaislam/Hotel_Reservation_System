package reservationsystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    /* Constructor */

    @ParameterizedTest
    @NullAndEmptySource
    void constructor_invalidName_throwsException(String name) {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> new Hotel(name));
    }

    /* addRoom */

    @Test
    void addRoom_validRoom_addedSuccessfully() {
        // Arrange
        Hotel hotel = new Hotel("Hotel");
        Room room = new Room(1);

        // Act
        hotel.addRoom(room);

        // Assert
        assertEquals(1, hotel.getRooms().size());
    }

    /* findRoomByNumber */

    @Test
    void findRoom_existingRoom_returnsRoom() {
        // Arrange
        Hotel hotel = new Hotel("Hotel");
        hotel.addRoom(new Room(101));

        // Act
        Room room = hotel.findRoomByNumber(101);

        // Assert
        assertNotNull(room);
    }

    /* makeReservation */

    @Test
    void makeReservation_validReservation_added() {
        // Arrange
        Hotel hotel = new Hotel("Hotel");
        Reservation reservation = new Reservation("Ali");

        // Act
        hotel.makeReservation(reservation);

        // Assert
        assertEquals(1, hotel.getReservations().size());
    }

    /* cancelReservation */

    @Test
    void cancelReservation_existingReservation_removed() {
        // Arrange
        Hotel hotel = new Hotel("Hotel");
        Reservation reservation = new Reservation("Ali");
        hotel.makeReservation(reservation);

        // Act
        hotel.cancelReservation(reservation);

        // Assert
        assertTrue(hotel.getReservations().isEmpty());
    }
}
