import java.util.HashMap;

public class ChessBoard {
    private HashMap<Coordinates,ChessPiece> board = new HashMap<>(64);
    private char a = 96;

    public ChessBoard(){
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                board.put(new Coordinates((char) (a+i),j),null);
            }
        }
    }

    public void print(){
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                System.out.println(new Coordinates((char)(a+j),i));
                System.out.println(board.get(new Coordinates((char)(a+j),i)));
            }
        }
    }

    public void startingPosition(){
        for(int i = 1; i<= 8; i++){
            board.put(new Coordinates((char) (a+i),2),new Pawn());
            board.put(new Coordinates((char) (a+i),7),new Pawn());
            switch (i) {
                case (1), (8) -> {
                    board.put(new Coordinates((char) (a + i), 1), new Rook());
                    board.put(new Coordinates((char) (a + i), 8), new Rook());
                }
                case (2), (7) -> {
                    board.put(new Coordinates((char) (a + i), 1), new Knight());
                    board.put(new Coordinates((char) (a + i), 8), new Knight());
                }
                case (3), (6) -> {
                    board.put(new Coordinates((char) (a + i), 1), new Bishop());
                    board.put(new Coordinates((char) (a + i), 8), new Bishop());
                }
                case (4) -> {
                    board.put(new Coordinates((char) (a + i), 1), new Queen());
                    board.put(new Coordinates((char) (a + i), 8), new Queen());
                }
                case (5) -> {
                    board.put(new Coordinates((char) (a + i), 1), new King());
                    board.put(new Coordinates((char) (a + i), 8), new King());
                }
            }
        }
    }

}

