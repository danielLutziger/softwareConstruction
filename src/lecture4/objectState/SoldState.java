package lecture4.objectState;

public class SoldState implements State {
    GumballMachine gbMachine;

    public SoldState(GumballMachine gbM) {
        this.gbMachine = gbM; }
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gbMachine.setState(gbMachine.getHasQuarterState()); }
    public void ejectQuarter() {
        System.out.println("You haven’t inserted a quarter"); }
    public void turnCrank() {
        System.out.println("You turned, but there is no quarter"); }
    public void dispense() {
        System.out.println("You need to pay first"); }
}
