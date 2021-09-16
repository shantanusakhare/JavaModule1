public class salary {
    public static void main(String[] args)
    {
        float basic = 25000;
        float DA,HRA,CCA,PF,PT;
        float gross,net;

        DA = (float) (0.7 * basic);
        HRA = (float) (0.3 * basic);
        CCA = 240;
        gross = DA+HRA+CCA+basic;
        net = (float) (gross - 0.1 * basic) - 100;

        System.out.println(" Gross =  "+gross);
        System.out.println(" Net = "+net);
    }

}
