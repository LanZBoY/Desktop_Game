package Games.Cards;

import Games.Actions.Return;
import Games.Enum.Direction;
import Games.WalkBot;

import java.util.ArrayList;

public abstract class Road {
    protected ArrayList<Direction> directions;

    public void turnClockwise(){
        for(int i = 0; i < directions.size(); i++){
            Direction direction = directions.get(i);
            switch (direction){
                case NORTH -> {
                    directions.remove(direction);
                    directions.add(i, Direction.EAST);
                }
                case EAST -> {
                    directions.remove(direction);
                    directions.add(i, Direction.SOUTH);
                }
                case SOUTH -> {
                    directions.remove(direction);
                    directions.add(i, Direction.WEST);
                }
                case WEST -> {
                    directions.remove(direction);
                    directions.add(i, Direction.NORTH);
                }
                default -> throw new IllegalStateException("Unexpected value: " + direction);
            }
        }
    }

    public boolean canPass(Direction botDirection){
        botDirection = new Return().getNextDirection(botDirection);
        if(directions == null){
            return false;
        }
        if(directions.isEmpty()){
            return false;
        }
        for(int i = 0; i < directions.size(); i++){
            Direction compareDirection = directions.get(i);
            if(compareDirection == botDirection){
                return true;
            }
        }
        return false;
    }

    public abstract Direction getNextDirection(Direction direction) throws Exception;
}
