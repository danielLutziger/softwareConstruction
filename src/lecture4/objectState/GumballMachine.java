package lecture4.objectState;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        //repeat for all states ..
        if (count > 0 ) { state = noQuarterState;}
        if (count == 0 ) { state = soldOutState;}
        if (count == -1 ) { state = soldState;}
        if (count > 10 ) { state = hasQuarterState;}
    }

    public void insertQuarter() {
        state.insertQuarter(); }
    public void ejectQuarter() {
        state.ejectQuarter(); }
    public void turnCrank() {
        state.turnCrank();
        state.dispense(); }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
