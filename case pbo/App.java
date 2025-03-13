public class App {
    public static void main(String[] args) {
        PaymentPaypal payX = new PaymentPaypal("123456", "token123");
        payX.pay(15000);

        PaymentCash payY = new PaymentCash("789012", "admin007");
        payY.pay(20000);

        Payment payZ = new Payment("345678");
        payZ.pay(5000);
    }
    
    
}