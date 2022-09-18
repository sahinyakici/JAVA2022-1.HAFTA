public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int willFind = 5;
        boolean find = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == willFind) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Sayi bulundu");
        } else {
            System.out.println("Sayi bulunamadi");
        }
    }
}