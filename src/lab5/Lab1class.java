package lab5;

public class Lab1class {
    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getCode() {
        return (int) symbol;
    }

    public void print() {
        System.out.println("Символ: " + symbol + ", код: " + getCode());
    }
}
