-- NVL (NULL 값을 대체해서 출력해주는 함수)
SELECT EMPNO, ENAME, SAL, NVL(COMM, 0) AS COMM
FROM EMP;

-- NVL2 (NULL 일 경우에는 3번째값 아닐경우는 2번째값으로 대체된다.)
SELECT EMPNO, ENAME, SAL, NVL2(COMM, 0, 1), COMM
FROM EMP;

-- DECODE(오라클에서만 사용하는 오라클 문법 - IF라 생각하면된다.)
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '사장')
FROM EMP;

-- IF ~ ELSE
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '사장', '사원')
FROM EMP;

-- IF ~ ELSE IF ~ ELSE
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '사장', 'MANAGER', '관리자', '사원') AS JOB
FROM EMP;

-- CASE ~ WHEN (공용으로 사용되는 IF)
SELECT EMPNO, ENAME,
    CASE JOB WHEN 'PRESIDENT' THEN '사장'
             WHEN 'MANAGER' THEN '관리자'
             ELSE '사원'
    END AS 직급
FROM EMP;

SELECT EMPNO, ENAME,
    CASE WHEN SAL > 3000 THEN '사장'
             WHEN SAL > 2000 THEN '적당히'
             ELSE '화이팅'
    END AS 직급
FROM EMP;

-- SYSDATE (서버 기준 시간) => 저장시에는 시간도 같이 저장된다. 출력시에는 날짜만 나온다.
-- MYSQL => NOW
-- (Y 연 M 월 D 일 H시 MI분 S초) H뒤에 24를 붙여줘야 24시기준으로 표시 없으면 13 -> 1로 출력된다.
SELECT 
    SYSDATE,
    TO_CHAR(SYSDATE, 'YYMMDD') AS CASE1,
    TO_CHAR(SYSDATE, 'YYYYMMDD') AS CASE2,
    TO_CHAR(SYSDATE, 'YY-MM-DD') AS CASE3,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS CASE4,
    TO_CHAR(SYSDATE, 'YY-MM-DD HH:MI:SS') AS CASE5,
    TO_CHAR(SYSDATE, 'YY-MM-DD HH24:MI:SS') AS CASE6
FROM DUAL;

