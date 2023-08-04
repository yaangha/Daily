## StringBuilder

* 코딩테스트를 풀다가 문자열을 합쳐야할 때 사용했던 StringBuilder! 단순하게 효율적이라는 이유로만 사용했는데 다양한 메소드가 있어서 정리를 한 번 해보고자 한다..
* String은 String Pool에 저장되고, StringBuilder는 String Pool 외부 영역에 저장된다고 한다.. 
* a라는 문자열에 계속에서 문자열을 추가한다고 했을 때, 처음 String a는 String Pool에 생성된다.
* 이후에 문자열이 추가되면 String Pool 외부의 힙(Heap) 영역에 새로운 객체가 계속 생기는 것이다.(이것은 메모리 낭비라고 함, GC가 열심히 일해야 한다!)
* 하지만 StringBuilder를 사용하면 애초부터 String Pool 외부 영역에 생성되기 때문에 메모리 낭비도 없고 훨씬 효율적이다. (그래서 append() 메서드를 쓰는걸까..?)

### 변수 선언할 때
* new를 통해 객체를 생성해주고, 파라미터에 바로 문자열을 넣을수도 있다.

```
StringBuilder sb1 = new StringBuilder();
StringBuilder sb2 = new StringBuilder("apple");
```


### 메서드
### append()
* 문자열을 추가할 때 사용한다.
* String 객체에 문자열을 추가하면 계속해서 새로운 객체가 생성되는데, StringBuilder를 사용하면 하나의 변수에 계속해서 추가가 가능하다.

```java
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 5; i++) {
            sb.append("a");
        }

        System.out.println("sb = " + sb); // aaaaa 출력
    }
}
```

### toString()
* StringBuilder를 String으로 변환하고 싶을 때 사용한다.

```java
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 5; i++) {
            sb.append("a");
        }
        
        String result = sb.toString();
    }
}
```

### reverse()
* 문자열을 뒤집고 싶을 때 사용한다.

```java
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("apple");
        System.out.println("sb.reverse() = " + sb.reverse()); // elppa 출력
    }
}
```

### insert()
* 특정 인덱스에 문자열을 추가하고 싶을 때 사용한다.
* insert(int index, String str) -> 두 번째 파라미터에는 int 타입도 올 수 있다.
* index에 str이 들어간다.

```java
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("apple");
        sb.insert(2, "test");
        System.out.println("sb = " + sb); // aptest 출력
    }
}
```