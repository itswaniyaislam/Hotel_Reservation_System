package reservationsystem;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReserverpayerTest {

    @Test
    void assignReservation_validReservation_assigned() {
        // Arrange
        Reserverpayer reserverpayer = new Reserverpayer(null);
        Reservation reservation =
                new Reservation(1, new Date(), new Date(System.currentTimeMillis() + 1000));

        // Act
        reserverpayer.assignReservation(reservation);

        // Assert
        assertEquals(reservation, reserverpayer.getReservation());
    }

    @Test
    void assignReservation_nullReservation_throwsException() {
        // Arrange
        Reserverpayer reserverpayer = new Reserverpayer(null);

        // Act & Assert
        assertThrows(IllegalArgumentException.class,
                () -> reserverpayer.assignReservation(null));
    }
}
