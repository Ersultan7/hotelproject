package hotel;

public class Guest {
    private String name;
    private String country;


    public Guest(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public void displayGuestInfo() {
        System.out.println("Name: " + name);
        System.out.println("From: " + country);
    }
}