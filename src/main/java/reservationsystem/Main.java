package reservationsystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Create Room Types
        RoomType single = new RoomType("Single", 100.0);
        RoomType doubleRoom = new RoomType("Double", 200.0);
        RoomType suite = new RoomType("Suite", 500.0);

        // 2️⃣ Create Rooms
        Room room101 = new Room(101, single);
        Room room102 = new Room(102, doubleRoom);
        Room room201 = new Room(201, suite);

        // 3️⃣ Create Hotels
        Hotel sunriseHotel = new Hotel("Sunrise Hotel");
        sunriseHotel.addRoom(room101);
        sunriseHotel.addRoom(room102);

        Hotel sunsetHotel = new Hotel("Sunset Hotel");
        sunsetHotel.addRoom(room201);

        // 4️⃣ Create Hotel Chain
        HotelChain chain = new HotelChain("Luxury Stays");
        chain.addHotel(sunriseHotel);
        chain.addHotel(sunsetHotel);

        // 5️⃣ Create Guests
        Guest john = new Guest("John Doe", "john@example.com");
        Guest jane = new Guest("Jane Smith", "jane@example.com");

        // 6️⃣ Create Reservations
        Date today = new Date();
        Date twoDaysLater = new Date(today.getTime() + 2L * 24 * 60 * 60 * 1000); // +2 days
        Date threeDaysLater = new Date(today.getTime() + 3L * 24 * 60 * 60 * 1000); // +3 days

        Reservation res1 = new Reservation(1001, today, twoDaysLater);
        res1.addRoom(room101);

        Reservation res2 = new Reservation(1002, today, threeDaysLater);
        res2.addRoom(room102);
        res2.addRoom(room201);

        // 7️⃣ Assign Reservations to ReserverPayer
        Reserverpayer rp1 = new Reserverpayer(null);
        rp1.assignReservation(res1);

        Reserverpayer rp2 = new Reserverpayer(null);
        rp2.assignReservation(res2);

        // 8️⃣ Make Reservations in Hotels
        chain.makeReservation(sunriseHotel, res1);
        chain.makeReservation(sunriseHotel, res2);
        chain.makeReservation(sunsetHotel, res2);

        // 9️⃣ Check-in Guests
        room101.checkInGuest(john);
        room102.checkInGuest(jane);
        room201.checkInGuest(jane);

        // 🔟 Print Hotel Info & Room Status
        System.out.println("---- Hotel Status ----");
        for (Hotel hotel : chain.getHotels()) {
            System.out.println("Hotel: " + hotel.getName());
            for (Room room : hotel.getRooms()) {
                System.out.println("Room " + room.getRoomNumber() +
                        " (" + (room.getOccupant() != null ? room.getOccupant().getName() : "Empty") + ")" +
                        " | Occupied: " + room.isOccupied());
            }
            System.out.println();
        }

        // 1️⃣1️⃣ Print Guest Reservations
        System.out.println("---- Guest Reservations ----");
        System.out.println(john.getName() + " -> Reservation #: " + rp1.getReservation().getReservationNumber());
        System.out.println(jane.getName() + " -> Reservation #: " + rp2.getReservation().getReservationNumber());

        // 1️⃣2️⃣ Check-out Guests
        room101.checkOutGuest();
        System.out.println("\nAfter checkout, Room 101 occupied: " + room101.isOccupied());
    }
}
