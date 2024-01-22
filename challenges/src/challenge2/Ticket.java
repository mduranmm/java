package challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ticket {
    public static final int  MIN_N = 1;
    public static final int  MAX_N = 50;
    public static final int  LIMIT = 6;
    public static final int  MIN_R = 1;
    public static final int  MAX_R = 10;

    private int refund;
    private int[] series;

    public Ticket() {
        series = generateTicket(MIN_N, MAX_N, LIMIT);
        refund = generateNumber(MIN_R, MAX_R);
    }

    private static int[] generateTicket(int min, int max, int nums){
        List<Integer> ticket = new ArrayList<>();
        for (int i = 0; i < nums; i++) {
            int num = generateNumber(min, max);
            while (ticket.contains(num)){
                num = generateNumber(min, max);
            }
            ticket.add(num);
        }
        Collections.sort(ticket);
        return ticket.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int generateNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public String toString(){
        return "N: " + Arrays.toString(series) + " R: " + refund;
    }
}
