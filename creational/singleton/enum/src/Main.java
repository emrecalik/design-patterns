public class Main {

    public static void main(String[] args) {
        SingletonEnum singletonEnum1 = SingletonEnum.Instance;
        System.out.println(singletonEnum1.hashCode());
        SingletonEnum singletonEnum2 = SingletonEnum.Instance;
        System.out.println(singletonEnum2.hashCode());
    }
}
