package Games;

import Games.Actions.Action;
import Games.Actions.Score;
import Games.Enum.Direction;

public class Board {
    private Action[][] actions;

    private WalkBot walkBot;

    public Board (Action[][] actions, WalkBot walkBot, Direction direction, Position startPosition){
        this.actions = actions;
        this.walkBot = walkBot;
        walkBot.position = startPosition;
        if(direction == null){
            walkBot.direction = Direction.SOUTH;
        }
    }

    public Action getCurrent(){
        return actions[walkBot.position.x][walkBot.position.y];
    }

    public Position getCurrentPosition(){
        return walkBot.position;
    }

    public void step() throws Exception {
        if(actions[walkBot.position.x][walkBot.position.y] == null) {
            throw new Exception("Unknown Card Type");
        }
        walkBot.direction = actions[walkBot.position.x][walkBot.position.y].getNextDirection(walkBot.direction);
        walkBot.step();
    }


    @Override
    public String toString() {
        String result = "";
        for(int j = 0; j < actions.length; j++){
            for(int i = 0; i  < actions[j].length; i++){
                if(i == walkBot.position.x && j == walkBot.position.y){
                    result += "C";
                }else if(actions[i][j] == null){
                    result += "N";
                }else{
                    result += String.format("%s", actions[i][j]);
                }
                if(i == actions[j].length - 1){
                    result += "\n";
                }else{
                    result += ", ";
                }
            }
        }
        return result;
    }

    public boolean checkScore() {
        if(actions[walkBot.position.x][walkBot.position.y] instanceof Score){
            System.out.println("得分並結束遊戲！");
            return true;
        }
        return false;
    }
}
