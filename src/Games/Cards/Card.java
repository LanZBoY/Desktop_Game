package Games.Cards;

import Games.Enum.Direction;
import Games.Position;

public interface Card {
    Direction getNextDirection(Direction direction) throws Exception;

    String toString();
}
