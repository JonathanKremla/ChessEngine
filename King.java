public class King implements ChessPiece{
    private String color;
    private Coordinates position;

    public King(String color){
        this.color = color;
    }

    public String color(){
        return color;
    }

    @Override
    public String toString() {
        return "King{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int worth() {
        return 10000;
    }

    public boolean validMove(Coordinates destination, ChessBoard board){
        int pos1 = Math.abs((int) destination.getLetter() - (int) position.getLetter());
        int pos2 = Math.abs(destination.getNumber() - position.getNumber());
        if(!(pos1 == 1 || pos2 == 1)) return false;
        if(board.get(destination) == null) return true;
        return !board.get(destination).color().equals(this.color);
    }
}
