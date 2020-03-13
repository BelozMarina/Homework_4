package homework4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Subtraction methods");
        MethodMath methodMath = new MethodMath();
        System.out.println(methodMath.subtraction(10, 3));
        System.out.println(methodMath.subtraction(34, 23, 30));
        System.out.println();


        System.out.println("Summation methods");
        int sum = MethodMath.summation(109, 34);
        System.out.println(sum);
        System.out.println(MethodMath.summation(23.5, 36.7));
        System.out.println();


        MethodMath methodMath1 = new MethodMath();
        System.out.println("Multiplication methods");
        System.out.println(methodMath1.multiplication(23, 45, 905));
        System.out.println(methodMath1.multiplication(34));
        System.out.println();

        System.out.println("Division methods");
        System.out.println(MethodMath.division(124.78, 65.46));
        System.out.println(MethodMath.division(45.67));
        double div = MethodMath.division(78, 45, 1.2);
        System.out.println(div);

    }



}
