package com.shane.javauper.demos.alg;

public class AdditionMain {
    public static void main(String[] args) {
        int number = 10;
        long retone = AddiOne.run(number);
        long rettwo = AddiTwo.run(number);
        System.out.println(retone + "=" + rettwo);
    }

    public  static class AddiOne {
        public static long run(int n) {
            if(1 == n)
                return 1;

            return n +  run(n - 1);
        }
    }

    public static class AddiTwo {
        public static long run(int n) {
            return run(n, 0);
        }

        private static long run(int n, long sum) {
            if(1 == n)
                return sum;

            return run(n - 1, sum + n);
        }
    }
}
