package examBoilerPlate.inheritanceExample;

import java.util.List;

public class Porsche extends Car{
    private List<Integer> aList;
    private String a;
    private int b;
    public Porsche(List<Integer> aList, String a, int b){
        super(aList, a, b);
        aList.add(6);
        this.aList = aList;
        this.a = a;
        this.b = b;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void add(int a) {
        this.aList.add(a);
    }

    public List<Integer> getaList() {
        return aList;
    }
}
