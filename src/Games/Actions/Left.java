package Games.Actions;

import Games.Enum.Direction;
import org.jetbrains.annotations.NotNull;

public class Left implements Action {

    @Override
    public Direction getNextDirection(@NotNull Direction direction){
        switch (direction){
            case NORTH -> {
                return Direction.WEST;
            }
            case EAST -> {
                return Direction.NORTH;
            }
            case SOUTH -> {
                return Direction.EAST;
            }
            case WEST -> {
                return Direction.SOUTH;
            }
        }
        return direction;
    }

    @Override
    public String toString(){
        return "L";
    }
}
