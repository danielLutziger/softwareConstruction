package refactoring.observer;

class ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject subject;
    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.name = name;
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}