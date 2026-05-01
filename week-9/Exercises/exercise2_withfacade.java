public class CheckoutFacade{
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;
    private Email email;

    public Checkoutfacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
        this.email = new Email();

    }

    pubic OrderResult checkout(String productId, double price, String address, String UserId){
        if (!payment.charge(userId, price)) return false;
        if (!shipping.isAvailable()){
            payment.refund(userId, price);
            inventory.release(productId);
            return false;
        }

        /*fix tracking return*/

        rooms.book(roomType, guest);
        loyalty.addPoints(guest,(int)price);
        email.send(guest, roomType);
        return true;
    }

}

public class OrderResult{
    private final boolean success;
    private final String trackingNumber;
    private final String message;

    public OrderResult{
        this.success = new success();
        this.trackingNumber = new trackingNumber();
        this.message = new message();
    }
}