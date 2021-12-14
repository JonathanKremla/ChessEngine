public class King implements ChessPiece{
    private String color;
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
}
