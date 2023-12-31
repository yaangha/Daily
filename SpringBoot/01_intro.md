# INTRO...

###### 책 [누구나 끝까지 따라 할 수 있는 스프링부터 _ 저자 채규태] 공부 기록

- 스프링 프레임워크는 다른 프레임워크와의 통햡을 지향한다. 때문에 쉽게 연동을 할 수 있다. 
- EJB(Enterprise Java Beans)라는 무겁고 복잡한 플랫폼이 아닌 **POJO(Plain Old Java Object)를 기반으로 하는 경량의 환경을 제공**한다.
- 복잡한 설정을 해결하고자 스프링 부트가 생겨났다. 
- 스프링 부트로 프로젝트를 생상하면 어떤 라이브러리도 개발자가 신경 쓸 필요가 없다. 
- 스프링 컨테이너를 위한 **XML 환경설정 파일을 작성하지 않**으며, 이는 부트가 **기본적으로 모든 빈(Bean) 설정을 어노테이션으로 처리**하기 때문이다. 

## Spring Boot의 장점
### 1. 라이브러리 관리 자동화
기존에도 메이븐이나 그레이들을 이용해 라이브러리 의존성을 관리해왔지만, 스프링 부트에서는 **스타터(starter)**를 이용해 **특정 기능에 필요한 라이브러리 의존성을 더욱 간단히 처리**할 수 있다.

### 2. 설정의 자동화
프로젝트에 추가된 라이브러리를 기반으로 **실행에 필요한 환경을 자동으로 설정**해준다. 

### 3. 라이브러리 버전 자동 관리
스프링 부트를 이용하면 스프링 부트 버전에 해당하는 스프링 라이브러리 뿐 아니라 서드파티 라이브러리들도 **호환되는 버전으로 다운로드** 해준다. (그럼 버전의 차이 때문에 정상적으로 동작하지 않는 상황 X)

### 4. 테스트 환경과 내장 톰캣
**JUnit을 비롯한 테스트 관련 라이브러리들이 기본적으로 포함**이 되어 있어 다양한 계층 클래스들에 대해서 쉽게 테스트 케이스를 작성할 수 있다.

**톰캣 서버를 내장**하고 있어서 단지 main() 메소드를 가진 클래스를 실행하는 방식으로 서버를 구동하기 때문에 빠르게 실행 결과를 볼 수 있다. 

### 5. 독립적으로 실행 가능한 JAR
서버에 배포하기 위해서는 패키징으로 해야 하는데, 일반 자바 프로젝트라면 JAR 파일로 패키징하면 되지만 웹 프로젝트일 경우 WAR 파일로 패키징을 해야 한다. 스프링 부트는 독립적으로 실행 가능한 애플리케이션으로 빠르게 개발하는 목표를 가지고 있기 때문에 웹 애플리케이션도 **JAR 파일로 패키징하여 사용**할 수 있다. 


## 환경 설정
* 스프링 부트 2.0 이상에서는 반드시 Java 8 이상을 사용해야 함.
* JDK 설치 후 환경 변수 설정해 줘야 함.
* 이클립스에서 스프링을 사용하려면 스프링 전용 개발 도구인 STS(Spring Tool Suite)를 추가해 줘야 함.
* 자바 소스보다 application.properties 설정이 우선순위가 높음.

### 기본 배너 감추기
* application.setBannerMode(Banner.Mode.OFF)를 적어주면 배너가 출력되지 않는다. 
* 직접 만든 배너를 사용하고 싶다면 src/main/resource 폴더에 banner.txt 이름으로 작성하면 된다. (그때는 위의 코드를 사용하면 안된다.)

```java
@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) {
        // 생략 ~~
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
```

### 서버 포트 변경하기
- application.properites 파일에 아래와 같이 적어준다.
- 포트 번호를 0으로 설정하면 현재 사용되지 않는 포트 번호가 랜덤으로 할당된다. 

```
server.port=8080 //-> 원하는 포트번호
```

## 컨트롤러 빈으로 등록하기
* @Controller 어노테이션으로 사용해도 되지만, 스프링 4부터 지원하는 @RestController를 사용해도 된다.
* @RestController를 사용하면 REST 방식의 응답을 처리하는 컨트롤러를 구현할 수 있다. (리턴되는 문자열이 그대로 브라우저에 출력되므로 별도로 View 화면을 만들 필요 X)
  * @Controller는 리턴 문자열에 해당하는 View를 만들어야 한다. 
* main() 메서드가 있는 Application 클래스에 있는 @SpringBootApplication 어노테이션이 같은 패키지에 있는 클래스들을 자동으로 빈 등록해준다. (패키지가 다르면 직접 Application에 등록해야 함)
  * @SpringBootApplication 어노테이션에 @ComponentScan이 들어있기 때문에!

```java
@RestController
public class SampleController {
    
}
```

## REST 컨트롤러 사용하기
* View를 만들지 않는 대신에 메소드가 리턴한 문자열을 그대로 클라이언트에 전달한다. 
  * 자바 객체일 경우에는 JSON으로 자동 변환된다. 

### 문자열을 리턴할 경우
리턴한 문자열 그대로 브라우저에 출력된다. 

### VO(Value Object)를 리턴할 경우
VO 객체를 JSON 데이터로 변환하여 출력한다. 

### 컬렉션을 리턴하는 경우
여러 객체를 리턴하는 경우(array, list, ...)에도 JSON으로 변환하여 출력한다. 

## 롬복 사용하기
자동으로 생성자, Getter, Setter, toString() 등 코드들을 추가해주는 라이브러리이다. 
* 롭복 제공 어노테이션
  * @Getter
  * @Setter
  * @RequiredArgsConstructor: 모든 멤버 변수를 초기화하는 생성자를 만들어 줌
  * @ToString
  * @EqualsAndHashCode: equals(), hashCode() 메소드를 만들어줌
  * @Date: @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 모두를 포함