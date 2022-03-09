import Games.Board;
import Games.Cards.RightAngleRoad;
import Games.Cards.Road;
import Games.Cards.StraightRoad;
import Games.Enum.Direction;
import Games.Executor;
import Games.Position;
import Games.WalkBot;

public class Main {
    public static void main(String[] args){
        Road[][] roads = new Road[3][3];
        roads[1][1] = new StraightRoad();
        roads[2][1] = new StraightRoad();
        roads[2][1].turnClockwise();

        Board board = new Board(roads, new WalkBot(), Direction.SOUTH, new Position(1,1));
        Executor executor =  new Executor(board);
        try {
            executor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
