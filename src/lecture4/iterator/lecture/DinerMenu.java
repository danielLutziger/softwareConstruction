package lecture4.iterator.lecture;

public class DinerMenu /*implements Menu*/{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", true, 2.99);
        addItem("Hotdog", false, 3.05);
    }
    public void addItem(String name,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new
                MenuItem(name, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1; }
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems); }
}
