import java.util.ArrayList;

public class Hotel {
    private String name;
    private String location;
    private ArrayList<Room> rooms = new ArrayList<>();

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addRoom(Room room) {
        if (room != null && !rooms.contains(room)) {
            rooms.add(room);
        }
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public Room findRoom(int roomNumber) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNumber) {
                return r;
            }
        }
        return null;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
