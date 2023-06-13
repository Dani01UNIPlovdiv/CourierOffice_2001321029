public class Office {
    private static Office instance = null; /* Create an instance */
    private Office() { /* Constructor */
    } /* End of constructor */
    public static Office getInstance() { /* Singleton */
        if(instance == null) { /* Check if the instance is null */
            instance = new Office(); /* Create an instance */
        }
        return instance; /* Return the instance */
    } /* End of singleton */

    public void send(Package p) {
        if (p.getDestination().equals("Plovdiv")) {
            System.out.println("Package " + p.getId() + " is sent to Plovdiv"); /* Print the package id */
        }
        else if (p.getDestination().equals("Bulgaria")) {
            System.out.println("Package " + p.getId() + " is sent to Bulgaria"); /* Print the package id */
        }
        else if (p.getDestination().equals("Abroad")) {
            System.out.println("Package " + p.getId() + " is sent to Abroad"); /* Print the package id */
        }
        else {
            System.out.println("Package " + p.getId() + " is sent to " + p.getDestination()); /* Print the package id */
        } /* End of if */
    } /* End of send */
} /* End of class Office */