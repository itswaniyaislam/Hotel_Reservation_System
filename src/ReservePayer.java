public class ReserverPayer {
    private Reservation reservation;
    private double amountPaid;

    public ReserverPayer(Reservation reservation) {
        this.reservation = reservation;
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            amountPaid += amount;
        }
    }

    public void refundPayment(double amount) {
        if (amount > 0 && amount <= amountPaid) {
            amountPaid -= amount;
        }
    }

    public double getAmountPaid() {
        return amountPaid;
    }
}
