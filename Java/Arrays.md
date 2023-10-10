# Arrays

## Import
```java
import java.util.Arrays;
```

---

## Method
### Arrays.copyOf(원본 배열, 원본에서 복사할 길이)
* 배열을 복사할 때 사용한다.
* 새로운 배열을 생성한다.
* 원본 배열보다 길이를 크게 하면 0으로 채워진다.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = Arrays.copyOf(arr1, 3);

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        // [1, 2, 3]
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        // [1, 2, 3]

        int[] arr3 = Arrays.copyOf(arr1, 10);

        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        // [1, 2, 3, 0, 0, 0, 0, 0, 0, 0]
    }
}
```