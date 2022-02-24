package Games.Cards;

import Games.Enum.Direction;

public class Straight implements Card{
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
