interface Payment {
    void pay();
    void showPaymentDetails();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment completed using UPI.");
    }

    public void showPaymentDetails() {
        System.out.println("Payment Method: UPI");
        System.out.println("Transaction Status: Successful");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment completed using Card.");
    }

    public void showPaymentDetails() {
        System.out.println("Payment Method: Debit/Credit Card");
        System.out.println("Transaction Status: Successful");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment upi = new UPIPayment();
        Payment card = new CardPayment();

        System.out.println("=== UPI Payment ===");
        upi.pay();
        upi.showPaymentDetails();

        System.out.println();

        System.out.println("=== Card Payment ===");
        card.pay();
        card.showPaymentDetails();
    }
}