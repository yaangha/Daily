## Character

### isLowerCase(char ch) 메서드
* char 타입이 저장된 ch가 **소문자**인지 확인해줌
* boolean을 리턴(소문자:true, 대문자:false)
* 사용법) Character.isLowerCase(ch);


### isUpperCase(char ch) 메서드
* char 타입이 저장된 ch가 **대문자**인지 확인해줌
* boolean을 리턴(소문자:false, 대문자:true)
* 사용법) Character.isUpperCase(ch);

```java
public class Main {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'A';

        boolean ch1T = Character.isLowerCase(ch1);
        boolean ch1F = Character.isLowerCase(ch2);

        boolean ch2T = Character.isUpperCase(ch2);
        boolean ch2F = Character.isUpperCase(ch1);

        System.out.println("ch1T = " + ch1T); // true
        System.out.println("ch1F = " + ch1F); // false
        System.out.println("ch2T = " + ch2T); // true
        System.out.println("ch2F = " + ch2F); // false
    }
}
```

* String에서 charAt()을 통한 리턴값에도 사용가능함

```java
public class Main {
    public static void main(String[] args) {
        String a = "aPplE";
        char ch = a.charAt(0); // charAt(int index) => char 타입을 리턴

        if (Character.isLowerCase(ch)) {
            System.out.println("ch: " + ch);
        } else {
            System.out.println("ch: " + ch);
        }
    }
}
```
