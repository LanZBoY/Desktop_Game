import Games.Actions.Action;
import Games.Actions.Left;
import Games.Actions.Score;
import Games.Actions.Straight;
import Games.Board;
import Games.Executor;
import Games.Position;
import Games.WalkBot;

public class Main {
    public static void main(String[] args){
        Action[][] cards = new Action[3][3];
        cards[1][1] = new Straight();
        cards[1][2] = new Left();
        cards[2][2] = new Left();
        cards[2][1] = new Straight();
        cards[2][0] = new Score();
        /*
        * Pre-define data
        * {
        *   n, n, X
        *   n, S, S
        *   n, R, L
        * }
        */

        Board board = new Board(cards, new WalkBot(),null, new Position(1,1));
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
