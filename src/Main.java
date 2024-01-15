public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 2.2!");
        int n = 16;
        smallest_square_super(n);
        smallest_square_inferior(n);
    }

    static void smallest_square_super(int n){
        double square_root = Math.floor(Math.sqrt(n));
        int result = (int) Math.pow(square_root + 1, 2);
        System.out.println("Smallest square superior to " + n + ":");
        System.out.println( result );
    }
    static void smallest_square_inferior(int n){
        double square_root = Math.floor(Math.sqrt(n));
        int result = (int) Math.pow(square_root, 2);
        if (result == n){
            result = (int) Math.pow(square_root -1 , 2);
        }
        System.out.println("Smallest square inferior to " + n + ":");
        System.out.println( result );
    }

    static void enumerate_while(){
        System.out.println("while:");
        int i = 1;
        while (i<=100){
            System.out.print(i + ", ");
            if (i % 10 == 0){
                System.out.println(" ");
            }
            i++;
        }
    }
    static void enumerate_for(){
        System.out.println("for:");
        for (int j = 1; j <=100 ; j++) {
            System.out.print(j + ", ");
            if (j % 10 == 0){
                System.out.println(" ");
            }
        }
    }
    static void enumerate_even(){
        System.out.println("Even numbers between 0 and 100 for j++");
        for (int j = 0; j <=100 ; j++) {
            if (j % 2 == 0) {
                System.out.print(j + ", ");
            }
            if (j>0 && j % 20 == 0){
                System.out.println(" ");
            }
        }

        System.out.println(" ");

        System.out.println("Even numbers between 0 and 100 for j+=2");
        for (int j = 0; j <=100 ; j+=2) {
            System.out.print(j + ", ");
            if (j>0 && j % 20 == 0){
                System.out.println(" ");
            }
        }
    }
}