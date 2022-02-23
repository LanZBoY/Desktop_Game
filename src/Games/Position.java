package Games;

public class Position {
    public Integer x;
    public Integer y;

    public Position (Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return String.format("(%d, %d)", this.x, this.y);
    }
}
