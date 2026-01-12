import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Hotel name cannot be empty");
        }

        this.name = name;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Room management
    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        rooms.add(room);
    }

    public Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    // Reservation management
    public void makeReservation(Reservation reservation) {
        if (reservation == null) {
            throw new IllegalArgumentException("Reservation cannot be null");
        }
        if (reservations.contains(reservation)) {
            throw new IllegalStateException("Reservation already exists");
        }
        reservations.add(reservation);
    }

    public void cancelReservation(Reservation reservation) {
        if (!reservations.remove(reservation)) {
            throw new IllegalStateException("Reservation not found");
        }
    }
}
