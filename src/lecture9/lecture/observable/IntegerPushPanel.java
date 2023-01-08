package lecture9.lecture.observable;

import java.awt.*;

public class IntegerPushPanel implements Observer {
    // User interface element that represents a text field
    private TextField aText = new TextField();
    // push strategy model
    public void newNumber(int pNumber) {
        aText.setText(Integer.toString(pNumber));
    }

    @Override
    public void newNumber(Model pModel) {

    }
}

