import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

class BoardTest {
    @Test
    void zuggenerator() {

        String testBoard = "---wbbw/-----b-/-----w-/b------/wb-----/ww-----/bwb----";

        Board b = new Board(testBoard);
        //System.out.print(b);

        System.out.println("BITS moves = " + b.moveGenerator().size());
    }
}