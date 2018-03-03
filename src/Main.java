public class Main {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.age);
        System.out.println(firstClass.name);
        firstClass.age = 23;
        firstClass.name = "Ira";
        FirstClass firstClass1 = new FirstClass();
        firstClass1.age = 27;
        firstClass1.name = "KATE";
        firstClass.show();
        firstClass1.goToCinema();


    }
}
