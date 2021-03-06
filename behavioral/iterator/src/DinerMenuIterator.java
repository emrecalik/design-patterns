public class DinerMenuIterator implements Iterator{

    private final MenuItem[] menuItems;

    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        position++;
        return menuItems[position-1];
    }
}
