CREATE TABLE T_EMP (
 EMPNO       NUMBER  PRIMARY KEY,
 NAME        VARCHAR2(15) NOT NULL,
 BIRTHDAY    DATE,
 DEPTNO      VARCHAR2(12) NOT NULL,
 EMP_TYPE    VARCHAR2(16),
 TEL         VARCHAR2(20),
 HOBBY       VARCHAR2(30),
 PAY         NUMBER,
 POSITION    VARCHAR2(16),
 PEMPNO      NUMBER
);

INSERT INTO T_EMP VALUES (19900101,'나사장',TO_DATE('19640125','YYYYMMDD'),'0001','정규직','054)223-0001','음악감상',100000000,'대표이사',null);
INSERT INTO T_EMP VALUES (19960101,'전부장',TO_DATE('19730322','YYYYMMDD'),'1000','정규직','02)6255-8000','독서',72000000,'부장',19900101);
INSERT INTO T_EMP VALUES (19970201,'최일도',TO_DATE('19750415','YYYYMMDD'),'1000','정규직','02)6255-8005','운동',50000000,'과장',19960101);
INSERT INTO T_EMP VALUES (19930331,'백원만',TO_DATE('19760525','YYYYMMDD'),'1001','정규직','02)6255-8010','자전거타기',60000000,'차장',19960101);
INSERT INTO T_EMP VALUES (19950303,'천만득',TO_DATE('19730615','YYYYMMDD'),'1002','정규직','02)6255-8020','마라톤',56000000,'과장',19960101);
INSERT INTO T_EMP VALUES (19966102,'일지매',TO_DATE('19720705','YYYYMMDD'),'1003','정규직','052)223-4000','음악감상',75000000,'부장',19900101);
INSERT INTO T_EMP VALUES (19930402,'유관순',TO_DATE('19720815','YYYYMMDD'),'1004','정규직','042)998-7005','등산',51000000,'과장',19966102);
INSERT INTO T_EMP VALUES (19960303,'김문호',TO_DATE('19710925','YYYYMMDD'),'1005','정규직','031)564-3340','등산',35000000,'대리',19966102);
INSERT INTO T_EMP VALUES (19970112,'노정호',TO_DATE('19761105','YYYYMMDD'),'1006','정규직','054)223-4500','수영',68000000,'부장',19900101);
INSERT INTO T_EMP VALUES (19960212,'이윤나',TO_DATE('19721215','YYYYMMDD'),'1007','정규직','054)223-4600',null,49000000,'과장',19970112);
INSERT INTO T_EMP VALUES (20000101,'이태백',TO_DATE('19850125','YYYYMMDD'),'1008','계약직','051)123-4567','등산', 30000000,'',19960212);
INSERT INTO T_EMP VALUES (20000102,'김설악',TO_DATE('19830322','YYYYMMDD'),'1009','계약직','031)234-5678','낚시', 30000000,'',19960212);
INSERT INTO T_EMP VALUES (20000203,'최오대',TO_DATE('19820415','YYYYMMDD'),'1010','계약직','02)2345-6789','바둑', 30000000,'',19960212);
INSERT INTO T_EMP VALUES (20000334,'박지리',TO_DATE('19810525','YYYYMMDD'),'1011','계약직','053)456-7890','노래', 30000000,'',19960212);
INSERT INTO T_EMP VALUES (20000305,'정북악',TO_DATE('19800615','YYYYMMDD'),'1008','수습직','051)567-8901','독서', 22000000,'',19960212);
INSERT INTO T_EMP VALUES (20006106,'유도봉',TO_DATE('19800705','YYYYMMDD'),'1009','수습직','031)678-9012','술',   22000000,'',19960212);
INSERT INTO T_EMP VALUES (20000407,'윤주왕',TO_DATE('19800815','YYYYMMDD'),'1010','수습직','02)2789-0123','오락', 22000000,'',19960212);
INSERT INTO T_EMP VALUES (20000308,'강월악',TO_DATE('19800925','YYYYMMDD'),'1011','인턴직','053)890-1234','골프', 20000000,'',19960212);
INSERT INTO T_EMP VALUES (20000119,'장금강',TO_DATE('19801105','YYYYMMDD'),'1004','인턴직','042)901-2345','술',   20000000,'',19930402);
INSERT INTO T_EMP VALUES (20000210,'나한라',TO_DATE('19801215','YYYYMMDD'),'1005','인턴직','031)345-3456','독서', 20000000,'',19960303);
COMMIT;
ROLLBACK;


-- 검색 (테이블 데이터 검색)
SELECT *
FROM T_EMP; -- 전체검색

SELECT *
FROM T_EMP
WHERE HOBBY = '등산'; -- 조건

SELECT *
FROM T_EMP
WHERE HOBBY = '등산' AND EMP_TYPE = '정규직'; -- 조건

SELECT *
FROM T_EMP
WHERE PAY >= 35000000;

SELECT *
FROM T_EMP
WHERE DEPTNO = '1001' OR EMP_TYPE = '계약직';

SELECT *
FROM T_EMP
WHERE POSITION IS NOT NULL;

SELECT *
FROM T_EMP
WHERE POSITION IS NULL;

SELECT *
FROM T_EMP
WHERE PAY BETWEEN 2500000 AND 35000000;
--WHERE PAY >= 2500000 AND PAY <= 35000000;

SELECT *
FROM T_EMP
WHERE DEPTNO IN (1001, 1005); -- IN -> OR라 생각하면 된다.

-- 검색(SELECT),  내장 함수 (문자)
SELECT *
FROM DUAL; -- 빈 테이블(연습용이라 생각하면 된다.)

SELECT NAME 이름
FROM T_EMP; -- 별칭

SELECT NAME AS "이름 입니다"
FROM T_EMP; -- 별칭

SELECT UPPER('hello oracle') as TEST -- 대문자로 ()안에는 컬럼명이 들어간다.
FROM DUAL;
SELECT UPPER(STU_CLASS), STU_NAME FROM STUDENT; -- 컬러명 예시

SELECT LOWER('hello ORACLE') as TEST -- 소문자로 ()안에는 컬럼명이 들어간다.
FROM DUAL;

SELECT INITCAP('hello ORACLE') as TEST -- 첫글자 대문자
FROM DUAL;

SELECT CONCAT(NAME, EMP_TYPE)
FROM T_EMP; -- 컬럼 이어 붙이기

SELECT NAME || '의 계약형태는 ' || EMP_TYPE || '입니다.'
FROM T_EMP; -- 컬럼 이어 붙이기

SELECT EMPNO, SUBSTR(EMPNO, 4) AS SUBSTR, SUBSTR(EMPNO, 3, 4) AS SUBSTR
FROM T_EMP; -- 문자열 자르기

SELECT *
FROM T_EMP
WHERE SUBSTR(EMPNO, 1, 4) = 1996;

SELECT NAME, LENGTH(PAY)
FROM T_EMP;

SELECT TEL, INSTR(TEL, '-')
FROM T_EMP; -- 공백을 포함한 위치찾기

SELECT DEPTNO, LPAD(DEPTNO, 10, '*')
FROM T_EMP; -- 정해진 공간에 부족한곳 *채우기(왼쪽)

SELECT DEPTNO, RPAD(DEPTNO, 10, '*')
FROM T_EMP; -- 정해진 공간에 부족한곳 *채우기(오른쪽)

SELECT TRIM(' hello oracle     ') as TEST
FROM DUAL; -- 공백제거

SELECT REPLACE(TEL, '-', '*')
FROM T_EMP;

SELECT RPAD(SUBSTR(NAME, 1, 1), LENGTH(NAME) + 1, '*') AS 이름
FROM T_EMP;

SELECT LPAD(SUBSTR(TEL, INSTR(TEL, ')'), LENGTH(TEL)), LENGTH(TEL), '*') AS 전화번호
FROM T_EMP;

SELECT LPAD(SUBSTR(TEL, INSTR(TEL, ')')), LENGTH(TEL), '*') AS 전화번호
FROM T_EMP;

SELECT RPAD(SUBSTR(TEL, 1, INSTR(TEL, '-')), LENGTH(TEL), '*') AS 전화번호
FROM T_EMP;

-- 내장 함수 (숫자)
SELECT ROUND(123.456, 2) -- 2번째 자리 기준으로 반올림
FROM DUAL;

SELECT TRUNC(123.456, 2) -- 2번째 자리 기준으로 잘라내기
FROM DUAL;

SELECT CEIL(123.001) -- 정수 기준으로 올림
FROM DUAL;

SELECT FLOOR(123.999) -- 정수 기준으로 내림
FROM DUAL;

SELECT SQRT(16) -- 제곱근
FROM DUAL;

SELECT POWER(2,3) -- 제곱(2의 3제곱)
FROM DUAL;

SELECT ABS(-123) -- 절대 값
FROM DUAL;

SELECT SIGN(-123) -- 음수 일 때 -1, 양수 일 때 1, 0일 때 0 (양음0판독)
FROM DUAL;

SELECT MOD(10,3) -- 나머지 연산
FROM DUAL;

-- 유용한 함수 (그룹 함수)

-- 평균(AVG)
SELECT AVG(STU_HEIGHT)
FROM STUDENT;

-- 합(SUM)
SELECT SUM(PAY)
FROM T_EMP;

-- 최대 값(MAX)
SELECT MAX(PAY)
FROM T_EMP;

-- 최소 값(MIN)
SELECT MIN(PAY)
FROM T_EMP;





















