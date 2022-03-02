package Games.Actions;

import Games.Enum.Direction;

public interface Action {

    Boolean isScore();

    Direction getNextDirection(Direction direction) throws Exception;

    String toString();
}
