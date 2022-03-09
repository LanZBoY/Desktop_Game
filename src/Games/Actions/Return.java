package Games.Actions;

import Games.Enum.Direction;

public class Return implements Action {

    @Override
    public Direction getNextDirection(Direction direction){
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
        }
        return direction;
    }
    @Override
    public String toString(){
        return "B";
    }
}
