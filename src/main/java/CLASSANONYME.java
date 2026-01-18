
public class CLASSANONYME {
    public static void main(String[] args) {

        Purchase customer = new Purchase();

        // Client spécial : remise 20 % (classe anonyme)
        Purchase specialCustomer = new Purchase() {
            @Override
            public int totalAmount(int price) {
                return price - (price * 20) / 100;
            }
        };

        System.out.println(customer.totalAmount(1000));        // 10 %
        System.out.println(specialCustomer.totalAmount(100000)); // 20 %
    }
}

class Purchase {

    // Remise standard : 10 %
    public int totalAmount(int price) {
        return price - (price * 10) / 100;
    }
}
