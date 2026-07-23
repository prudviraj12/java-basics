import java.util.Scanner;

public class shoppingcart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SHOPPING CART =====");

        System.out.println("Available Items:");
        System.out.println("1. Apple   - ₹50");
        System.out.println("2. Milk    - ₹30");
        System.out.println("3. Bread   - ₹40");
        System.out.println("4. Eggs    - ₹10 each");

        System.out.print("\nEnter item number (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        String item = "";
        int price = 0;

        switch (choice) {
            case 1:
                item = "Apple";
                price = 50;
                break;

            case 2:
                item = "Milk";
                price = 30;
                break;

            case 3:
                item = "Bread";
                price = 40;
                break;

            case 4:
                item = "Eggs";
                price = 10;
                break;

            default:
                System.out.println("Invalid Item!");
                sc.close();
                return;
        }

        int total = price * quantity;

        System.out.println("\n------ BILL ------");
        System.out.println("Item      : " + item);
        System.out.println("Price     : ₹" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total     : ₹" + total);

        if (total >= 500) {
            System.out.println("Discount  : 10%");
            total = total - (total * 10 / 100);
            System.out.println("Final Bill: ₹" + total);
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}