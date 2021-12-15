import java.util.Objects;

public class Coordinates {
    private char letter; //letters on a Chess board a - h
    private int number; //numbers on a Chess board 1-8

    public Coordinates(char letter, int number){
        this.letter = letter;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return letter == that.letter && number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, number);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "letter=" + letter +
                ", number=" + number +
                '}';
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setNumber(int number){
        this.number = number;
    }
}
