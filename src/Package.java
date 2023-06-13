public class Package {
    private String id; /* Package id */
    private String description; /* Package description */
    private String destination; /* Package destination */
    private double price; /* Package price */
    public Package(String number, String description1, String destination, double price) {
        this.id = number; /* Set the id */
        this.description = description1; /* Set the description */
        this.destination = destination; /* Set the destination */
        this.price = price; /* Set the price */
    } /* End of constructor */
    public String getId() {
        return id; /* Return the id */
    } /* End of getters and setters */
    public String getDescription() {
        return description; /* Return the description */
    } /* End of getters and setters */
    public String getDestination() {
        return destination; /* Return the destination */
    } /* End of getters and setters */
    public double getPrice() {
        return price; /* Return the price */
    } /* End of getters and setters */
    public void setId(String id) {
        this.id = id; /* Set the id */
    } /* End of getters and setters */
    public void setDescription(String description) {
        this.description = description; /* Set the description */
    } /* End of getters and setters */
    public void setDestination(String destination) {
        this.destination = destination; /* Set the destination */
    } /* End of getters and setters */
    public void setPrice(double price) { /* Set the price */
        this.price = price; /* Set the price */
    } /* End of getters and setters */
} /* End of class Package */