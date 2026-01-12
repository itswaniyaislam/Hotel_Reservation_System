import java.util.ArrayList;

public class HotelChain {

    private String name;
    private ArrayList<Hotel> hotels;

    public HotelChain(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        if (hotel == null) {
            throw new IllegalArgumentException("Hotel cannot be null");
        }
        hotels.add(hotel);
    }

    public Hotel findHotel(String hotelName) {
        for (Hotel h : hotels) {
            if (h.getName().equalsIgnoreCase(hotelName)) {
                return h;
            }
        }
        return null;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }
}
