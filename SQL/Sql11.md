###### <SQL 첫걸음>(아사이 아츠시 지음) 공부 내용

### LIMIT
* 표준 SQL이 아니며, **MySQL & PostgreSQL에서만 사용 가능**한 문법
* SELECT 명령에서 반환된 행들을 제한할 때 사용
* SELECT 명령 제일 마지막에 작성
* WHERE 조건 -> ORDER BY 정렬 -> 마지막으로 LIMIT 행 반환

```
SELECT 열명 FROM 테이블명 LIMIT 행수 [OFFSET 시작행]
```

* LIMIT은 최대 행수를 의미함(기존 5행, LIMIT 8 -> 5행 반환)

### 다른 데이터베이스에서 LIMIT과 같은 기능을 사용하려면?
* 똑같은 기능이 아니라 비슷한 기능임..
* Oracle 같은 경우 WHERE 구로 지정하는 것임. 즉, 조건식에서 먼저 행수를 지정하는 것(LIMIT은 조건, 정렬하고 나서 행수 지정)
#### SQL Server
* TOP

```
SELECT TOP 5 * FROM test;
```

#### Oracle
* ROWNUM

```
SELECT * FROM test WHERE ROWNUM <= 5;
```

### OFFSET
* 페이지 나누기 기능 구현할 때 사용
* 첫 페이지에서 1 ~ 5까지 표시했다면, 다음 페이지에서는 6 ~ 11 표시 -> 이때 LIMIT 5, OFFSET 5 임
  * OFFSET은 [표시할 페이지 - 1]이라고 생각하면 됨

```
SELECT 열명 FROM 테이블명 LIMIT 행수 [OFFSET 시작행]
```
