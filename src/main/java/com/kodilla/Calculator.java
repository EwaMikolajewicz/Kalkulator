public class Calculator
{
    private double a;
    private double b;

    public double addAToB(double a, double b)
    {
        return a+b;
    }

    public double subtractAToB(double a, double b)
    {
        return a-b;
    }

    public double multiplyAByB (double a, double b)
    {
        return a*b;
    }

    public int aModuloB (int a, int b)
    {
        return a%b;
    }

    public static void main(String[] args)
    {
     Calculator calculator = new Calculator();

        System.out.println("a + b = " + calculator.addAToB(3.5, 15));
        System.out.println("a - b = " + calculator.subtractAToB(10.5, 12.5));
        System.out.println("a * b = " + calculator.multiplyAByB(12, 12));
        System.out.println("a % b = " + calculator.aModuloB(17, 3));
    }
}
