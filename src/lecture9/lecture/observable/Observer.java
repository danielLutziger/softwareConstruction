package lecture9.lecture.observable;

public interface Observer {
    void newNumber(int pNumber); //callback method push data flow
    void newNumber(Model pModel); // callback method for a pull data flow
}

