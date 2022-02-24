import Games.Board;
import Games.Cards.*;
import Games.Executor;
import Games.Position;
import Games.WalkBot;

public class Main {
    public static void main(String[] args){
        Card[][] cards = new Card[3][3];
        cards[1][1] = new Straight();
        cards[1][2] = new Left();
        cards[2][2] = new Left();
        cards[2][1] = new Straight();
        /*
        * Pre-define data
        * {
        *   n, n, n
        *   n, S, S
        *   n, R, L
        * }
        */

        Board board = new Board(cards, new WalkBot(),null, new Position(1,1));
        System.out.println(board);
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        Executor executor =  new Executor(board);
        try {
            executor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
