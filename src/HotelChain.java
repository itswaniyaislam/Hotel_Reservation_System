import java.util.ArrayList;

public class HotelChain {
    private String chainName;
    private ArrayList<Hotel> hotels = new ArrayList<>();

    public HotelChain(String chainName) {
        this.chainName = chainName;
    }

    public void addHotel(Hotel hotel) {
        if (hotel != null && !hotels.contains(hotel)) {
            hotels.add(hotel);
        }
    }

    public void removeHotel(Hotel hotel) {
        hotels.remove(hotel);
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }
}
