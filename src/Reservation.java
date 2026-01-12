import java.util.ArrayList;
import java.util.Date;

public class Reservation {

    private int reservationNumber;
    private Date startDate;
    private Date endDate;
    private ArrayList<Room> rooms;

    public Reservation(int reservationNumber, Date startDate, Date endDate) {
        if (reservationNumber <= 0) {
            throw new IllegalArgumentException("Reservation number must be positive");
        }
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        if (endDate.before(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }

        this.reservationNumber = reservationNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rooms = new ArrayList<>();
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
