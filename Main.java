public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        Class<?> cls = str.getClass();
        System.out.println("The runtime class of 'str' is: " + cls.getName());
    }
}
