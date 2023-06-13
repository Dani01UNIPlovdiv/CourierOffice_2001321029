public class PackagingMachine { /* Packaging machine class */
    private static PackagingMachine instance = null; /* Create a packaging machine */
    private PackagingMachine() { /* Constructor */
    } /* End of constructor */
    public static PackagingMachine getInstance() { /* Get instance method */
        if(instance == null) { /* Check if the packaging machine is null */
            instance = new PackagingMachine(); /* Create a new packaging machine */
        } /* End of if */
        return instance; /* Return the packaging machine */
    } /* End of getInstance */
    public void pack(Package p) { /* Pack method */
        System.out.println("Package " + p.getId() + " is packed"); /* Print package is packed */
    } /* End of pack */
} /* End of class PackagingMachine */
