package examBoilerPlate.inheritanceExample;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Integer> aList;
    private String a;
    private int b;
    public Car(){
        aList = new ArrayList<>();
    }
    public Car(List<Integer> cars, String a, int b){
        aList = new ArrayList<>();
        for( Integer card : cars) { aList.add(card);}
        this.a = a;
        this.b = b;
    }
}
