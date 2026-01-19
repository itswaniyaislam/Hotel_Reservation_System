package reservationsystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RoomTypeTest {

    /* Constructor */

    @ParameterizedTest
    @NullAndEmptySource
    void constructor_invalidKind_throwsException(String kind) {
        // Act & Assert
        assertThrows(IllegalArgumentException.class,
                () -> new RoomType(kind, 100));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, -50})
    void constructor_negativeCost_throwsException(double cost) {
        // Act & Assert
        assertThrows(IllegalArgumentException.class,
                () -> new RoomType("Single", cost));
    }

    @Test
    void constructor_validData_createsRoomType() {
        // Arrange
        RoomType type = new RoomType("Single", 120);

        // Assert
        assertEquals("Single", type.getKind());
        assertEquals(120, type.getCost());
    }
}
