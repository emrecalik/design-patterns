public class Main {

    public static void main(String[] args) {
        MenuComponent dinnerMenu = new Menu("Dinner Menu");
        dinnerMenu.add(new MenuItem("Egg", 10));
        dinnerMenu.add(new MenuItem("Tea", 1.5));

        MenuComponent lunchMenu = new Menu("Lunch Menu");
        lunchMenu.add(new MenuItem("Schnitzel", 15));
        lunchMenu.add(new MenuItem("Coffee", 5));

        MenuComponent allMenus = new Menu("All Menus");
        allMenus.add(dinnerMenu);
        allMenus.add(lunchMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
