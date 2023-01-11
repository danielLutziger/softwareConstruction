package refactoring.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver(subject, "Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver(subject, "Observer 2");

        subject.notifyObservers("Hello World");
    }
}