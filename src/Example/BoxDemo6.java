package Example;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        vol = mybox1.voluem();
        System.out.println("Объем равен " + vol);

        vol = mybox2.voluem();
        System.out.println("Объем равен " + vol);
    }
}
