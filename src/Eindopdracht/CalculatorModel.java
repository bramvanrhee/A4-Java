package eindopdracht;

public class CalculatorModel {
    private int calcValue;

    public void TwoNumbers(int num1, int num2) {
        calcValue = num1 + num2;
    }

    public int getCalcValue() {
        return calcValue;
    }
}