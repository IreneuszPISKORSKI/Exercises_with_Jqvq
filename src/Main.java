public class Main {
    public static void main(String[] args) {

        System.out.println("Ex 3!");

        System.out.println("Even numbers between 0 and 100");
        for (int j = 0; j <=100 ; j++) {
            if (j % 2 == 0) {
                System.out.print(j + ", ");
            }
            if (j>0 && j % 20 == 0){
                System.out.println(" ");
            }
        }

        System.out.println("Even numbers between 0 and 100 for j+=2");
        for (int j = 0; j <=100 ; j+=2) {
            System.out.print(j + ", ");
            if (j>0 && j % 20 == 0){
                System.out.println(" ");
            }
        }
    }
}