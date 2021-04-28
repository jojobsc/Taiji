import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

class BoardTest {
    @Test
    void zuggenerator() {

        String testBoard = "---wbbw/-----b-/-----w-/b------/wb-----/ww-----/bwb----";

        Board b = new Board(testBoard);
        //System.out.println("moves = " + b.moveGenerator().size());
    }

    @Test
    void moveGenerator() {

    }

    @Test
    void doMove() {
        String testBoard = "---wbbw/-----b-/-----w-/b------/wb-----/ww-----/bwb----";

        Board b = new Board(testBoard);
        b.moveGenerator();
        System.out.println(b);
        System.out.println(b.getMoves().get(10));
        b.doMove(b.getMoves().get(10));
        System.out.println(b);


    }

}