public class Test3 {
    public static void main(String[] args) {
        Girl girl1 = new Girl("Ket", 23);
        Girl girl2 = new Girl("Ket1", 33);
        SuperGirl superGirl1 = new SuperGirl("Ket2", 32, "SuperPower");

        System.out.println(girl1);
        System.out.println(girl2);
        girl1.goToCinema();
        girl1.setAge(1000);
    }


}
