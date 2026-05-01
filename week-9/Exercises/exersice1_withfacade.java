public class OrderFacade{
    private RoomService rooms;
    private PaymentService payment;
    private LoyaltyPoints loyalty;
    private EmailService email;

    public Orderfacade() {
        this.rooms = new RoomService();
        this.payment = new PaymentService();
        this.loyalty = new LoyaltyPoints();
        this.email = new EmailService();

    }

    pubic boolean bookRoom(String guest, String roomType, double price){
        if (!rooms.isAvailable(roomType)) return false;
        if (!payment.charge(guest, price)) return false;

        rooms.book(roomType, guest);
        loyalty.addPoints(guest,(int)price);
        email.send(guest, roomType);
        return true;
    }

}