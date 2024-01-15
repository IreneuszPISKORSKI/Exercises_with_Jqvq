public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 3. Fibonacci pt 2!");
        double approx = 0.0000002;
        approximation_fibo((float) approx);
    }

    static void approximation_fibo(float approx) {
        System.out.println(approx);
        int fibo_one = 3;
        int fibo_two = 5;
        double fibo = (1 + Math.sqrt(5)) / 2;
        float res = (float)fibo_two / fibo_one;

        while (Math.abs(res - (float)fibo ) > approx) {
            int temp = fibo_two;
            fibo_two = fibo_two + fibo_one;
            fibo_one = temp;
            res = (float)fibo_two / fibo_one;
        }
        System.out.println("Res 1: " + fibo_one + ", Res 2: " + fibo_two);
        System.out.println("Error: " + Math.abs(res - (float)fibo ));
    }

    static void fibonacci(int n) {
        int[] fibo_start = {0, 1};
        int[] new_fibo = new int[n + 1];
        for (int k = 0; k < 2; k++) {
            if ((k == 0 && n > 0) || (k == 1 && n > 1)) {
                new_fibo[k] = fibo_start[k];
            }
        }
        for (int i = 2; i < n; i++) {
            int new_int = new_fibo[i - 2] + new_fibo[i - 1];
            new_fibo = add_int_to_array(i, new_fibo, new_int);
        }
        System.out.println("Fibonacci sequence:");
        for (int j = 0; j < new_fibo.length; j++) {
            System.out.println("Position: " + j + ", value: " + new_fibo[j]);
        }
    }

    public static int[] add_int_to_array(int n, int[] old_arr, int add_int) {
        int[] new_arr = new int[n + 1];
        System.arraycopy(old_arr, 0, new_arr, 0, n);
//        for (int i = 0; i < n; i++) {
//            new_arr[i] = old_arr[i];
//        }
        new_arr[n] = add_int;
        return new_arr;
    }

    static void smallest_square_super(int n) {
        double square_root = Math.floor(Math.sqrt(n));
        int result = (int) Math.pow(square_root + 1, 2);
        System.out.println("Smallest square superior to " + n + ":");
        System.out.println(result);
    }

    static void smallest_square_inferior(int n) {
        double square_root = Math.ceil(Math.sqrt(n));
        int result = (int) Math.pow(square_root - 1, 2);
        System.out.println("Smallest square inferior to " + n + ":");
        System.out.println(result);
    }

    static void enumerate_while() {
        System.out.println("while:");
        int i = 1;
        while (i <= 100) {
            System.out.print(i + ", ");
            if (i % 10 == 0) {
                System.out.println(" ");
            }
            i++;
        }
    }

    static void enumerate_for() {
        System.out.println("for:");
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + ", ");
            if (j % 10 == 0) {
                System.out.println(" ");
            }
        }
    }

    static void enumerate_even() {
        System.out.println("Even numbers between 0 and 100 for j++");
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + ", ");
            }
            if (j > 0 && j % 20 == 0) {
                System.out.println(" ");
            }
        }

        System.out.println(" ");

        System.out.println("Even numbers between 0 and 100 for j+=2");
        for (int j = 0; j <= 100; j += 2) {
            System.out.print(j + ", ");
            if (j > 0 && j % 20 == 0) {
                System.out.println(" ");
            }
        }
    }
}