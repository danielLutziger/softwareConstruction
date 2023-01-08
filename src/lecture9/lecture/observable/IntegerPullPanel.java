package lecture9.lecture.observable;

import java.awt.*;

public class IntegerPullPanel implements Observer {
    // User interface element that represents a text field
    private TextField aText = new TextField();

    @Override
    public void newNumber(int pNumber) {
        //remove method for actual implementation
    }

    // pull strategy model
    public void newNumber(Model pModel) {
        aText.setText(Integer.toString(pModel.getaNumber()));
    }
}

