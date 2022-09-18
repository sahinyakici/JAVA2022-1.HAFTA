public class Main {
    public static void main(String[] args) {

        //For
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        System.out.println("For döngüsü bitti");
        //while
        int i = 0;
        while (i < 10) {
            System.out.println(i + 1);
            i++;
        }
        System.out.println("While döngüsü bitti");

        //Do while
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do while döngüsü bitti");
    }
}