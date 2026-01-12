public class Room {

    private int number;
    private RoomType type;
    private Guest occupant;

    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
        this.occupant = null;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public void createGuest(Guest guest) {
        this.occupant = guest;
    }

    public void checkoutGuest() {
        this.occupant = null;
    }

    public int getNumber() {
        return number;
    }
}
