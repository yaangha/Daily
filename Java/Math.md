## Math

* Math 클래스의 모든 메소드는 static method(정적 메소드)이기 때문에 import 없이 바로 사용할 수 있음

```java
import java.lang.Math;
```

### Math.pow(double a, double b) 
* power을 뜻하며 제곱하라는 의미
* double 타입을 리턴
* a를 b번 곱한 것(즉, a의 b승)

```java
public class Main {
    public static void main(String[] args) {
        double a = Math.pow(3, 2);
        System.out.println("a = " + a);
        // 9.0을 출력(리턴값이 double 타입이기 때문에)
    }
}
```

### Math.sqrt(double a)
* square root를 뜻하며 제곱근을 구하라는 의미
* double 타입을 리턴
* a의 제곱근을 구함

```java
public class Main {
    public static void main(String[] args) {
        double a = Math.sqrt(9);
        System.out.println("a = " + a);
        // 3.0을 출력(리턴값이 double 타입이기 때문에)
    }
}
```

### Math.floor(double a)
* 소수점 버리고자 할 때 사용
* 리턴값은 double(xxx.0 형태)

```java
public class Main {
    public static void main(String[] args) {
        double a = 3.14;
        double b = Math.floor(a);
        int c = (int) b;
        
        System.out.println("b = " + b); // 3.0
        System.out.println("c = " + c); // 3
    }
}
```

### Math.abs()
* 절대값을 구할 때 사용
* 파라미터는 int, long, float, double 가능
* 음수 -> 양수, 양수 -> 양수 

```java
public class Main {
    public static void main(String[] args) {
        int a = 123;
        int b = -123;

        int r1 = Math.abs(a);
        int r2 = Math.abs(b);

        System.out.println("r1 = " + r1); // r1 = 123
        System.out.println("r2 = " + r2); // r2 = 123
    }
}
```