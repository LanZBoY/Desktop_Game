package Games.Actions;

import Games.Enum.Direction;

public class Straight implements Action {
    @Override
    public Boolean isScore() {
        return false;
    }

    @Override
    public Direction getNextDirection(Direction direction) throws Exception {
        return direction;
    }

    @Override
    public String toString(){
        return "S";
    }
}