package Games.Cards;

import Games.Position;

public class MoveDown implements Card{
    @Override
    public void action(Position position) {
        position.y = position.y + 1;
    }

    @Override
    public String toString(){
        return "D";
    }
}
