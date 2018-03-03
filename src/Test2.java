public class Test2 {
    int a, b;
    public Test2(int i, int j) {
        a = i;
        b = j;
    }
    // pass an object
    void meth(Test2 o1) {
        o1.a *= 2;
        o1.b /= 2;
    }
    // pass an int
        void meth (int a, int b){
        a *= 2;
        b /=2;
    }
}
    class PassObjRef{
        public static void main(String[] args) {
            Test2 obj = new Test2(15, 20);

            int x=10; int y=10;
            obj.meth(x,y);
            System.out.println("x and y before call  " + x + " " + y);
            System.out.println("ob.a and ob.b before call  " + obj.a + " " + obj.b);
            obj.meth(obj);
            System.out.println("ob.a and ob.b after call  " + obj.a + " " + obj.b);

        }
    }

