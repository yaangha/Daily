## Stack 클래스

* 쌓는다는 의미의 자료구조로 **LIFO(Last In First Out)** 형태를 가진다.
* 먼저 들어간 자료가 제일 마지막에 나온다. (= 마지막에 들어간 자료가 먼저 나온다.)

### Import
```
import java.util.Stack;
```

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
    }
}
```

### Method
### push(E item)
* Stack에 원소를 추가할 때 사용한다.
* Stack은 밑에서부터 위로 쌓는 개념으로, 먼저 들어가는 원소가 밑에 깔리게 된다.
* argument를 반환한다.

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        int firstItem = stk.push(1);

        // firstItem = 1
        // -> push 한 값을 반환
        System.out.println("firstItem = " + firstItem);
    }
}
```

### pop()
* Stack의 마지막 원소를 반환하고, 해당 원소를 제거한다.

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        // pop -> 현재 스택에 저장되어있는 원소 중 마지막 원소를 반환하고 제거함
        // pop() -> peek() 해보면 마지막 원소가 제거되어있음을 확인할 수 있음
        int lastItemAndRemove = stk.pop();
        int lastItem = stk.peek();
        System.out.println("lastItemAndRemove = " + lastItemAndRemove);
        // lastItemAndRemove = 5
        System.out.println("lastItem = " + lastItem);
        // lastItem = 4
    }
}
```

### peek()
* Stack의 마지막 원소를 꺼내고자 할 때 사용한다.

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        // peek() -> 마지막 원소를 꺼냄
        int lastItem = stk.peek();
        System.out.println("lastItem = " + lastItem);
        // lastItem = 5
    }
}
```

### clear()
* Stack의 값을 모두 제거하고자 할 때 사용

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        
        // empty() -> 스택이 비어있으면 true, 그렇지 않으면 false 반환
        boolean bool_1 = stk.empty();
        
        // clear() -> 스택의 값을 모두 제거함
        stk.clear();
        boolean bool_2 = stk.empty();
        System.out.println("bool_1 = " + bool_1); // bool_1 = false
        System.out.println("bool_2 = " + bool_2); // bool_2 = true
    }
}
```