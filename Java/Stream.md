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

### boxed
* int와 같은 원시 타입의 stream을 클래스 타입(Integer..)으로 전환하기 위한 메소드

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        
        // int 타입 배열을 List로 변환하고자 할 때 boxed() 사용함
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
```

### 결과
* 사용할 결과값으로 만드는 최종 단계

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};

        // List
        List<Integer> list = Arrays.stream(arr1).boxed().collect(Collectors.toList());

        // Array
        int[] array = Arrays.stream(arr1).sorted().toArray();
    }
}
```
