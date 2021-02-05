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

        Car car1 = new Car();
        Car car2 = new Car();

        car1.wheelCount = 10;
        car2.wheelCount = 4;

        System.out.println(car1.wheelCount);
        System.out.println(car2.wheelCount);
        System.out.println(car1.wheelCount == car2.wheelCount);
    }
}
