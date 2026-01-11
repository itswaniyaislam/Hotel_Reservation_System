public class Room {
    private int roomNumber;
    private RoomType type;
    private boolean available = true;

    // Constructor
    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        // TODO: booking logic
        available = false;
    }

    public void cancelBooking() {
        available = true;
    }
}
