package eindopdracht;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
        this.view.addCalcListener(new CalcListener());
    }

    class CalcListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            int num1, num2 = 0;

            try {
                num1 = view.getNum1();
                num2 = view.getNum2();
                model.TwoNumbers(num1, num2);
                view.setCalcAnswer(model.getCalcValue());
            }

            catch (NumberFormatException ex){
                view.displayErrorMessage("U heeft twee cijfers nodig");
            }
        }
    }
}