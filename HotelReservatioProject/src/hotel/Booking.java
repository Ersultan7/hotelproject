package hotel;

public class Booking {
    private Room room;
    private Guest guest;
    private int numberOfNights;


    public Booking(Room room, Guest guest, int numberOfNights) {
        this.room = room;
        this.guest = guest;
        this.numberOfNights = numberOfNights;
    }



    public double getTotalCost() {
        return room.getPricePerNight() * numberOfNights;
    }


    public void displayBookingInfo() {
        System.out.println("Booking Information:");
        room.displayRoomInfo();
        guest.displayGuestInfo();
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("Total Cost: $" + getTotalCost());
    }
}