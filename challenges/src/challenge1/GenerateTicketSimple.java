package challenge1;

import java.util.Arrays;

public class GenerateTicketSimple {
    private static final int MIN = 1;
    private static final int MAX = 50;
    private static final int LIMIT = 5;

    private static int generateNumber(){
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;
    }
    public static int[] generateTicket(){
        int[] series = new int[LIMIT];
        for (int i = 0; i< LIMIT; i++){
            series[i] = generateNumber();
        }
        Arrays.sort(series);;
        return series;
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            int[] ticket = generateTicket();
            System.out.println(Arrays.toString(ticket));
        }

    }

}
