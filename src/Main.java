public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 4!");
        System.out.println(" ");
        enumerate_while();
        System.out.println(" ");
        enumerate_for();
        System.out.println(" ");
        enumerate_even();
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