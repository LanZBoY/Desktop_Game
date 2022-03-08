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
        if(direction == null){
            walkBot.direction = Direction.SOUTH;
        }
    }
    public void step() throws Exception {
        if(roads[walkBot.position.x][walkBot.position.y] == null) {
            throw new Exception("Unknown Card Type");
        }
//        TODO:
//        1. 取得下一步位置
        Position nextPosition = walkBot.getNextPosition();
//        2. 檢查下一步卡片路是否可以走
        if(roads[nextPosition.y][nextPosition.x].canPass(walkBot.direction)){
//            如果可以執行走路動作
            walkBot.oneStep();
        }
//      否則丟Exception
    }


    @Override
    public String toString() {
//      TODO: 卡片不同
        return super.toString();
    }

    public boolean checkScore() {
//      TODO: 檢查是否得分
        return false;
    }
}
