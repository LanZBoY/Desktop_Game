package Games.Cards;

import Games.Enum.Direction;
import org.jetbrains.annotations.NotNull;

public class Left implements Card{
    @Override
    public Direction getNextDirection(@NotNull Direction direction) throws Exception {
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
            default -> {
                throw new Exception();
            }
        }
    }

    @Override
    public String toString(){
        return "L";
    }
}
