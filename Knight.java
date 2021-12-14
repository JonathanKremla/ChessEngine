public class Knight implements ChessPiece{
    private String color;

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
}
