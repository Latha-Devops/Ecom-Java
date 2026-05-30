public class EcommerceApplication {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 70000);
        Product p2 = new Product(2, "Phone", 30000);

        System.out.println("=== E-Commerce Products ===");
        System.out.println(p1);
        System.out.println(p2);
    }
}
