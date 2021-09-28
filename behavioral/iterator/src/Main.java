public class Main {
    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
        waitress.displayMenu();
    }

}
