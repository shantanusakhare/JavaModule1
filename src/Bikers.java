/*
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers.
 */
public class Bikers {
    public static void main(String[] args)
    {

        float R1 = 100, R2 = 120, R3 = 110, R4 = 125, R5 = 130,avg;
        avg = (R1+R2+R3+R4+R5)/5;
        System.out.println("Average = "+avg);
        if (R1> avg)
            System.out.println("Racer R1 is Qualified");
        if (R2> avg)
            System.out.println("Racer R2 is Qualified");
        if (R3> avg)
            System.out.println("Racer R3 is Qualified");
        if (R4> avg)
            System.out.println("Racer R4 is Qualified");
        if (R5> avg)
            System.out.println("Racer R5 is Qualified");

    }
}
