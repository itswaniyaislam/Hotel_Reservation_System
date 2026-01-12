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
            return;
        }
        hotels.add(hotel);
    }

    public Hotel findHotelByName(String hotelName) {
        for (Hotel hotel : hotels) {
            if (hotel.getName().equalsIgnoreCase(hotelName)) {
                return hotel;
            }
        }
        return null;
    }

    public void makeReservation(Hotel hotel, Reservation reservation) {
        if (canMakeReservation(hotel, reservation)) {
            hotel.makeReservation(reservation);
        }
    }

    public void cancelReservation(Hotel hotel, Reservation reservation) {
        if (canCancelReservation(hotel, reservation)) {
            hotel.cancelReservation(reservation);
        }
    }

    private boolean canMakeReservation(Hotel hotel, Reservation reservation) {
        return hotel != null && reservation != null;
    }

    private boolean canCancelReservation(Hotel hotel, Reservation reservation) {
        return hotel != null && reservation != null;
    }
}
