## Stream
* Java 8에서 추가된 것으로 람다를 사용할 수 있음
  * Java 8 이전에는 배열, 컬렉션을 다룰 때 for문 & for-each문을 사용했음
* 병렬처리(멀티 스레드)가 가능함
* 순서: (1) 스트림 생성 (2) 필터링 및 맵핑 (3) 결과 만들기

### 스트림 생성

```java
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream = Arrays.stream(arr);
    }
}
```

### filter
* 스트림 안에 요소들을 **걸러내는** 작업
* boolean을 리턴하는 평가식이 파라미터로 들어감 

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream1 = Arrays.stream(arr);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = list.stream();

        stream1.filter(s1 -> s1 % 2 == 0); // 식에 만족하는 짝수만 리턴
        stream2.filter(s2 -> s2 % 2 == 1); // 식에 만족하는 홀수만 리턴
    }
}
```

### map
* 스트림 안에 요소들을 특정 값으로 **변환**해줌
* 변환 후 새로운 스트림에 담기게 됨(=맵핑)

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "melon", "orange"};
        Stream<String> stream = Arrays.stream(fruits);

        stream.map(String::toUpperCase); // {"APPLE", "MELON", "ORANGE"}
    }
}
```

### sorted
* 정렬할 때 사용 

```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "melon", "orange"};
        Stream<String> stream = Arrays.stream(fruits);

        stream.sorted(); // 오름차순
        stream.sorted(Comparator.reverseOrder()); // 내림차순   
    }
}
```

### 결과
* 사용할 결과값으로 만드는 최종 단계
* 