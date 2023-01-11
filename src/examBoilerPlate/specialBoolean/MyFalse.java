package examBoilerPlate.specialBoolean;

public class MyFalse extends MyBoolean{

    @Override
    public MyBoolean not() {
        return new MyTrue();
    }

    @Override
    public MyBoolean or(MyBoolean b) {
        return b;
    }

    @Override
    public MyBoolean and(MyBoolean b) {
        return this;
    }

    @Override
    public void ifTrue(Runnable r) {

    }

    @Override
    public void ifFalse(Runnable r) {
        r.run();
    }

    @Override
    public void ifUnknown(Runnable r) {

    }

    @Override
    public void ifTrueElseUnknown(Runnable aTrueRunnable, Runnable aFalseRunnable, Runnable aUnknownRunnable) {
        aFalseRunnable.run();
    }
}
