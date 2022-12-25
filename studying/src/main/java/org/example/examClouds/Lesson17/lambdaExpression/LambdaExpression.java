package org.example.examClouds.Lesson17.lambdaExpression;

public class LambdaExpression {
    @FunctionalInterface
    public interface iSum {
        public int sum(int a, int b);
    }

    @FunctionalInterface
    public interface ISqrt {
        public double sqrt(double x);
    }


    public static void main(String[] args) {
        iSum sum = new iSum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        //f(x1, x2) = a * x1 + b * x2
        iSum sum2 = (a, b) -> a + b;
        iSum sum3 = (int a, int b) -> {
            if (a == 0) return 0;
            return a + b;
        };
        ISqrt sqrt = x -> Math.sqrt(x);
        ISqrt sqrt1 = Math::sqrt;
        sqrt1.sqrt(4);
        System.out.println(sqrt1);
    }
}
