public class PackagingMachine {
    private static PackagingMachine instance = null;
    private PackagingMachine() {
        // Exists only to defeat instantiation.
    }
    public static PackagingMachine getInstance() {
        if(instance == null) {
            instance = new PackagingMachine();
        }
        return instance;
    }
    public void pack(Package p) {
        System.out.println("Package " + p.getId() + " is packed");
    }
}
