class PaymentCash extends Payment {
    private String adminId;

    public PaymentCash(String customerId, String adminId) {
        super(customerId); // call the superclass constructor
        this.adminId = adminId;
    }

    @Override
    public void pay(double amount) {
        super.pay(amount); // optional: call the superclass method
        System.out.println("Cash payment processed by admin: " + adminId);
    }
}
