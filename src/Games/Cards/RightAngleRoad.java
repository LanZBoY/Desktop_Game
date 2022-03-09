package Games.Cards;

import Games.Enum.Direction;

public class RightAngleRoad extends Road{
//  index 0 ек┬р, index 1 еk┬р
    public RightAngleRoad(){
        if(super.directions == null){
            super.directions = new ArrayList<>();
        }
        super.directions.add(Direction.NORTH);
        super.directions.add(Direction.EAST);
    }

    @Override
    public Direction getNextDirection(Direction direction) {
        return null;
    }
}
