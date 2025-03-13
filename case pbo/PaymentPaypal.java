class PaymentPaypal extends Payment {
    private String paypalToken;

    public PaymentPaypal(String customerId, String paypalToken) {
        super(customerId); // call the superclass constructor
        this.paypalToken = paypalToken;
    }

    @Override
    public void pay(double amount) {
        super.pay(amount); // optional: call the superclass method
        System.out.println("Payment via PayPal using token: " + paypalToken);
    }
}