public class Reservation {
    private Guest guest;
    private Room room;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(Guest guest, Room room, String checkInDate, String checkOutDate) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void makeReservation() {
        if (room != null && room.isAvailable()) {
            room.bookRoom();
        }
    }

    public void cancelReservation() {
        if (room != null && !room.isAvailable()) {
            room.cancelBooking();
        }
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }
}
