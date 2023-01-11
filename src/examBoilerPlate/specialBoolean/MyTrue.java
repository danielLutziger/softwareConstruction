package examBoilerPlate.specialBoolean;

public class MyTrue extends MyBoolean{
    @Override
    public MyBoolean not() {
        return new MyFalse();
    }

    @Override
    public MyBoolean or(MyBoolean b) {
        return this;
    }

    @Override
    public MyBoolean and(MyBoolean b) {
        return b;
    }


    @Override
    public void ifTrue(Runnable r) {
        r.run();
    }

    @Override
    public void ifFalse(Runnable r) {

    }

    @Override
    public void ifUnknown(Runnable r) {

    }

    @Override
    public void ifTrueElseUnknown(Runnable aTrueRunnable, Runnable aFalseRunnable, Runnable aUnknownRunnable) {
        aTrueRunnable.run();
    }
}
