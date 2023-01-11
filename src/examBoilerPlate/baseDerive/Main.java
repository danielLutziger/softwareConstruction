package examBoilerPlate.baseDerive;

class BaseClass {
    public void printType() {
        System.out.println("base");
    }
}

class DerivedClass extends BaseClass {
    public void printType(){
        System.out.println("derived");
    }
}

public class Main {
    public static void doPrint(BaseClass o){
        if (o instanceof BaseClass){
            System.out.print("base --> ");
            o.printType();
        }
        o.printType();
        /**
        if (o instanceof DerivedClass){
            System.out.print("derived --> ");
            o.printType();
        }*/
    }

    public static void main(String args[]){
        BaseClass x = new DerivedClass();
        BaseClass y = new BaseClass();
        DerivedClass z = new DerivedClass();
        doPrint(x);
        doPrint(y);
        doPrint(z);
    }
}
