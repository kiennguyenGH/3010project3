import java.util.Scanner;
import java.lang.Math;
public class roots
{

    public static void bisectionFunc1(double one, double two)
    {
        //2x^3 - 11.7x^2 + 17.7x - 5
        double a = one;
        double fa = (2 * Math.pow(a, 3)) - (11.7 * Math.pow(a, 2)) + (17.7 * a) - 5;  
        double b = two;
        double fb = (2 * Math.pow(b, 3)) - (11.7 * Math.pow(b, 2)) + (17.7 * b) - 5;
        double error = b - a;
        double c = 0;
        double fc = 0;
        System.out.println("n\ta\tf(a)\tb\tf(b)\tc\tf(c)\terr.");
        for (int i = 0; i < 100; i++)
        {
            error /= 2;
            c = a + error;
            fc = (2 * Math.pow(c, 3)) - (11.7 * Math.pow(c, 2)) + (17.7 * c) - 5;
            System.out.println(i + "\t" + a + "\t" + fa + "\t" + b + "\t" + fb + "\t" + c + "\t" + fc + "\t" + error);
            if (Math.abs(error) < .01)
            {
                System.out.println("Convergence");
                break;
            }
            if ((fa > 0 && fc < 0) || (fa < 0 && fc > 0))
            {
                b = c;
                fb = fc;
            }
            else
            {
                a = c;
                fa = fc;
            }
        }
    }

    public static void bisectionFunc2(double one, double two)
    {
        //x + 10 - xcosh(50/x)
        double a = one;
        double fa = a + 10 - (a * (Math.cosh(50/a)));  
        double b = two;
        double fb = b + 10 - (b * (Math.cosh(50/b)));  
        double error = b - a;
        double c = 0;
        double fc = 0;
        System.out.println("n\ta\tf(a)\tb\tf(b)\tc\tf(c)\terr.");
        for (int i = 0; i < 100; i++)
        {
            error /= 2;
            c = a + error;
            fc = c + 10 - (c * (Math.cosh(50/c)));  
            System.out.println(i + "\t" + a + "\t" + fa + "\t" + b + "\t" + fb + "\t" + c + "\t" + fc + "\t" + error);
            if (Math.abs(error) < .01)
            {
                System.out.println("Convergence");
                break;
            }
            if ((fa > 0 && fc < 0) || (fa < 0 && fc > 0))
            {
                b = c;
                fb = fc;
            }
            else
            {
                a = c;
                fa = fc;
            }
        }
    }

    public static void falseFunc1(int one, int two)
    {    
        //2x^3 - 11.7x^2 + 17.7x - 5
        double a = one;
        double fa = (2 * Math.pow(a, 3)) - (11.7 * Math.pow(a, 2)) + (17.7 * a) - 5;  
        double b = two;
        double fb = (2 * Math.pow(b, 3)) - (11.7 * Math.pow(b, 2)) + (17.7 * b) - 5;
        double error = 0;
        double c = 0;
        double fc = 0;
        double cn = 0;
        System.out.println("n\ta\tf(a)\tb\tf(b)\tc\tf(c)\terr.");
        for (int i = 0; i < 100; i++)
        {
            c = ((b * fa) - (a * fb))/(fa - fb);
            error = (c - cn)/cn;
            fc = (2 * Math.pow(c, 3)) - (11.7 * Math.pow(c, 2)) + (17.7 * c) - 5;
            System.out.println(i + "\t" + a + "\t" + fa + "\t" + b + "\t" + fb + "\t" + c + "\t" + fc + "\t" + error);
            if (Math.abs(error) < .01)
            {
                System.out.println("Convergence");
                break;
            }
            if ((fa > 0 && fc < 0) || (fa < 0 && fc > 0))
            {
                b = c;
                fb = fc;
            }
            else
            {
                a = c;
                fa = fc;
            }
            cn = c;
        }
    }

    public static void falseFunc2(double one, double two)
    {
        //x + 10 - xcosh(50/x)
        double a = one;
        double fa = a + 10 - (a * (Math.cosh(50/a)));  
        double b = two;
        double fb = b + 10 - (b * (Math.cosh(50/b)));  
        double error = 0;
        double c = 0;
        double fc = 0;
        double cn = 0;
        System.out.println("n\ta\tf(a)\tb\tf(b)\tc\tf(c)\terr.");
        for (int i = 0; i < 100; i++)
        {
            c = ((b * fa) - (a * fb))/(fa - fb);
            error = (c - cn)/cn;
            fc = c + 10 - (c * (Math.cosh(50/c)));  
            System.out.println(i + "\t" + a + "\t" + fa + "\t" + b + "\t" + fb + "\t" + c + "\t" + fc + "\t" + error);
            if (Math.abs(error) < .01)
            {
                System.out.println("Convergence");
                break;
            }
            if ((fa > 0 && fc < 0) || (fa < 0 && fc > 0))
            {
                b = c;
                fb = fc;
            }
            else
            {
                a = c;
                fa = fc;
            }
            cn = c;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // bisectionFunc1(0, 1);
        // bisectionFunc2(120, 130);
        // falseFunc1(0, 1);
        falseFunc2(120, 130);
        scan.close();
    }
}