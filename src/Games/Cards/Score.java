package Games.Cards;

import Games.Enum.Direction;

public class Score implements Card{

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
