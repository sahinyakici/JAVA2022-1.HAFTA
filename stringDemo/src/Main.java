public class Main {
    public static void main(String[] args) {
        String message = "Today wheather is so good.";
        System.out.println(message);

        System.out.println("Number of elements : " + message.length());
        System.out.println("-------------------------------");
        System.out.println("5th element : " + message.charAt(4));
        System.out.println("-------------------------------");
        System.out.println(message.concat(" Hurrayy!"));
        System.out.println("-------------------------------");
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith(","));
        System.out.println("-------------------------------");
        char[] chars = new char[5];
        message.getChars(0, 5, chars, 0);
        for (char test : chars) {
            System.out.println(test);
        }
        System.out.println("-------------------------------");
        System.out.println(message.indexOf('w'));

        System.out.println("---------2rd video------------");
        System.out.println(message.replace(' ', '-'));
        System.out.println("-------------------------------");
        System.out.println(message.substring(2, 5));
        System.out.println("-------------------------------");
        for (String word : message.split(" ")) {
            System.out.println(word);
        }
        System.out.println("-------------------------------");
        System.out.println(message.toLowerCase());
        System.out.println("-------------------------------");
        System.out.println(message.trim()); //Başındaki ve sonundaki boşlukları siliyor
        System.out.println("-------------------------------");
    }
}