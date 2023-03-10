package lecture4.iterator.lecture;

import java.util.ArrayList;

public class PancakeHouseMenu
        /*implements Menu*/ {
    ArrayList menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B’s Pancake",true,2.99);
        addItem("Regular Pancake",false,2.99);
    }
    public void addItem(String name,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems; }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems); }
}