package examBoilerPlate.specialBoolean;

/**
 * could do a singleton design pattern for the sub classes
 */
public abstract class MyBoolean {
    public abstract MyBoolean not();
    public abstract MyBoolean or(MyBoolean b);
    public abstract MyBoolean and(MyBoolean b);

    // lecture
    public abstract void ifTrue (Runnable r);
    public abstract void ifFalse (Runnable r);
    public abstract void ifUnknown (Runnable r);
    public abstract void ifTrueElseUnknown (Runnable aTrueRunnable, Runnable aFalseRunnable, Runnable aUnknownRunnable);
}
