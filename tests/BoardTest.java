import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.zip.DataFormatException;

class BoardTest {
    @Test
    void zuggenerator() {
        // 11
        //String testBoard = "--------------------------------------------------------------------------------------------------------------------------";
        // 7
        String testBoard = "-------/-------/-------/-------/-------/-------/-------/";

        Board b = new Board(testBoard);
        System.out.print(b);
        b.zuggenerator();
        System.out.println("moves = " + b.getMoves().size());
    }
}