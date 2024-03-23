import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTests {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void GetDiscount1() {
        int age = 19;
        String city = "Warsaw";
        boolean isThursday=false;

        double result = Main.getDiscount(age, city, isThursday);

        assertEquals(0.1,result);
    }
    @Test
    void GetDiscount2() {
        int age = 19;
        String city = "Warsaw";
        boolean isThursday=true;

        double result = Main.getDiscount(age, city, isThursday);

        assertEquals(1.0,result);
    }
    @Test
    void GetDiscount3() {
        int age = 16;
        String city = "Warsaw";
        boolean isThursday=false;

        double result = Main.getDiscount(age, city, isThursday);

        assertEquals(0.6,result);
    }
    @Test
    void GetDiscount4() {
        int age = 19;
        String city = "Krakow";
        boolean isThursday=false;

        double result = Main.getDiscount(age, city, isThursday);

        assertEquals(0.0,result);
    }
    @Test
    void GetDiscount5() {
        int age = 13;
        String city = "Krakow";
        boolean isThursday=true;

        double result = Main.getDiscount(age, city, isThursday);

        assertEquals(1.0,result);
    }
    @Test
    void GetDiscount6() {
        int age = 89;
        String city = "Warsaw";
        boolean isThursday=true;

        double result = Main.getDiscount(age, city, isThursday);

        assertEquals(1.0,result);
    }
    @Test
    void GetTicketPrice1() {
        double ticketPrice = 40;
        double discount = 0.1;

        double result = Main.getTicketPrice(discount);

        assertEquals(36,result);
    }
    @Test
    void GetTicketPrice2() {
        double ticketPrice = 40;
        double discount = 0.5;

        double result = Main.getTicketPrice(discount);

        assertEquals(20,result);
    }
    @Test
    void GetTicketPrice3() {
        double ticketPrice = 40;
        double discount = 1.0;

        double result = Main.getTicketPrice(discount);

        assertEquals(0,result);
    }
    @Test
    void GetTicketPrice4() {
        double ticketPrice = 40;
        double discount = 0.6;

        double result = Main.getTicketPrice(discount);

        assertEquals(16,result);
    }
    @Test
    void GetTicketPrice5() {
        double ticketPrice = 40;
        double discount = 0.0;

        double result = Main.getTicketPrice(discount);

        assertEquals(40,result);
    }
}