package Eindopdracht

public class CalculatorMain {
    public static void main(String[] args) {
        CalculaterView View = new CalculatorView();
        CalculatorModel Model = new CalculatorModel();
        Eindopdracht.CalculatorController Controller = new Eindopdracht.CalculatorController(View, Model);

        View.setVisible(true);
    }
}
