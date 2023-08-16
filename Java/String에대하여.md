## String 문자열에 대해..
* 기본 타입이 아니라 클래스임
* 객체로 생성됨

---
## 관련 Method
### replace()
* 기존 문자를 다른 문자로 바꾸고 싶을 때 사용
* 리턴 타입: String
* 사용법) str.replace(기존문자, 바꿀문자);

```java
public class Main {
    public static void main(String[] args) {
        String before = "abcd";
        String after = before.replace("a", "e");
        System.out.print(after); 
        // ebcd 출력
    }
}
```

### toUpperCase()
* 소문자를 대문자로 변환
* 리턴 타입: String
* 사용법) str.toUpperCase();

```java
public class Main {
    public static void main(String[] args) {
        String before = "abc";
        String after = before.toUpperCase();
        System.out.print(after);
        // ABC 출력
    }
}
```

### toLowerCase()
* 대문자를 소문자로 변환
* 리턴 타입: String
* 사용법) str.toLowerCase();

```java
public class Main {
    public static void main(String[] args) {
        String before = "ABC";
        String after = before.toLowerCase();
        System.out.print(after);
        // abc 출력
    }
}
```

### repeat()
* 문자열을 반복하고자 할 때 사용 
* String 타입 리턴

```java
public class Main {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.repeat(3));
        // hellohellohello 출력
    }
}
```