public class Bishop implements ChessPiece{
    private String color;
    private Coordinates position;
    public Bishop(String color){
        this.color = color;
    }

    public String color(){
        return color;
    }

    @Override
    public String toString() {
        return "Bishop{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int worth() {
        return 300;
    }

    public boolean validMove(Coordinates destination, ChessBoard board){
        if((Math.abs((int)position.getLetter() - (int) destination.getLetter()) - Math.abs(position.getNumber()) - destination.getNumber()) != 0) return false;
        if(board.get(destination) == null) return true;
        return !board.get(destination).color().equals(this.color);
    }
}
