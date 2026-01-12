import java.util.ArrayList;
import java.util.Date;

public class Reservation {

    private int number;
    private Date startDate;
    private Date endDate;
    private ArrayList<Room> rooms;

    public Reservation(int number, Date startDate, Date endDate) {
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
