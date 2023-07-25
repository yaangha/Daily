public class Main {
    public static void main(String[] args) {
        String str = "apple";

        char[] a = str.toCharArray();

        for (char b : a) {
            System.out.println(b);
        }

        String exam = new String(a);
        System.out.println(exam);
    }
}