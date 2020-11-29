# Static

static 메소드에서는 똑같이 static한 메소드, 변수만 사용할 수 있다.

```java
Person person1 = new Person();
Person person2 = new Person();

// static 변수 age
person1.age = 10;
person2.age = 20;

System.out.println(person1.age == person2.age); // true
```

static 변수의 값은 모든 인스턴스가 공유한다.
