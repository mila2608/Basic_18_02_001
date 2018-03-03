public class Class1 {
    public static void aMethod(long val, int val2) {
        System.out.println("byte");
    }

    public static void main(int val, long val2) {
        System.out.println("short");
    }

    public static void main(String[] args) {
        aMethod(9, (int) 10L);
    }
}
