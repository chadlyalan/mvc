package mvcCalculator;

/**
 * Created by Chad on 3/14/2016.
 */
public class mvcCalculator {

    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
