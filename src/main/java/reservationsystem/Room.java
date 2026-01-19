package reservationsystem;
public class Room {
    private int roomNumber;
    private RoomType roomType;
    private Guest occupant;

    public Room(int roomNumber, RoomType roomType) {
        if (roomNumber <= 0) throw new IllegalArgumentException("Room number must be positive");
        if (roomType == null) throw new IllegalArgumentException("Room type cannot be null");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupant = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public void checkInGuest(Guest guest) {
        if (guest == null) throw new IllegalArgumentException("Guest cannot be null");
        if (isOccupied()) throw new IllegalStateException("Room is already occupied");
        occupant = guest;
    }

    public void checkOutGuest() {
        if (!isOccupied()) throw new IllegalStateException("Room is already empty");
        occupant = null;
    }

    public Guest getOccupant() {
        return occupant;
    }
}
