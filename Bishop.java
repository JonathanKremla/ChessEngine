public class Bishop implements ChessPiece{
    String color;
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
}
