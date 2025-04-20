package calculator;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            CalculatorForm form = new CalculatorForm();
            form.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
