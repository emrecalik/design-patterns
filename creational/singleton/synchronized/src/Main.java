public class Main {

    public static void main(String[] args) {
       Singleton singletonInstance = Singleton.getInstance();
       singletonInstance.getMessage();
       System.out.println(singletonInstance);
       System.out.println(Singleton.getInstance());
    }
}
