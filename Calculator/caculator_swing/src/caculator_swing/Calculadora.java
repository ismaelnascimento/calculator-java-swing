package oi;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora {
    protected double num1;
    protected double num2;
    protected JTextField display;
    protected String operator;
    protected double result;
    
    public void insertNumber(ActionEvent e) {
        String num = display.getText()+e.getActionCommand();
	display.setText(num);
    }
    public void insertOperator(ActionEvent e) {
        num1 = Double.parseDouble(display.getText().replace(",", "."));
        display.setText("");
	operator = e.getActionCommand();
    }
    public void somar() {
        result = num1 + num2;
    }	
    public void subtrair() {
        result = num1 - num2;
    }
    public void dividir() {
        result = num1 / num2;
    }
    public void multiplicar() {
        result = num1 + num2;
    }
    public void porcentagem() {
        result = (num1 * num2) / 100.0;
    }
}
