public class ReserverPayer {

    private CreditCard creditCardDetails;
    private Reservation reservation;

    public ReserverPayer(CreditCard creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }

    public void assignReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
