package Games.Actions;

import Games.Enum.Direction;
import org.jetbrains.annotations.NotNull;

public class Return implements Action {
    @Override
    public Boolean isScore() {
        return false;
    }

    @Override
    public Direction getNextDirection(@NotNull Direction direction) throws Exception {
        switch (direction){
            case NORTH -> {
                return Direction.SOUTH;
            }
            case EAST -> {
                return Direction.WEST;
            }
            case SOUTH -> {
                return Direction.NORTH;
            }
            case WEST -> {
                return Direction.EAST;
            }
            default -> {
                throw new Exception();
            }
        }
    }
    @Override
    public String toString(){
        return "B";
    }
}
