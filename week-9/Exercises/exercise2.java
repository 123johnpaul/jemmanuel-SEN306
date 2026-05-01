class Inventory{
    boolean checkStock(String productId) {return true;}
    void reserve(String productId) {System.out.println("Reserved" + productId);}
    void release(String productId) {System.out.println("Released" + productId);}
}

class Payment{
    boolean charge(String userId, double amount){return true;}
    void refund (String userId, double amount) {System.out.println("Refunded: "+amount);}
}

class Shipping{
    String createLabel(String address){return "TRK" + System.currentTimeMillis();}
    void schedulePickup(String label){System.out.println("Picup Scheduled for "+ label);}
    boolean isAvailable(){return true;}
}

clas Email{
    void send(String to, String subject, String body) (System.out.println("Email to: " + to);)
}