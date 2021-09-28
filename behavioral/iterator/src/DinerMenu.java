public class DinerMenu implements Menu{

    private int numberOfMenuItem = 0;

    private final int MAX_ITEMS = 4;

    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addMenuItem(new MenuItem("Egg", 2));
        addMenuItem(new MenuItem("Cheese", 4));
        addMenuItem(new MenuItem("Tea", 3));
        addMenuItem(new MenuItem("Coffee", 5));
    }

    private void addMenuItem(MenuItem menuItem) {
        menuItems[numberOfMenuItem] = menuItem;
        numberOfMenuItem++;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
