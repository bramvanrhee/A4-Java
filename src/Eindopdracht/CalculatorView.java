package eindopdracht;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
    private JTextField num1 = new JTextField(11);
    private JLabel operator = new JLabel("+");
    private JTextField num2 = new JTextField(11);
    private JButton calcButton = new JButton("Berekenen");
    private JLabel calcAnswer = new JLabel("Uw antwoord komt hier te staan");

    CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,600);

        calcPanel.add(num1);
        calcPanel.add(operator);
        calcPanel.add(num2);
        calcPanel.add(calcButton);
        calcPanel.add(calcAnswer);

        this.add(calcPanel);
    }

    public int getNum1() {
        return Integer.parseInt(num1.getText());
    }

    public int getNum2() {
        return Integer.parseInt(num2.getText());
    }

    public void setCalcAnswer(int answer){
        calcAnswer.setText(Integer.toString(answer));
    }

    void addCalcListener(ActionListener listenerCalcButton){
        calcButton.addActionListener(listenerCalcButton);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}