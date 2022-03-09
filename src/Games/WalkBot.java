package Games;

import Games.Enum.Direction;

public class WalkBot {

    public Direction direction;

    public Position position;

//  走一步所需要的動作
    public void oneStep() {
        switch (direction){
            case NORTH -> position.y = position.y - 1;
            case EAST -> position.x = position.x + 1;
            case SOUTH -> position.y = position.y + 1;
            case WEST -> position.x = position.x - 1;
        }
    }

    public Position getNextPosition(){
        Position nextPosition = null;
        switch (direction){
            case NORTH ->  nextPosition = new Position(position.x, position.y - 1) ;
            case EAST -> nextPosition = new Position(position.x + 1, position.y);
            case SOUTH -> nextPosition = new Position(position.x, position.y + 1);
            case WEST -> nextPosition = new Position(position.x - 1, position.y);
        }
        return nextPosition;
    }

//
}
