public class ReserverPayer {

    private CreditCard creditCardDetails;
    private Reservation reservation;

    public ReserverPayer(CreditCard creditCardDetails) {
        if (creditCardDetails == null) {
            throw new IllegalArgumentException("Credit card details required");
        }
        this.creditCardDetails = creditCardDetails;
    }

    public void assignReservation(Reservation reservation) {
        if (reservation == null) {
            throw new IllegalArgumentException("Reservation cannot be null");
        }
        this.reservation = reservation;
    }
}
