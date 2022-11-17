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
            error = (c - cn)/c;
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
            error = (c - cn)/c;
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

    public static void newtonRaphFunc1(double x)
    {
        //2x^3 - 11.7x^2 + 17.7x - 5
        //6x^2 - 23.4x + 17.7
        double xn = x;
        double fxn = 0;
        double fxpn = 0;
        double d = 0;
        double error = 0;
        System.out.println("n\txn\tf(xn)\tf'(xn)\td\terr.");
        for (int i = 0; i < 100; i++)
        {
            fxn = (2*Math.pow(xn, 3)) - (11.7*Math.pow(xn,2)) + (17.7 * xn) - 5;
            fxpn = (6*Math.pow(xn,2)) - (23.4 * xn) + 17.7;
            d = fxn/fxpn;
            error = Math.abs(d);
            System.out.println(i + "\t" + xn + "\t" + fxn + "\t" + fxpn + "\t" + d + "\t" + error);
            if (error < .01)
            {
                System.out.println("Convergence");
                break;
            }
            xn = xn - d;
        }
    }

    public static void newtonRaphFunc2(double x)
    {
        //x + 10 - xcosh(50/x)
        //(50sinh(50/x))/x -cosh(50/x) + 1
        double xn = x;
        double fxn = 0;
        double fxpn = 0;
        double d = 0;
        double error = 0;
        System.out.println("n\txn\tf(xn)\tf'(xn)\td\terr.");
        for (int i = 0; i < 100; i++)
        {
            fxn = xn + 10 - (xn * Math.cosh(50/xn));
            fxpn = ((50*Math.sinh(50/xn))/xn) - Math.cosh(50/xn) + 1;
            d = fxn/fxpn;
            error = Math.abs(d);
            System.out.println(i + "\t" + xn + "\t" + fxn + "\t" + fxpn + "\t" + d + "\t" + error);
            if (error < .01)
            {
                System.out.println("Convergence");
                break;
            }
            xn = xn - d;
        }
    }

    public static void secantFunc1(double x1, double x2)
    {
        //2x^3 - 11.7x^2 + 17.7x - 5
        double a = x1;
        double b = x2;
        double fa = (2*Math.pow(a, 3)) - (11.7*Math.pow(a,2)) + (17.7 * a) - 5;
        double fb = (2*Math.pow(b, 3)) - (11.7*Math.pow(b,2)) + (17.7 * b) - 5;
        double d = 0;
        if (Math.abs(fa) > Math.abs(fb))
        {
            double temp = a;
            a = b;
            b = temp;
            temp = fa;
            fa = fb;
            fb = temp;
        }
        System.out.println("n\tx\tf(x)\terr.");
        System.out.println(0 + "\t" + a + "\t" + fa);
        System.out.println(1 + "\t" + b + "\t" + fb);
        for (int i = 2; i < 100; i++)
        {
            if (Math.abs(fa) > Math.abs(fb))
            {
                double temp = a;
                a = b;
                b = temp;
                temp = fa;
                fa = fb;
                fb = temp;
            } 
            d = (b-a)/(fb-fa);
            b = a;
            fb = fa;
            d *= fa;
            System.out.println(i + "\t" + a + "\t" + fa + "\t" + d);
            if (Math.abs(d) < .01)
            {
                System.out.println("Convergence");
                break;
            }
            a -= d;
            fa = (2*Math.pow(a, 3)) - (11.7*Math.pow(a,2)) + (17.7 * a) - 5;

        }
    }

    public static void secantFunc2(double x1, double x2)
    {
        //x + 10 - xcosh(50/x)
        double a = x1;
        double b = x2;
        double fa =  a + 10 - (a*Math.cosh(50/a));
        double fb = b + 10 - (b*Math.cosh(50/b));
        double d = 0;
        if (Math.abs(fa) > Math.abs(fb))
        {
            double temp = a;
            a = b;
            b = temp;
            temp = fa;
            fa = fb;
            fb = temp;
        }
        System.out.println("n\tx\tf(x)\terr.");
        System.out.println(0 + "\t" + a + "\t" + fa);
        System.out.println(1 + "\t" + b + "\t" + fb);
        for (int i = 2; i < 100; i++)
        {
            if (Math.abs(fa) > Math.abs(fb))
            {
                double temp = a;
                a = b;
                b = temp;
                temp = fa;
                fa = fb;
                fb = temp;
            } 
            d = (b-a)/(fb-fa);
            b = a;
            fb = fa;
            d *= fa;
            System.out.println(i + "\t" + a + "\t" + fa + "\t" + d);
            if (Math.abs(d) < .01)
            {
                System.out.println("Convergence");
                break;
            }
            a -= d;
            fa =  a + 10 - (a*Math.cosh(50/a));

        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // bisectionFunc1(0, 1);
        // bisectionFunc2(120, 130);
        // falseFunc1(0, 1);
        // falseFunc2(120, 130);
        // newtonRaphFunc1(0);
        // newtonRaphFunc2(120);
        // secantFunc1(0, 0.2);
        secantFunc2(120,121);
        scan.close();
    }
}