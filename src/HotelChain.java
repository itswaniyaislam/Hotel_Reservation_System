import java.util.ArrayList;

public class HotelChain {

    private String name;
    private ArrayList<Hotel> hotels;

    public HotelChain(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Hotel chain name cannot be empty");
        }

        this.name = name;
        this.hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        if (hotel == null) {
            throw new IllegalArgumentException("Hotel cannot be null");
        }
        hotels.add(hotel);
    }

    public Hotel findHotelByName(String hotelName) {
        if (hotelName == null || hotelName.trim().isEmpty()) {
            return null;
        }

        for (Hotel hotel : hotels) {
            if (hotel.getName().equalsIgnoreCase(hotelName)) {
                return hotel;
            }
        }
        return null;
    }

    public void makeReservation(Hotel hotel, Reservation reservation) {
        if (hotel == null || reservation == null) {
            throw new IllegalArgumentException("Hotel and reservation cannot be null");
        }
        hotel.makeReservation(reservation);
    }
}
