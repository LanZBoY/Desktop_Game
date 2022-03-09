package Games.Cards;

import Games.Enum.Direction;
import Games.WalkBot;

import java.util.ArrayList;

public class RightAngleRoad extends Road{
//  index 0 左轉, index 1 右轉
    public RightAngleRoad(){
        if(super.directions == null){
            super.directions = new ArrayList<>();
        }
        super.directions.add(Direction.NORTH);
        super.directions.add(Direction.EAST);
    }

    public RightAngleRoad(Direction direction){
        if(super.directions == null){
            super.directions = new ArrayList<>();
        }

        switch (direction){
            case NORTH -> {
                super.directions.add(Direction.NORTH);
                super.directions.add(Direction.EAST);
            }
            case EAST -> {
                super.directions.add(Direction.EAST);
                super.directions.add(Direction.SOUTH);
            }
            case SOUTH -> {
                super.directions.add(Direction.SOUTH);
                super.directions.add(Direction.WEST);
            }
            case WEST -> {
                super.directions.add(Direction.WEST);
                super.directions.add(Direction.NORTH);
            }
        }
    }

    @Override
    public void startAction(WalkBot walkBot) {

    }

}
