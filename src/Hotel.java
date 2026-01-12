import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<RoomType> roomTypes;
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel(String name) {
        this.name = name;
        this.roomTypes = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // RoomType management
    public void addRoomType(RoomType type) {
        roomTypes.add(type);
    }

    public ArrayList<RoomType> getRoomTypes() {
        return roomTypes;
    }

    // Room management
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findRoom(int roomNumber) {
        for (Room r : rooms) {
            if (r.getNumber() == roomNumber) {
                return r;
            }
        }
        return null;
    }

    // Reservation management
    public Reservation createReservation(Reservation reservation) {
        reservations.add(reservation);
        return reservation;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getName() {
        return name;
    }
}
