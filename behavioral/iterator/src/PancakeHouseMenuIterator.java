import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{

    private final List<MenuItem> menuItemList;

    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public boolean hasNext() {
        return position < menuItemList.size() && menuItemList.get(position) != null;
    }

    @Override
    public MenuItem next() {
        position++;
        return menuItemList.get(position - 1);
    }
}
