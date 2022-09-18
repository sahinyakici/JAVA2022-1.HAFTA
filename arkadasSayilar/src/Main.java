public class Main {
    public static void main(String[] args) {
        //220-284
        int number1 = 220, number2 = 285, total1 = 0, total2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                total2 += j;
            }
        }
        if (number1 == total2 && total1 == number2) {
            System.out.println(number1 + " ve " + number2 + " sayilari arkadastir");
        } else {
            System.out.println(number1 + " ve " + number2 + " sayilari arkadas degildir");
        }
    }
}