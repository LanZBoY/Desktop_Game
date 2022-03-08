import Games.Board;
import Games.Executor;
import Games.Position;
import Games.WalkBot;

public class Main {
    public static void main(String[] args){
        Board board = new Board(null, new WalkBot(),null, new Position(1,1));
        Executor executor =  new Executor(board);
        try {
            executor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
