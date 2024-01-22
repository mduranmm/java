package challenge3;

import java.util.ArrayList;
import java.util.List;

public class BoardBingo {
    private List<ColumnBingo> columns = new ArrayList<>();

    public BoardBingo() {
        for (LetterBingo letter: LetterBingo.values()) {
            columns.add(new ColumnBingo(letter));
        }
    }

    @Override
    public String toString(){
        String s = "";
        for(ColumnBingo column: columns){
            s += column.toString() + "\n";
        }
        return s;
    }
}
