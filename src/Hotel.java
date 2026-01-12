import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Room management
    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
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
        if (reservation != null) {
            reservations.add(reservation);
        }
    }

    public void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
    }
}
