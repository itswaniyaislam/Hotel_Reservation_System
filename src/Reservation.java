import java.util.ArrayList;
import java.util.Date;

public class Reservation {

    private int reservationNumber;
    private Date startDate;
    private Date endDate;
    private ArrayList<Room> rooms;

    public Reservation(int reservationNumber, Date startDate, Date endDate) {
        this.reservationNumber = reservationNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rooms = new ArrayList<>();
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
