package Games.Actions;

import Games.Enum.Direction;
import org.jetbrains.annotations.NotNull;

public class Right implements Action {

    @Override
    public Direction getNextDirection(@NotNull Direction direction){
        switch (direction){
            case NORTH -> {
                return Direction.EAST;
            }
            case EAST -> {
                return Direction.SOUTH;
            }
            case SOUTH -> {
                return Direction.WEST;
            }
            case WEST -> {
                return Direction.NORTH;
            }
        }
        return direction;
    }

    @Override
    public String toString(){
        return "R";
    }
}
