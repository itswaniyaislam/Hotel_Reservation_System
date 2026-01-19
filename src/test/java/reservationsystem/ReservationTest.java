package reservationsystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    /* Constructor */

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void constructor_invalidNumber_throwsException(int number) {
        // Arrange
        Date start = new Date();
        Date end = new Date(start.getTime() + 1000);

        // Act & Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Reservation(number, start, end));
    }

    @Test
    void constructor_validData_createsReservation() {
        // Arrange
        Date start = new Date();
        Date end = new Date(start.getTime() + 1000);

        // Act
        Reservation reservation = new Reservation(1, start, end);

        // Assert
        assertEquals(1, reservation.getReservationNumber());
    }

    /* addRoom */

    @Test
    void addRoom_validRoom_added() {
        // Arrange
        Reservation reservation = new Reservation(1, new Date(),
                new Date(System.currentTimeMillis() + 1000));
        Room room = new Room(101);

        // Act
        reservation.addRoom(room);

        // Assert
        assertEquals(1, reservation.getRooms().size());
    }

    @Test
    void addRoom_nullRoom_throwsException() {
        // Arrange
        Reservation reservation = new Reservation(1, new Date(),
                new Date(System.currentTimeMillis() + 1000));

        // Act & Assert
        assertThrows(IllegalArgumentException.class,
                () -> reservation.addRoom(null));
    }
}
