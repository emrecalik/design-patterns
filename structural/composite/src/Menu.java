import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{

    private final List<MenuComponent> menuComponents = new ArrayList<>();

    private final String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return this.menuComponents.get(i);
    }

    @Override
    public void display() {
        System.out.println(this.name);

        for(MenuComponent menuComponent : menuComponents) {
            menuComponent.display();
        }
    }
}
