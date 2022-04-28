public class Main {
    public static void main(String[] args) {


        int balance = 100;
        int replenishment = 1100;
        int min = 1000;
        boolean replenishes = true;


        int sum = balance + replenishment;
        int bonus = replenishment / 100;
        int percent = replenishes ? bonus : sum;
        int check = percent + sum;
        if (sum > min) {

        } else {
            check = sum;
        }

        System.out.println(check);

    }
}
