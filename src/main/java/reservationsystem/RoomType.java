package reservationsystem;
public class RoomType {
    private String kind;
    private double cost;

    public RoomType(String kind, double cost) {
        if (kind == null || kind.trim().isEmpty()) {
            throw new IllegalArgumentException("Room type must have a name");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Room cost cannot be negative");
        }
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() {
        return kind;
    }

    public double getCost() {
        return cost;
    }
}
