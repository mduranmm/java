package challenge2;

public class GenerateTicketComplex {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Ticket ticket = new Ticket();
            System.out.println(ticket.toString());
        }
    }
}
