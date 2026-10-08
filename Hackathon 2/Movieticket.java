class Movieticket {
    String movie;
    double price;
    int count;
    Movieticket() {
        movie = "Avengers";
        price = 200;
        count = 5;
    }
    double total() {
        return price * count;
    }
    double discount() {
        return total() * 0.10;
    }
    double finalAmount() {
        return total() - discount();
    }
    void show() {
        System.out.println("Movie: " + movie);
        System.out.println("Ticket Price: " + price);
        System.out.println("Tickets: " + count);
        System.out.println("Total: " + total());
        System.out.println("Discount: " + discount());
        System.out.println("Final Amount: " + finalAmount());
    }
    public static void main(String[] args) {
        Movieticket ticket = new Movieticket();
        ticket.show();
    }
}