package lecture8.lecture.inheritance;

public class Deck implements CardSource {

    public Deck(String hello) {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
