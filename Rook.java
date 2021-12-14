public class Rook implements ChessPiece{
    private String color;

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
}
