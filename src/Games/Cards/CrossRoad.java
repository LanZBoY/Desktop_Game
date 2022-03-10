package Games.Cards;

import Games.Actions.Left;
import Games.Actions.Return;
import Games.Actions.Right;
import Games.Actions.Straight;
import Games.Enum.Color;
import Games.Enum.Direction;

import java.util.ArrayList;

public class CrossRoad extends Road{
    public Color color;
    public CrossRoad(Color color){
        super.directions = new ArrayList<>();
        super.directions.add(Direction.NORTH);
        super.directions.add(Direction.EAST);
        super.directions.add(Direction.SOUTH);
        super.directions.add(Direction.WEST);
        this.color = color;
    }


    @Override
    public Direction getNextDirection(Direction direction) {
        switch (color){
            case BLACK -> {
                return new Straight().getNextDirection(direction);
            }
            case RED -> {
                return new Return().getNextDirection(direction);
            }
            case BLUE -> {
                return new Left().getNextDirection(direction);
            }
            case GREEN -> {
                return new Right().getNextDirection(direction);
            }
        }
        return direction;
    }
}
