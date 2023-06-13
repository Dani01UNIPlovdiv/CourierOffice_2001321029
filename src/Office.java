import java.util.Scanner;

//singleton class courier office in Plovdiv with three desks, one for the city,one for Bulgaria, and one for abroad
public class Office {
    private static Office instance = null;
    private Office() {
        // Exists only to defeat instantiation.
    }
    public static Office getInstance() {
        if(instance == null) {
            instance = new Office();
        }
        return instance;
    }

    public void send(Package p) {
        if (p.getDestination().equals("Plovdiv")) {
            System.out.println("Package " + p.getId() + " is sent to Plovdiv");
        }
        else if (p.getDestination().equals("Bulgaria")) {
            System.out.println("Package " + p.getId() + " is sent to Bulgaria");
        }
        else if (p.getDestination().equals("Abroad")) {
            System.out.println("Package " + p.getId() + " is sent to Abroad");
        }
        else {
            System.out.println("Package " + p.getId() + " is sent to " + p.getDestination());
        }
    }
}