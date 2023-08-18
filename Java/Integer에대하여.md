## Integer

### Integer.compare(int x, int y)
* 두 정수를 비교하는 메서드이며 리턴값은 아래와 같다.
```
public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
```

* 둘 중에 큰 값을 리턴하는 것이 아니라, x가 크면 1, y가 크면 -1, 같으면 0을 리턴한다.

```java
public class Main {
    public static void main(String[] args) {
        int answer1 = Integer.compare(3, 3);
        System.out.println("answer1 = " + answer1);
        // 0

        int answer2 = Integer.compare(1, 2);
        System.out.println("answer2 = " + answer2);
        // -1

        int answer3 = Integer.compare(2, 1);
        System.out.println("answer3 = " + answer3);
        // 1
    }
}
```
