public class Test2 {
    int a, b;
    public Test2(int i, int j) {
        a = i;
        b = j;
    }
    // pass an object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
    // pass an int
        void meth (int a, int b){
        a *= 2;
        b /=2;
    }
}
    class PassObjRef{
        public void main(String[] args) {
            Test2 ob = new Test2(15, 20);

            int x=10; int y=10;
            ob.meth(x,y);
            System.out.println("x and y before call" + x + " " + y);
            System.out.println("ob.a and ob.b before call" + ob.a + " " + ob.b);
            ob.meth(ob);
            System.out.println("ob.a and ob.b after call" + ob.a + " " + ob.b);

        }
    }

