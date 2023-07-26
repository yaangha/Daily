public class Main {
    public static void main(String[] args) {
        String a = "1234";
        String b = "5678";

        Integer total = 0;

        total = Integer.valueOf(a) + Integer.valueOf(b);

        System.out.println("total = " + total);
    }
}