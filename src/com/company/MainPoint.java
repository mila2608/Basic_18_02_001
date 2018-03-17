package com.company;

public class MainPoint {
    public static void main(String[] args) throws CloneNotSupportedException {
      /*  Payment p = new PaymentCard();
        System.out.println("go to shop");
        System.out.println("get goods");
        p.pay();
        System.out.println("go");

        Point point = new Point(10, 10);
        Point point1 = new Point(10, 16);
        Point point2 = (Point) point.clone();
        System.out.println(point.hashCode());
        System.out.println(point1.hashCode());
        System.out.println(point1.equals(point2));
        System.out.println(point.getClass() == Point.class);
        Stream.of("1", "2","3", "4").mapToInt(Integer::parseInt).filter(s->s%2==0).forEach(s-> System.out.println());*/

        MyClass myClass = new MyClass();
        myClass.show();
        MyClass.MyNestedClass b = new MyClass.MyNestedClass();
        b.show();
        MyClass.MyInnerClass c = myClass.new MyInnerClass();
        c.show();

       MyClass myClass1 = new MyClass() {
            int a = 100;

            @Override
            public void show() {
                System.out.println("My Anonimic Class" + a);
            }

            public void m() {
                System.out.println("m" + a);

            }
        };
myClass1.show();
   //     MyClass myClass2 = new A();
   //     myClass2.show();


    }
}
