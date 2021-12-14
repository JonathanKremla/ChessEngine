public class Pawn implements ChessPiece{
    private String color;

    public Pawn(String color){
        this.color = color;
    }


    @Override
    public String color() {
        return color;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "color='" + color + '\'' +
                '}';
    }
}
