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
        for(int i = 0; i < 9; i++){
            System.out.println(board.getCurrentPosition());
            System.out.println(board);
            Runtime.getRuntime().exec("cmd /c cls");
            board.move();
            Thread.sleep(1000);
        }
    }
}
