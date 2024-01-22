package challenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateTicketSimpleUnique {
    private static final int MIN = 1;
    private static final int MAX = 50;
    private static final int LIMIT = 5;

    private static int generateNumber(){
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;
    }
    public static List<Integer> generateTicket(){
        List<Integer> series = new ArrayList<>();
        for (int i = 0; i< LIMIT; i++){
            int num = generateNumber();
            while (series.contains(num)){
                num = generateNumber();
            }
            series.add(num);
        }
        Collections.sort(series);;
        return series;
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            List<Integer> ticket = generateTicket();
            System.out.println(ticket);
        }

    }

}
