package Games.Cards;

import Games.Enum.Direction;
import org.jetbrains.annotations.NotNull;

public class Right implements Card{
    @Override
    public Boolean isScore() {
        return false;
    }

    @Override
    public Direction getNextDirection(@NotNull Direction direction) throws Exception {
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
            default -> {
                throw new Exception();
            }
        }
    }

    @Override
    public String toString(){
        return "R";
    }
}
