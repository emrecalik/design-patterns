public class Waitress {

    private final Menu dinerMenu;

    private final Menu pancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void displayMenu() {
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("**** Diner Menu Items ****");
        displayMenuItems(dinerMenuIterator);

        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        System.out.println("**** Pancake House Menu Items ****");
        displayMenuItems(pancakeHouseMenuIterator);
    }

    private void displayMenuItems(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println("Item = " + menuItem.getName() + " -- Price = " + menuItem.getPrice());
        }
    }
}
