public class Main {
    public static void main(String[] args) {
        String[][] citys = new String[3][3];
        citys[0][0] = "İstanbul";
        citys[0][1] = "Ankara";
        citys[0][2] = "Bolu";
        citys[1][0] = "Düzce";
        citys[1][1] = "Yozgat";
        citys[1][2] = "Kars";
        citys[2][0] = "Sivas";
        citys[2][1] = "Kastamonu";
        citys[2][2] = "Antalya";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(citys[i][j]);
            }
            System.out.println("------------------------------------");
        }
    }
}