public class Rook implements ChessPiece{
    private String color;
    private Coordinates position;

    public Rook(String color){
        this.color = color;
    }


    @Override
    public String color() {
        return color;
    }

    @Override
    public String toString() {
        return "Rook{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int worth() {
        return 500;
    }

    public boolean validMove(Coordinates destination, ChessBoard board){
        if(!(position.getLetter() == destination.getLetter() || position.getNumber() == destination.getNumber())) return false;
        if(board.get(destination) == null) return true;
        return !board.get(destination).color().equals(this.color);
    }
}
