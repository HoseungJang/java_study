# String Class

```java
String a = "hello";
String b = "hello";

String c = new String("hello");
```

위 코드에서 a, b는 같은 레퍼런스를 참조한다. 하지만 c와는 다른 레퍼런스를 참조한다.

new String()을 통해 새로운 인스턴스를 생성해 주는 것이 아니라 리터럴을 사용해서 문자열을 할당하는 경우, string constant pool 이라는 영역을 사용하게 되는데, 이 때 값이 동일하면 같은 레퍼런스를 참조하게 된다.