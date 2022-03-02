package Games.Actions;

import Games.Enum.Direction;

public class Score implements Action {

    @Override
    public Boolean isScore() {
        return true;
    }

    @Override
    public Direction getNextDirection(Direction direction) throws Exception {
        return direction;
    }

    @Override
    public String toString(){
        return "X";
    }
}
