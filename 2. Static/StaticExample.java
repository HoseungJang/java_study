public class StaticExample {
    static int number = 10;
    String str = "hello";

    private static int getNumber() {
        return number;
    }

    private String getStr() {
        return str;
    }

    public static void main(String[] args) {
        System.out.println(number); // 10
        // System.out.println(str); // error

        System.out.println(getNumber());
        // System.out.println(getStr()); // error
    }
}
