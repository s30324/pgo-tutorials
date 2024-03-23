public class Main {
    public static void main(String[] args) {
        int age = 19;
        boolean isThursday = false;
        String city = "Warsaw";
        double discount = getDiscount(age, city, isThursday);
        double finalPrice = getTicketPrice(discount);
        System.out.println("Data: "+city+", "+age+" years old, weekday Ticket price: "+finalPrice);
        System.out.println("Discount: "+discount*100+"%");
    }

    public static double getTicketPrice(double discount) {
        double ticketPrice = 40;
        if (discount == 1.0) {
            ticketPrice = 0;
        }
        if (discount > 0) {
            ticketPrice = ticketPrice - (ticketPrice * discount);
        }
        return ticketPrice;
    }
    public static double getDiscount(int age, String city, boolean isThursday) {
        if (age < 10) return 1;
        if (isThursday) return 1;
        double discount = 0;
        if (age <= 18) {
            discount = 0.5;
        }
        if (city.equals("Warsaw")) {
            discount = discount + 0.1;
        }
        return discount;
    }
}
