public class RoomType {
    private String typeName;
    private double price;

    public RoomType(String typeName, double price) {
        this.typeName = typeName;
        this.price = price;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getPrice() {
        return price;
    }
}
