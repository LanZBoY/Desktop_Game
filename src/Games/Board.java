package Games;

import Games.Cards.Card;

public class Board {
    private Card[][] cards;

    private WalkBot walkBot;

    public Board (Card[][] cards, WalkBot walkBot, Position startPosition){
        this.cards = cards;
        this.walkBot = walkBot;
        walkBot.position = startPosition;
    }

    public Card getCurrent(){
        return cards[walkBot.position.x][walkBot.position.y];
    }

    public Position getCurrentPosition(){
        return walkBot.position;
    }

    public void move(){
        cards[walkBot.position.x][walkBot.position.y].action(walkBot.position);
    }


    @Override
    public String toString() {
        String result = "";
        for(int j = 0; j < cards.length; j++){
            for(int i = 0; i  < cards[j].length; i++){
                if(i == walkBot.position.x && j == walkBot.position.y){
                    result += "C";
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
}
