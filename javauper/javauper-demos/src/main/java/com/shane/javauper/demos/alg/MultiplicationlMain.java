package com.shane.javauper.demos.alg;

public class MultiplicationlMain {
    public static void main(String[] args) {
        int number = 10;
        long retone = MultiOne.run(number);
        long rettwo = MultiTwo.run(number);
        System.out.println(retone + "=" + rettwo);
    }

    public  static class MultiOne {
        public static long run(int n) {
            if(1 == n)
                return 1;

            return n * run(n - 1);
        }
    }

    public static class MultiTwo {
        public static long run(int n) {
            return run(n, 1);
        }

        private static long run(int n, long sum) {
            if(1 == n)
                return sum;

            return run(n - 1, sum * n);
        }
    }
}
