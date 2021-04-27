import java.util.*;

public class Board {
    private boolean white[][];
    private boolean black[][];
    private boolean[][] notFree;

    public LongLong whites;
    public LongLong blacks;


    private List<Zug> moves;
    private int n;

    public Board(String strBoard) {
        strBoard = strBoard.replace("/","");
        moves = new ArrayList<>();
        char[] charsBoard = strBoard.toCharArray();

        System.out.println(charsBoard.length);

        this.n = (int)Math.sqrt(charsBoard.length);
        white = new boolean[n][n];
        black = new boolean[n][n];
        notFree = new boolean[n][n];

        for(int i=0; i < n*n; i++){
            if (charsBoard[i] == 'w') {
                white[i/n][i%n] = true;
                notFree[i/n][i%n] = true;
            }
            else if (charsBoard[i] == 'b'){
                black[i/n][i%n] = true;
                notFree[i/n][i%n] = true;
            }
        }
    }


    public List<Zug>  zuggenerator(){
        for(int i=0; i < n; i++){
            for(int k=0; k < n; k++) {
                // if the box (i,k) is empty
                if (!notFree[i][k]){
                    // and if the 4 adjacent boxes and empty
                    if (i!=0 && !notFree[i-1][k]) moves.add(new Zug(i,k,i-1,k));
                    if (k!=0 && !notFree[i][k-1]) moves.add(new Zug(i,k,i,k-1));
                    if (i!=n-1 && !notFree[i+1][k]) moves.add(new Zug(i,k,i+1,k));
                    if (k!=n-1 && !notFree[i][k+1]) moves.add(new Zug(i,k,i,k+1));
                }
            }
        }
        return moves;
    };

    public List<Zug> moveGenerator(){
        // mask for checking horizontal
        LongLong ch = new LongLong(0b1100000000000000000000000000000000000000000000000000000000000000L,0);
        for(int i=0; i < n; i++){
            for(int k=0; k < n-1;k++) {
                // TODO
            }
        }
        return moves;

    }

    public List<Zug> getMoves() {
        return moves;
    }
    public void setMOves(List<Zug> moves){
        this.moves = moves;
    }

    public void doMove(Zug zug){
        white[zug.whiteX][zug.whiteY] = true;
        notFree[zug.whiteX][zug.whiteY] = true;
        black[zug.blackX][zug.blackY] = true;
        notFree[zug.blackX][zug.blackY] = true;
    }

    public void undoMove(Zug zug){
        white[zug.whiteX][zug.whiteY] = false;
        notFree[zug.whiteX][zug.whiteY] = false;
        black[zug.blackX][zug.blackY] = false;
        notFree[zug.blackX][zug.blackY] = false;
    }

    public void doRandomMOve(){
        Random rand = new Random();
        if (moves.size() != 0) {
            this.doMove(moves.get(rand.nextInt(moves.size())));
        }
    }

    public String toString(){
        String board = "";
        for(int i=0; i < n; i++){
            for(int k=0; k < n; k++){
                if (white[i][k]) board += "w ";
                else if (black[i][k]) board += "b ";
                else board += "- ";
            }
            board += "\n";
        }
        return board;
    }
}

