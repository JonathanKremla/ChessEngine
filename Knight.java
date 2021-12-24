public class Knight implements ChessPiece{
    private String color;
    private Coordinates position;

    public Knight(String color){
        this.color = color;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int worth() {
        return 300;
    }

    public boolean validMove(Coordinates destination, ChessBoard board){
        if(true) return false;
        if(board.get(destination) == null) return true;
        return !board.get(destination).color().equals(this.color);
    }
}
