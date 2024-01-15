import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 4.1 Processing character strings");

        secret_message();
    }

    static void secret_message(){
        String message = "000T000000000000000000000000000000o0000u00000000000j0o0000000u0000000000r00s0000\n" +
                "c00o0000d00000e000000000000r000000000000000000\n" +
                "00000c0000000000o000m00000000000000m0e000 000000000s00i0000000000 0l000e00000000\n" +
                "g000000000000a00000000000000000r0s0000\n" +
                "000000000000000000000000000q00000u0000000000000000000000000i00000000\n" +
                "000f000i0ni00000r0000000a 000p00000a00000r0000000000000000000000000000000\n" +
                "m00000000000000a000in0t000000e00n000000000i00r0000000000000000\n" +
                "00000000000v00000000000o0000000t00r0000000e000000000 0c000o00d000000000e000000000\n" +
                "00e0000000000000000000000000000000000s0t0000000000000000000 0000000000000u0n00000\n" +
                "0000000000000000000000000000000ps00000000y000000000000000000c0h0000000op00000a0t000\n" +
                "0h0e0\n" +
                "000000000000000v00000000000i00000000000000000000000000000000000000o0000l0000en00t\n" +
                "0000000q0u000000000i 00000000sa00000it00000 000où0000000000\n" +
                "000000v0000000o0000000000u000000000000000s000000000000000000\n" +
                "00000v00000000000000i00000000v0000000000000000000000000000e0000000000z0000000\n" +
                "00(000000c0i0000000000000000000ta0ti0o00000000n 000000d000000000000000000e00\n" +
                "00J000o00000000000000h0n00 0W00o000000000000o00000000000d0000000s0000000000)0.";

        System.out.println(decrypt(message));
    }

    static String decrypt(String message){
        return message.replace("0","");
    }

    static void array_to_show_in_upper_case(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");
        names.add("Irek");
        to_upper_case(names);
    }

    static void to_upper_case(ArrayList<String> names){
        for (String name : names){
            System.out.println(name.toUpperCase());
        }
    }

    static void letters_in_names_for_each(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");
        names.add("Irek");

        for (String name : names) {
            describe(name);
        }
    }

    static void describe(String name){
        if (name.length()>=4){
            System.out.println(name + " - " + name.length() + " letters");
        }
    }

    static void letters_in_names(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");
        names.add("Irek");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + names.get(i).length() + " letters");
        }
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