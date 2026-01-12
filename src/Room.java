public class Room {

    private int roomNumber;
    private RoomType roomType;
    private Guest occupant;

    public Room(int roomNumber, RoomType roomType) {
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

    // A room can have only one guest at a time
    public void checkInGuest(Guest guest) {
        if (guest != null && !isOccupied()) {
            this.occupant = guest;
        }
    }

    public void checkOutGuest() {
        this.occupant = null;
    }
}
