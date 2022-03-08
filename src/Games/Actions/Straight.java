package Games.Actions;

import Games.Enum.Direction;

public class Straight implements Action {

    @Override
    public Direction getNextDirection(Direction direction){
        return direction;
    }

    @Override
    public String toString(){
        return "S";
    }
}
