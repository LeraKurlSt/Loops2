public class Task2 {
    public static void main(String[] args) {
        boolean Prime;
        for (int i = 2; i <= 1000000; i++){
            Prime = true;
            for (int j = 2; j <= i / j; j++){
                if ((i % j) == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime){
                System.out.println( i + " is prime number");
            }
        }
    }
}
