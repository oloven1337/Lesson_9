package z_1;

public class TestPurchaseOnline {
    public static void main(String[] args) {
        PurchaseOnline customer = new PurchaseOnline("Рассел", 12345);
        try {
            TINUtils.checkTIN(customer);
        }
        catch (TINNumberException e) {
            System.out.println("Вы ввели неверный ИНН");
            System.out.println(e.getMessage());
        }
    }
}