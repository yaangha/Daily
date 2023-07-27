public class Main {
    public static void main(String[] args) {
        int num = 456;
        String result = "";

        if (num % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }

        System.out.println("result = " + result);

        result = (num % 2 == 0) ? "even" : "odd";
        System.out.println("result = " + result);
    }
}