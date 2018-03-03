public class Box {
    double height = 10;
    double width = 10;
    double depth = 10;

   /* public Box(double height, double width, double depth) {
   //     this();
        // ссылка на текущий конструктор. должен стоять в начале. вызов дефолтного конструктора
        this.height = height;
        this.width = width;
        this.depth = depth;
    }*/

    public Box() {
        System.out.println("constructor");
    }

    double volume (){
     double vol = depth * width * height;
  //      System.out.println("Volume is " + vol);
         return vol;
    }

    double avg(int... a){
  // примет любое количество интов
        int c = 0;
        for (int i : a) {
            c +=i;
        }
  return c/a.length;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("123456789");
    }
}
