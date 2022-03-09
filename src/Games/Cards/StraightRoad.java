package Games.Cards;

import Games.Actions.Straight;
import Games.Enum.Direction;

import java.util.ArrayList;

public class StraightRoad extends Road {
    public StraightRoad(){
        super();
        super.directions = new ArrayList<>();
        super.directions.add(Direction.NORTH);
        super.directions.add(Direction.SOUTH);
    }

    @Override
    public Direction getNextDirection(Direction direction){
        return new Straight().getNextDirection(direction);
    }
}
