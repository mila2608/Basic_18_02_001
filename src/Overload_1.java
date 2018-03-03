public class Overload_1 {

    static void m(){
        System.out.println("m()");
    }
    static void m(int a){
        System.out.println("m(int a)");
    }
    static void m(int a, int b){
        System.out.println("m(int a, int b)");
    }
    static void m(double a){
        System.out.println("m(double a)");
    }
    static void m(int ...a){
        System.out.println("m(int ...a)");
    }
}
