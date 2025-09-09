package Example;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long secends;
        long distance;

        lightspeed = 186000;

        days = 1000;

        secends = days * 24 * 60 * 60;

        distance = lightspeed * secends;

        System.out.print(" За " + days);
        System.out.print(" дней света пройдет окло ");
        System.out.println(distance+ " миль. ");
    }
}
