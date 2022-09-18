public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int big = sayi1;
        if (big < sayi1) {
            big = sayi1;
        } else if (big < sayi2) {
            big = sayi2;
        } else if (big < sayi3) {
            big = sayi3;
        }
        System.out.println("En büyük : " + big);
    }
}