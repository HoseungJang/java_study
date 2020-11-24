# String Class

```java
String a = "hello";
String b = "hello";

String c = new String("hello");
```

위 코드에서 a, b는 같은 레퍼런스를 참조한다. 하지만 c와는 다른 레퍼런스를 참조한다.

new String()을 통해 새로운 인스턴스를 생성해 주는 것이 아니라 리터럴을 사용해서 문자열을 할당하는 경우, string constant pool 이라는 영역을 사용하게 되는데, 이 때 값이 동일하면 같은 레퍼런스를 참조하게 된다.

```java
String a = new String("hello");
String b = new String("hello");

a.equals(b); // true
b.equals(a); // true
```

객체의 레퍼런스가 아니라 string의 값 자체를 비교하고 싶다면 equals 메소드를 사용할 수 있다.