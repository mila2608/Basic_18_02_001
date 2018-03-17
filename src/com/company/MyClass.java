package com.company;

public class MyClass {
    String myClass = "my Class";
    static int a = 10;

    public void show() {
        System.out.println(myClass);
    }



    public static class MyNestedClass {
        String myNestedClass = "my Nested Class";

        public  void show(){


            System.out.println(myNestedClass);
        }
    }

    public  class MyInnerClass {
        String myInnerClass = "my Inner Class";

        public  void show(){


            System.out.println(myInnerClass);
        }
    }
}
