public class StringClassExample {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1 == str2); // true
        System.out.println(str3 == str4); // false
        System.out.println(str2 == str3); // false

        System.out.println(str3.equals(str4)); // true
        System.out.println(str4.equals(str3)); // true
    }
}
