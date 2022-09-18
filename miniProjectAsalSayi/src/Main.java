public class Main {
    public static void main(String[] args) {
        int number = -2;
        boolean isPrime = false;
        if (number == 1) {
            System.out.println(number + " sayisi asal degil");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayi");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " sayisi asal degil");

        } else {
            System.out.println(number + " sayisi asal");
        }
    }
}