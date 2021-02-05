public class EnumExample {
    public static void main(String[] args) {
        Gender gender1 = Gender.MALE;
        Gender gender2 = Gender.FEMALE;

        // gender1 = "MAN"; // error

        System.out.println(gender1); // MALE
        System.out.println(gender2); // FEMALE

        System.out.println(gender1.getName()); // 철수
        System.out.println(gender2.getName()); // 영희
    }
}

enum Gender {
    MALE("철수"), FEMALE("영희");

    private final String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
