import java.util.ArrayList;
import java.util.List;

/**
 * Represents an online shopping system.
 */
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.0, 10);
        Product product2 = new Product("Smartphone", 700.0, 20);

        // Create a customer
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Create an order
        Order order = new Order(customer);

        // Add products to the order
        order.addProduct(product1);
        order.addProduct(product2);

        // Print order details
        System.out.println("Customer: " + customer.getName() + ", Email: " + customer.getEmail());
        System.out.println("Products:");
        for (Product product : order.getProducts()) {
            System.out.println(product.getName() + ", Price: " + product.getPrice());
        }
        System.out.println("Total Price: " + order.getTotalPrice());
    }
}

/**
 * Represents an order in the online shopping system.
 */
public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}

/**
 * Represents a product in the online shopping system.
 */
public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        if (name == null || name.isEmpty() || price < 0 || stock < 0) {
            throw new IllegalArgumentException("Invalid product data.");
        }
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

/**
 * Represents a customer in the online shopping system.
 */
public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        if (name == null || name.isEmpty() || email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Invalid customer data.");
        }
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}