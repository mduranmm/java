package challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColumnBingo {
    private LetterBingo letter;
    private int[] nums;

    public ColumnBingo(LetterBingo letter) {
        this.letter = letter;
        this.nums = generateColumn(letter);

    }

    private int[] generateColumn(LetterBingo letter){
        List<Integer> series = new ArrayList<>();
        for (int i = 0; i < letter.getLon(); i++) {
            int num = generateNumber(letter.getMin(), letter.getMax());
            while (series.contains(num)){
                num = generateNumber(letter.getMin(), letter.getMax());
            }
            series.add(num);
        }
        Collections.sort(series);
        return series.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int generateNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }
    @Override
    public String toString(){
        return letter.getLetter() + " : " + Arrays.toString(nums);
    }
}
