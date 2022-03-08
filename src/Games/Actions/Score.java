package Games.Actions;

import Games.Enum.Direction;

public class Score implements Action {

    @Override
    public Direction getNextDirection(Direction direction){
        return direction;
    }

    @Override
    public String toString(){
        return "X";
    }
}
