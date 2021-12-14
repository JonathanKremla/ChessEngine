public class Queen implements ChessPiece{
    private String color;

    public Queen(String color){
        this.color = color;
    }


    @Override
    public String color() {
        return color;
    }

    @Override
    public String toString() {
        return "Queen{" +
                "color='" + color + '\'' +
                '}';
    }
}
