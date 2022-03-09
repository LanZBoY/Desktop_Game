package Games;


import Games.Cards.Road;
import Games.Enum.Direction;

public class Board {
    /*
     * 注意x為橫軸 y為縱軸
     */
    private Road[][] roads;

    private WalkBot walkBot;

    public Board (Road[][] roads, WalkBot walkBot, Direction direction, Position startPosition){
        this.roads = roads;
        this.walkBot = walkBot;
        walkBot.position = startPosition;
        if(direction != null){
            walkBot.direction = direction;
            return;
        }
        walkBot.direction = Direction.SOUTH;
    }
    public void step() throws Exception {
        System.out.println(walkBot.position);
        if(roads[walkBot.position.y][walkBot.position.x] == null) {
            throw new Exception("Unknown Card Type");
        }
//        1. 取得下一步位置
        Position nextPosition = walkBot.getNextPosition();
//        2. 檢查下一步卡片路是否可以走
        if(!roads[nextPosition.y][nextPosition.x].canPass(walkBot.direction)){
//          否則丟Exception
            throw new Exception("Can't pass the road");
        }
//      如果可以執行走路動作
        walkBot.oneStep();
        walkBot.direction = roads[walkBot.position.y][walkBot.position.x].getNextDirection(walkBot.direction);
    }

    public boolean checkScore() {
//      TODO: 檢查是否得分
        return false;
    }
}
