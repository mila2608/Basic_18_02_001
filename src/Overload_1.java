class Overload_1 {

    static void m() {
        System.out.println("m()");
    }

    static void m(int a) {
        System.out.println("m(int a)");
    }

    static void m(int a, int b) {
        System.out.println("m(int a, int b)");
    }

    static void m(double a) {
        System.out.println("m(double a)");
    }

    static void m(int... a) {
        System.out.println("m(int ...a)");
    }
}

class main1 {
    public static void main(String[] args) {
        Overload_1.m(12);
        Overload_1.m(1,2);
        Overload_1.m(4,5,6,6,7,7,5);

    }

}
