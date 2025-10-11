package Example;

public class Break {
    public static void main(String[] args) {
        boolean t =true;

        first: {
            second: {
            third:{
                System.out.println("Предшествует опертору break.");
                if (t)  break second;
                System.out.println("Этот опертор не будет выполняться");
            }
            System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блокаом second.");
        }
    }
}
