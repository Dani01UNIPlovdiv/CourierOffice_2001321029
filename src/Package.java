public class Package {
    private String id;
    private String description;
    private String destination;
    private double price;

    public Package(String number, String description1, String destination, double price) {
        this.id = number;
        this.description = description1;
        this.destination = destination;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public String getDestination() {
        return destination;
    }
    public double getPrice() {
        return price;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}