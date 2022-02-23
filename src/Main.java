import Games.Board;
import Games.Cards.*;
import Games.Executor;
import Games.Position;
import Games.WalkBot;

public class Main {
    public static void main(String[] args){
        Card[][] cards = new Card[3][3];
        cards[0][0] = new MoveDown();
        cards[0][1] = new MoveDown();
        cards[0][2] = new MoveRight();
        cards[1][0] = new MoveLeft();
        cards[1][1] = new MoveDown();
        cards[1][2] = new MoveRight();
        cards[2][0] = new MoveLeft();
        cards[2][1] = new MoveUp();
        cards[2][2] = new MoveUp();
        /*
        * Pre-define data
        * {
        *   down, left, left
        *   down, down, up
        *   right, right, up
        * }
        */

        Board board = new Board(cards, new WalkBot(), new Position(1,1));
//        System.out.println(board);
        Executor executor =  new Executor(board);
        try {
            executor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
