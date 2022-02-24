package Games;

import Games.Cards.Card;
import Games.Cards.Score;
import Games.Enum.Direction;

public class Board {
    private Card[][] cards;

    private WalkBot walkBot;

    public Board (Card[][] cards, WalkBot walkBot,Direction direction, Position startPosition){
        this.cards = cards;
        this.walkBot = walkBot;
        walkBot.position = startPosition;
        if(direction == null){
            walkBot.direction = Direction.SOUTH;
        }
    }

    public Card getCurrent(){
        return cards[walkBot.position.x][walkBot.position.y];
    }

    public Position getCurrentPosition(){
        return walkBot.position;
    }

    public void step() throws Exception {
        if(cards[walkBot.position.x][walkBot.position.y] == null){
            throw new Exception("Unknown Card Type");
        }
        walkBot.direction = cards[walkBot.position.x][walkBot.position.y].getNextDirection(walkBot.direction);
        walkBot.step();
    }


    @Override
    public String toString() {
        String result = "";
        for(int j = 0; j < cards.length; j++){
            for(int i = 0; i  < cards[j].length; i++){
                if(i == walkBot.position.x && j == walkBot.position.y){
                    result += "C";
                }else if(cards[i][j] == null){
                    result += "N";
                }else{
                    result += String.format("%s",cards[i][j]);
                }
                if(i == cards[j].length - 1){
                    result += "\n";
                }else{
                    result += ", ";
                }
            }
        }
        return result;
    }

    public boolean checkScore() {
        if(cards[walkBot.position.x][walkBot.position.y] instanceof Score){
            System.out.println("得分並結束遊戲！");
            return true;
        }
        return false;
    }
}
