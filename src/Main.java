import java.util.Scanner;
public class Main {
    public static void main(String[] args) { /* Main method */
        Scanner sc = new Scanner(System.in); /* Create a Scanner object */
        System.out.println("Enter number of packages: "); /* Print enter number of packages */
        int n = sc.nextInt(); /* Read user input */
        Package[] packages = new Package[n]; /* Create an array of packages */
        for (int i = 0; i < n; i++) { /* Loop through the array */
            System.out.println("Enter package id: "); /* Print enter id */
            String id = sc.next(); /* Read user input */
            System.out.println("Enter package description: "); /* Print enter description */
            String description = sc.next(); /* Read user input */
            System.out.println("Enter package destination: "); /* Print enter destination */
            String destination = sc.next(); /* Read user input */
            System.out.println("Enter package price: "); /* Print enter price */
            double price = sc.nextDouble(); /* Read user input */
            packages[i] = new Package(id, description, destination, price); /* Create a new package */
        } /* End of loop */
        PackagingMachine pm = PackagingMachine.getInstance(); /* Create a packaging machine */
        Office o = Office.getInstance(); /* Create an office */
        for (int i = 0; i < n; i++) { /* Loop through the array */
            pm.pack(packages[i]); /* Pack the package */
        } /* End of loop */
        for (int i = 0; i < n; i++) { /* Loop through the array */
            for (int j = 0; j < n - i-1; j++) { /* Loop through the array */
                if (packages[j].getDestination().compareTo(packages[j+1].getDestination()) > 0) { /* Compare the destinations */
                    Package temp = packages[j]; /* Swap the packages */
                    packages[j] = packages[j+1]; /* Swap the packages */
                    packages[j+1] = temp; /* Swap the packages */
                } /* End of if */
            } /* End of loop */
        } /* End of loop */
        for (int i = 0; i < n; i++) { /* Loop through the array */
            o.send(packages[i]); /* Send the package */
        } /* End of loop */
    } /* End of main */
} /* End of class Main */