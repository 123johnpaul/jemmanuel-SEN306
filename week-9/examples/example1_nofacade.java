Inventory inv = new Inventory();
Payment pay = new Payment();
Shipping ship = new Shipping();
Email email = new Email();

if (inv.checkstock("LAPTOP")){
    if (pay.charge("alice@example.com", 999.99)){
        inv.reserve("LAPTOP");
        String label = ship.createlabel("123 Main St");
        ship.schedulePickup(label);
        email.send("alice@example.com", "Order Confirmed", "Your order is on the way");
        System.out.println("Order Success");
    }else{
        System.out.println("Payment failed");
    }
}else{
    System.out.println("Out of stock");
}