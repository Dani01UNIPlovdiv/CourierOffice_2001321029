import java.util.Scanner;

//create office with singleton pattern, and packaging machine with factory pattern, package processing and use them in Main.java
public class Main {
    public static void main(String[] args) {
        //create array of packages
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of packages: ");
        int n = sc.nextInt();
        Package[] packages = new Package[n];
        //address packages individually
        for (int i = 0; i < n; i++) {
            System.out.println("Enter package id: ");
            String id = sc.next();
            System.out.println("Enter package description: ");
            String description = sc.next();
            System.out.println("Enter package destination: ");
            String destination = sc.next();
            System.out.println("Enter package price: ");
            double price = sc.nextDouble();
            packages[i] = new Package(id, description, destination, price);
        }
        //create packaging machine
        PackagingMachine pm = PackagingMachine.getInstance();
        Office o = Office.getInstance();
        //pack packages
        for (int i = 0; i < n; i++) {
            pm.pack(packages[i]);
        }
        //sort packages individually by destination
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (packages[j].getDestination().compareTo(packages[j+1].getDestination()) > 0) {
                    Package temp = packages[j];
                    packages[j] = packages[j+1];
                    packages[j+1] = temp;
                }
            }
        }
        //send packages
        for (int i = 0; i < n; i++) {
            o.send(packages[i]);
        }
    }
}