package Games.Cards;

import Games.Position;

public class MoveLeft implements Card{
    @Override
    public void action(Position position) {
        position.x = position.x - 1;
    }

    @Override
    public String toString(){
        return "L";
    }
}
