public class Main {
    public static void main(String[] args) {
        String str = "012-345-678";
        String[] a = str.split("-");

        for (String b : a) {
            System.out.println("b = " + b);
        }
    }
}