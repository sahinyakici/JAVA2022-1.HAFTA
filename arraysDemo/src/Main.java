public class Main {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Şahin";
        students[1] = "Öznur";
        students[2] = "İlknur";
        /*
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }*/
        for (String student : students) {
            System.out.println(student);
        }
    }
}