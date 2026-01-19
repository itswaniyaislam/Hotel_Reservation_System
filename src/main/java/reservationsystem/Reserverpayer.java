package reservationsystem;
public class Reserverpayer {
    private Object creditCardDetails; // Using Object/null for demo
    private Reservation reservation;

    public Reserverpayer(Object creditCardDetails) {
        // Accept null for demo purpose
        this.creditCardDetails = creditCardDetails;
    }

    public void assignReservation(Reservation reservation) {
        if (reservation == null) throw new IllegalArgumentException("Reservation cannot be null");
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }
}
