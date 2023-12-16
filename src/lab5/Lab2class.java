package lab5;

public class Lab2class {
    private char symbol1;
    private char symbol2;

    public void setSymbol1(char symbol1) {
        this.symbol1 = symbol1;
    }

    public void setSymbol2(char symbol2) {
        this.symbol2 = symbol2;
    }

    public void printSymbols() {
        for (char i = symbol1; i <= symbol2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
