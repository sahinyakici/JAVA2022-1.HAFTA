public class Main {
    public static void main(String[] args) {
        int number = 6, total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " sayisi mukemmel sayi");
        } else {
            System.out.println(number + " sayisi mukemmel sayi degil");
        }
    }
}