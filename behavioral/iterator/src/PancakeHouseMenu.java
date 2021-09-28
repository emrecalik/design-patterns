import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu{

    private final List<MenuItem> menuItemList;

    public PancakeHouseMenu() {
        menuItemList = new ArrayList<>();

        addMenuItem(new MenuItem("Chocolate", 5));
        addMenuItem(new MenuItem("Cream", 2));
        addMenuItem(new MenuItem("Vaffle", 8));
    }

    private void addMenuItem(MenuItem menuItem) {
        this.menuItemList.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItemList);
    }
}
