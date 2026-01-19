package reservationsystem;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private int reservationNumber;
    private Date startDate;
    private Date endDate;
    private ArrayList<Room> rooms;

    public Reservation(int reservationNumber, Date startDate, Date endDate) {
        if (reservationNumber <= 0) throw new IllegalArgumentException("Reservation number must be positive");
        if (startDate == null || endDate == null) throw new IllegalArgumentException("Dates cannot be null");
        if (endDate.before(startDate)) throw new IllegalArgumentException("End date cannot be before start date");

        this.reservationNumber = reservationNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rooms = new ArrayList<>();
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void addRoom(Room room) {
        if (room == null) throw new IllegalArgumentException("Room cannot be null");
        if (rooms.contains(room)) throw new IllegalStateException("Room already added to reservation");
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return new ArrayList<>(rooms); // defensive copy
    }

    public Date getStartDate() {
        return new Date(startDate.getTime()); // defensive copy
    }

    public Date getEndDate() {
        return new Date(endDate.getTime()); // defensive copy
    }
}
