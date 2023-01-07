package lecture4.iterator.lecture;

public class Main {
    public static void main(String args[]){
        Waitress w = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        w.printMenu();
    }
}
