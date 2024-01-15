public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int i = 1;
        while (i<=100){
            System.out.print(i + ", ");
            if (i % 10 == 0){
                System.out.println(" ");
            }
            i++;
        }
    }
}