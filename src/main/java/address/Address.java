package address;

public class Address {
    private static long counter = 1;
    private long id;
    private String city;
    private String zipCode;
    private String street;
    private String streetNo;
    private String homeNo;

    public Address() {
        this.id = counter++;
    }

    public Address(String city, String zipCode, String street, String streetNo) {
        this.id = counter++;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.streetNo = streetNo;
    }

    public Address(String city, String zipCode, String street, String streetNo, String homeNo) {
        this.id = counter++;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.streetNo = streetNo;
        this.homeNo = homeNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }
}
