RoomService rooms = new RoomService();
PaymentService payment = new PaymentService();
LoyaltyPoints loyalty = new LoyaltyPoints();
EmailService email = new EmailService();

String guest = "john@example.com";
String roomtype = "DELUXE";
double price = 250.00;

if (rooms.isAvailable(roomType)){
    if (payment.charge(guest,price)){
        rooms.book(roomType, guest);
        loyalty.addPoints(guest, (int)price);
        Email.sendConfirmation(guest, roomtype);
        system.out.println("Booking Confirmed");
    }else {
        system.out.println("Payment Declined");
    }
}else{
    system.out.println("Room not available");
}

/* 1. To make it easier to read
   2. Protect client from complex interactions
   3. TO make the code reuseable
*/