public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

       /* mybox1.depth = 10;
        mybox1.height =20;
        mybox1.width = 15;*/

        mybox2.depth = 3;
        mybox2.height =6;
        mybox2.width = 9;

        vol  = mybox1.volume();
          System.out.println("Volume is " + vol);

        vol = mybox2.volume();
              System.out.println("Volume is " + vol);

        System.out.println(mybox1.avg(2,4,5,6,7,8,9));
        mybox1=null;
        System.gc();
    }
}
