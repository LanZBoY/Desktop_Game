package Games.Cards;

import Games.Actions.Straight;
import Games.Enum.Direction;
import Games.WalkBot;

import java.util.ArrayList;

public class StraightRoad extends Road {
    public StraightRoad(){
        super();
        super.directions = new ArrayList<>();
        super.directions.add(Direction.NORTH);
        super.directions.add(Direction.SOUTH);
    }

    @Override
    public void startAction(WalkBot walkBot){
        walkBot.direction = new Straight().getNextDirection(walkBot.direction);
    }
}
