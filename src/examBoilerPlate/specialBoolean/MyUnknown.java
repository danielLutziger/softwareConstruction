package examBoilerPlate.specialBoolean;


public class MyUnknown extends MyBoolean {

    @Override
    public MyBoolean not() {
        return this;
    }

    @Override
    public MyBoolean or(MyBoolean b) {
        //b.and(this) => something like this to prevent if else
        //
        if (b instanceof MyTrue) return b;
        return this;
    }

    @Override
    public MyBoolean and(MyBoolean b) {
        if (b instanceof MyFalse) return b;
        return this;
    }

    @Override
    public void ifTrue(Runnable r) {

    }

    @Override
    public void ifFalse(Runnable r) {

    }

    @Override
    public void ifUnknown(Runnable r) {
        r.run();
    }

    @Override
    public void ifTrueElseUnknown(Runnable aTrueRunnable, Runnable aFalseRunnable, Runnable aUnknownRunnable) {
        aUnknownRunnable.run();
    }
}
