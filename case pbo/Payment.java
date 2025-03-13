class Payment {
    protected String customerId;
    protected double amount;

    public Payment(String customerId) {
        this.customerId = customerId;
        this.amount = 0;
    }

    public void pay(double amount) {
        this.amount = amount;
        System.out.println("Processing payment of " + amount + " for customer " + customerId);
    }

    public void printPaymentDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Amount: " + amount);
    }
}