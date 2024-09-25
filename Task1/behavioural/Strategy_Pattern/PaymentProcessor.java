import java.util.Scanner;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        strategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Payment Method: 1. Credit Card 2. PayPal");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                processor.setStrategy(new CreditCardPayment("1234"));
                break;
            case 2:
                processor.setStrategy(new PayPalPayment("CHintan@chintan.com"));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        processor.processPayment(250.00);
    }
}
