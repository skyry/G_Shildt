public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        /*

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.setDim(10,20,15);
        mybox2.setDim(5,6,9);

         */

        vol = mybox1.volume();
        System.out.println("Box1 " + mybox1.volume());
        vol = mybox2.volume();
        System.out.println("Box2 " + mybox2.volume());

        //mybox1.volume();
        //mybox2.volume();
    }
}
