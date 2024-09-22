import java.io.*;
import java.util.*;

class Product {
    private String pro_name;
    private double cost;
    private String manufacturer;
    private double max_disc;

    public Product(String pro_name, double cost, String manufacturer, double max_disc) {
        this.pro_name = pro_name;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.max_disc = max_disc;
    }

    public String getpro_name() {
        return pro_name;
    }

    public void setpro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getmax_disc() {
        return max_disc;
    }

    public void setmax_disc(double max_disc) {
        this.max_disc = max_disc;
    }

    @Override
    public String toString() {
        return "Product-name=" + pro_name + ", Cost=" + cost + ", Manufacturer=" + manufacturer
                + ", Discount=" + max_disc;
    }
}

public class Pract_07 {
    public static void main(String[] args) {
        ArrayList<Product> list = readProductsFromFile("product.txt");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. List of products");
            System.out.println("2. Max discount");
            System.out.println("3. Products sorted by cost");
            System.out.println("4. Products sorted by manufacturer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProducts(list);
                    break;
                case 2:
                    displayProductsmax_disc(list);
                    break;
                case 3:
                    sortProductsByCost(list);
                    break;
                case 4:
                    sortProductsByManufacturer(list);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static ArrayList<Product> readProductsFromFile(String fileName) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String pro_name = parts[0].trim();
                    double cost = Double.parseDouble(parts[1].trim());
                    String manufacturer = parts[2].trim();
                    double max_disc = Double.parseDouble(parts[3].trim());
                    list.add(new Product(pro_name, cost, manufacturer, max_disc));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            e.printStackTrace();
        }
        return list;
    }

    private static void displayProducts(ArrayList<Product> list) {
        System.out.println("List of Products:");
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**************************");
    }

    private static void displayProductsmax_disc(ArrayList<Product> list) {
        System.out.println("Products with max discount of 50%:");
        for (Product product : list) {
            if (product.getmax_disc() == 0.5) {
                double finalCost = product.getCost() * (1 - product.getmax_disc());
                System.out.println(product.getpro_name() + " - Final Cost: " + finalCost);
            }
        }
        System.out.println("**************************");
    }

    private static void sortProductsByCost(ArrayList<Product> list) {
        Collections.sort(list, (p1, p2) -> Double.compare(p1.getCost(), p2.getCost()));
        System.out.println("Products sorted by cost:");
        displayProducts(list);
        System.out.println("**************************");
    }

    private static void sortProductsByManufacturer(ArrayList<Product> list) {
        Collections.sort(list, (p1, p2) -> p1.getManufacturer().compareTo(p2.getManufacturer()));
        System.out.println("Products sorted by manufacturer:");
        displayProducts(list);
        System.out.println("**************************");
    }
}
