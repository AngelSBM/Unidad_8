public class Order {

    private int totalPrice = 0;

    public void addShirt() {
        totalPrice += 200;
        showPrice();
    }

    public void showPrice() {
        System.out.println("Current price: " + totalPrice);
    }

}