package Games.Cards;

import Games.Actions.Left;
import Games.Actions.Return;
import Games.Actions.Right;
import Games.Enum.Direction;

import java.util.ArrayList;

public class RightAngleRoad extends Road{
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
    public Direction getNextDirection(Direction botDirection) throws Exception {
        Direction fromDirection = new Return().getNextDirection(botDirection);
        //  index 0 ¥ªÂà, index 1 ¥kÂà
        int index = this.directions.indexOf(fromDirection);
        switch (index){
            case 0 ->{
                return new Left().getNextDirection(botDirection);
            }
            case 1 ->{
                return new Right().getNextDirection(botDirection);
            }
            default -> {
                throw new Exception("Invalid direction");
            }
        }
    }
}
