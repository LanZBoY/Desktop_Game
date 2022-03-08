package Games;


public class Executor {

    private Board board;

    public Executor(Board board){
        this.board = board;
    }

    public void start() throws Exception {
        if(board == null){
            throw new Exception("No Board");
        }
    }
}
