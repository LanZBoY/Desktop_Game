package Games.Actions;

import Games.Enum.Direction;

public interface Action {

    Direction getNextDirection(Direction direction);

    String toString();
}
