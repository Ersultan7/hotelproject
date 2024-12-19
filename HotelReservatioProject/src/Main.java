import hotel.Room;
import hotel.Guest;
import hotel.Booking;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(77, "Deluxe", 150.0);
        Guest guest1 = new Guest("Yerasyl", "Kazakhstan");
        Booking booking1 = new Booking(room1, guest1, 3);

        Room room2 = new Room(111, "Standard", 100.0);
        Guest guest2 = new Guest("Temirlan", "Kazakhstan");
        Booking booking2 = new Booking(room2, guest2, 3);

        booking1.displayBookingInfo();
        System.out.println();
        booking2.displayBookingInfo();


        System.out.println("\nComparing Total Costs:");
        if (booking1.getTotalCost() > booking2.getTotalCost()) {
            System.out.println("Booking 1 is more expensive.");
        } else if (booking1.getTotalCost() < booking2.getTotalCost()) {
            System.out.println("Booking 2 is more expensive.");
        } else {
            System.out.println("Both bookings have the same total cost.");
        }
    }
}
