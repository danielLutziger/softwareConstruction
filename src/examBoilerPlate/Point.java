package examBoilerPlate;

import java.util.Optional;

public class Point {
    private Optional<Number> x;
    private Optional<Number> y;

    public Point(Number x, Number y) {

        this.x = Optional.ofNullable(x);
        this.y = Optional.ofNullable(y);
    }

    public Number getX() {
        if (x.isPresent()) return x.get();
        return 0;
    }

    public Number getY() {
        if (y.isPresent()) return y.get();
        return 0;
    }
}
