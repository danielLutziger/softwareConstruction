package lecture9.lecture.observable;

import java.util.ArrayList;

public class Model {
    private int aNumber = 5;
    private ArrayList<Observer> aObservers = new ArrayList<>();
    public void addObserver(Observer pObserver) { aObservers.add(pObserver); }
    public void removeObserver(Observer pObserver) { aObservers.remove(pObserver); }
    private void notifyObservers() { // use the call back method to inform the observers
        for(Observer observer : aObservers) { 	observer.newNumber(aNumber); }
    }
    // set new number in the model and automatically update the observers
    public void setNumber(int pNumber) {
        if( pNumber <=0){ aNumber = 1; }
        else if( pNumber > 10 ) { aNumber = 10; }
        else { aNumber = pNumber; }
        notifyObservers();
    }

    public int getaNumber() {
        return aNumber;
    }
}

