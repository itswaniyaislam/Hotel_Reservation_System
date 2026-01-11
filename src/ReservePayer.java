public class ReserverPayer {
    private Reservation reservation;
    private double amountPaid;

    // Constructor
    public ReserverPayer(Reservation reservation) {
        this.reservation = reservation;
    }

    public void makePayment(double amount) {
        amountPaid += amount;
        // TODO: additional payment logic
    }

    public void refundPayment(double amount) {
        amountPaid -= amount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }
}
