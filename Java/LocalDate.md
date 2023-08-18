## LocalDate
* java 8 이상 사용 가능
* 날짜 정보가 필요할 때 
* import java.time.LocalDate 필요

### LocalDate.now()
* 현재 날짜를 출력
* 리턴 타입: LocalDate

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        System.out.println("current = " + current);
        // current = 2023-08-18 출력
    }
}
```

### LocalDate.of(int year, int month, int date)
* 파라미터로 넘긴 지정 날짜를 출력 
* 리턴 타입: LocalDate

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate target = LocalDate.of(2023, 8, 18);
        System.out.println("target = " + target);
        // target = 2023-08-18 출력
    }
}
```