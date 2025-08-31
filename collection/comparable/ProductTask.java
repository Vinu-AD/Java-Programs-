package collection.comparable;

import java.util.*;

class Product  {
    int prodId;
    String prodName;
    String category;
    double prodPrice;

    public Product(int prodId, String prodName, String category, double prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.category = category;
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %-5d  Product Name: %-15s Product Category: %-10s  Product Price: %,-10.2f\n", prodId, prodName, category, prodPrice);
    }
}

public class ProductTask {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();

    private static void addProducts() {
        products.add(new Product(101, "Oppo", "Mobile", 17000));
        products.add(new Product(102, "Realme Tablet", "Tablet", 15000));
        products.add(new Product(103, "Realme", "Mobile", 15000));
        products.add(new Product(104, "iPad", "Tablet", 50000));
        products.add(new Product(105, "Samsung Tablet", "Tablet", 20000));
        products.add(new Product(106, "Redmi", "Mobile", 12000));
        products.add(new Product(107, "Asus", "Laptop", 50000));
        products.add(new Product(108, "MacBook", "Laptop", 80000));
        products.add(new Product(109, "Oneplus Tablet", "Tablet", 25000));
        products.add(new Product(110, "Acer", "Laptop", 30000));
        products.add(new Product(111, "Vivo", "Mobile", 18000));
        products.add(new Product(112, "HP", "Laptop", 58000));
        products.add(new Product(113, "Redmi Tablet", "Tablet", 15000));
        products.add(new Product(114, "Lenovo", "Laptop", 40000));
        products.add(new Product(115, "Poco", "Mobile", 13000));
        products.add(new Product(116, "Samsung", "TV", 30000));
    }

    private static void options() {
        System.out.println();
        System.out.println("1. sort by ID");
        System.out.println("2. sort by Name");
        System.out.println("3. view by Category");
        System.out.println("4. sort by Price");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void sortById(boolean isAsc) {
        Comparator<Product> id = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (isAsc) return o1.prodId - o2.prodId;
                else return o2.prodId - o1.prodId;
            }
        };
        products.sort(id);
        System.out.println(products);
    }

    private static void sortByName(boolean isAscending) {
        Comparator<Product> name = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (isAscending) {
                    if (o1.prodName.compareTo(o2.prodName) > 0) return 1;
                    else if (o1.prodName.compareTo(o2.prodName) < 0) return -1;
                    else {
                        return Integer.compare(o1.prodId, o2.prodId);
                    }
                } else {
                    if (o2.prodName.compareTo(o1.prodName) > 0) return 1;
                    else if (o2.prodName.compareTo(o1.prodName) < 0) return -1;
                    else {
                        return Integer.compare(o1.prodId, o2.prodId);
                    }
                }
            }
        };
        products.sort(name);
        System.out.println(products);
    }

    private static void sortByPrice(boolean isAscending) {
        Comparator<Product> category = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (isAscending) {
                    if (o1.prodPrice > o2.prodPrice) return 1;
                    else if (o1.prodPrice < o2.prodPrice) return -1;
                    else {
                        if (o2.category.compareTo(o1.category) > 0) return 1;
                        else if (o2.category.compareTo(o1.category) < 0) return -1;
                        else return Integer.compare(o1.prodId, o2.prodId);
                    }
                } else {
                    if (o1.prodPrice < o2.prodPrice) return 1;
                    else if (o1.prodPrice > o2.prodPrice) return -1;
                    else {
                        if (o2.category.compareTo(o1.category) < 0) return 1;
                        else if (o2.category.compareTo(o1.category) > 0) return -1;
                        else return Integer.compare(o2.prodId, o1.prodId);
                    }
                }
            }
        };
        products.sort(category);
        System.out.println(products);
    }

    private static void viewByCategory() {

        TreeSet<String> uniqueCategory = new TreeSet<>();
        for (Product prod : products)
            uniqueCategory.add(prod.category);

        ArrayList<String> categories = new ArrayList<>(uniqueCategory); // for looping the list
        System.out.println("In which category do you want to sort");
        for(int i = 0; i < categories.size(); i++)
            System.out.println((i+1) + ". " + categories.get(i));

        System.out.print("Enter: ");
        int choice = scan.nextInt();
        scan.nextLine();

        String chosenCategory = categories.get(choice-1);

        ArrayList<Product> listByCategory = new ArrayList<>();

        for(Product prod : products)
            if(prod.category.equals(chosenCategory))
                listByCategory.add(prod);

        while (true) {

            System.out.println();
            System.out.println("1. view by ID");
            System.out.println("2. view by Name");
            System.out.println("3. view by Price");
            System.out.println("4. Back to main page");
            System.out.print("Enter: ");

            choice = scan.nextInt();
            scan.nextLine();

            if (choice > 4 || choice < 1) {
                System.out.println("Invalid input! try again.");
                continue;
            }

            if(choice == 4) break;

            boolean isAscending = getOrder();

            if(choice == 1) {
                Comparator<Product> id = new Comparator<>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (isAscending) return o1.prodId - o2.prodId;
                        else return o2.prodId - o1.prodId;
                    }
                };
                listByCategory.sort(id);
                System.out.println(listByCategory);
//                break;
            }

            else if(choice == 2) {
                Comparator<Product> name = new Comparator<>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (isAscending) {
                            if (o1.prodName.compareTo(o2.prodName) == 0)
                                return o1.prodId - o2.prodId;
                            else
                                return o1.prodName.compareTo(o2.prodName);
                        } else {
                            if (o2.prodName.compareTo(o1.prodName) == 0)
                                return o2.prodId - o1.prodId;
                            else
                                return o2.prodName.compareTo(o1.prodName);
                        }
                    }
                };
                listByCategory.sort(name);
                System.out.println(listByCategory);
//                break;
            }

            else {  // choice == 3
                Comparator<Product> price = new Comparator<>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (isAscending) {
                            if (o1.prodPrice - o2.prodPrice == 0)
                                return o1.prodId - o2.prodId;
                            else
                                return (int) (o1.prodPrice - o2.prodPrice);
                        } else {
                            if (o2.prodPrice - o1.prodPrice == 0)
                                return o2.prodId - o1.prodId;
                            else
                                return (int) (o2.prodPrice - o1.prodPrice);
                        }
                    }
                };
                listByCategory.sort(price);
                System.out.println(listByCategory);
//                break;
            }
        }

    }

    private static void caller(int option, boolean isAscending) {
        switch (option) {
            case 1:
                sortById(isAscending);
                break;
            case 2:
                sortByName(isAscending);
                break;
            case 3:
                viewByCategory();
                break;
            case 4:
                sortByPrice(isAscending);
                break;
        }
    }

    private static boolean getOrder() {
        while (true) {
            System.out.println("\nSelect the order type");
            System.out.print("1. Ascending\n2. Descending\nEnter: ");
            int order = scan.nextInt();
            scan.nextLine();
            if (order > 2 || order < 1) {
                System.out.println("Invalid input.");
                continue;
            }
            return order == 1;
        }
    }

    public static void main(String[] args) {

        addProducts();

        while (true) {
            options();
            int option = scan.nextInt();
            scan.nextLine();

            if(option == 5) {
                System.out.println("Exiting....");
                break;
            }
            else if(option > 5 || option < 1) {
                System.out.println("Invalid input.");
                continue;
            }
            if(option == 3) caller(option, true);
            else {
                boolean isAscending = getOrder();
                caller(option, isAscending);
            }
        }
    }
}