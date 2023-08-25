###### <SQL 첫걸음>(아사이 아츠시 지음) 공부 내용

### CASE 문
* 데이터를 변환할 때 사용

### 검색 CASE

```
CASE WHEN 조건식1 THEN 식1
    [WHEN 조건식2 THEN 식2...]
    [ELSE 식3]
END
```

* WHEN 절에 조건식을 적어야 함.
* 조건식: 참과 거짓을 반환함
  * 해당 조건을 만족하면 THEN 절에 있는 식이 처리됨
* 어떤 조건식도 만족하지 못하는 경우 ELSE 절의 식이 처리됨 -> ELSE 절이 생략되었을 경우에는 ELSE NULL로 간주됨

### 단순 CASE

```
CASE 식1
    WHEN 식2 THEN 식3
    [WHEN 식4 THEN 식5...]
    [ELSE 식6]
END
```

* 상세하게 적어야 하는 조건식이 아니라 비교할 **값**만 적으면 됨.
* 식1의 값이 식2와 같은지 비교하고, 참이면 식3 반환.
* 다를 경우 식4와 비교하여 같으면 식5 반환.
* 모두 일치하지 않을 경우 ELSE 절이 적용.

### CASE 사용시
* SELECT, ORDER BY 등 어디에서나 사용 가능
* ELSE 절은 생략하면 일치하는 값이 없을 때 NULL이 되기 때문에, 이외의 데이터가 들어올 수 있으므로 생략하지 않는 것이 좋음.
* NULL을 WHEN 절에서 검색하고 싶을 때는 단순 CASE가 아닌 검색 CASE를 사용해야 함.
  * 단순 CASE: WHEN NULL THEN '데이터 X' -> NULL은 비교 연산자(=)로 알 수 있는 것이 아니라 IS NULL로 확인해야 하기 떄문.
  * 검색 CASE: WHEN a IS NULL THEN '데이터 X' -> 이렇게 사용해야 함.

### NULL 값을 변환하고 싶을 떈?
#### COALESCE
* NULL 값을 0으로 반환하고 싶을 떈 COALESCE(a, 0)으로 처리하면 0으로 반환됨.
  * NULL이 아니면 지정된 인수의 값을 반환하고, NULL일 경우에 0으로 반환.
* 표준 SQL로 규정되어 있음.(Oracle에도 NVL 함수가 있지만 표준이 아니기 때문에 COALESCE를 사용하는 것이 좋음. )