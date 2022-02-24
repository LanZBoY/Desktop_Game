package Games;

import Games.Enum.Direction;

public class WalkBot {

    public Direction direction;

    public Position position;

    public void step() {
        switch (direction){
            case NORTH -> {
                position.y = position.y - 1;
            }
            case EAST -> {
                position.x = position.x + 1;
            }
            case SOUTH -> {
                position.y = position.y + 1;
            }
            case WEST -> {
                position.x = position.x - 1;
            }
        }
    }
}
