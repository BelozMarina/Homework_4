package homework4;

public class MethodMath {

//    Subtraction methods
    public int subtraction (int a, int b) {
        return a - b;
    }

    public int subtraction (int a, int b, int c) {
        return a - b - c;
    }


//    Summation methods
    public static int summation(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double summation(double a, double b) {
        double sum = a + b;
        return sum;
    }


//    Multiplication methods
    int multiplication(int a, int b, int c) {
        return a * b * c;
    }

    int multiplication(int a) {
        return a *= a;
    }


    //    Division methods
    public static double division (double c, double d) {
        return c / d;
    }

    public static double division (double c) {
        return c /= c;
    }

    public static double division (double c, double b, double d) {
        double dev = b / (c / d);
        return dev;
    }
}
