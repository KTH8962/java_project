-- 공과대학에 속하는 모든 학과 출력
SELECT D3.DNAME
FROM DEPARTMENT D1
INNER JOIN DEPARTMENT D2 ON D1.DEPTNO = D2.PART
INNER JOIN DEPARTMENT D3 ON D2.DEPTNO = D3.PART
WHERE D1.DEPTNO = 10;

SELECT D1.DNAME
FROM DEPARTMENT D1
INNER JOIN DEPARTMENT D2 ON D1.PART = D2.DEPTNO
INNER JOIN DEPARTMENT D3 ON D2.PART = D3.DEPTNO
WHERE D3.DNAME = '공과대학';

-- 공과대학에 속한(전공이 공과대학인) 학생의 목록을 출력하세요.
SELECT S.NAME, D3.DNAME, D2.DNAME, D1.DNAME
FROM STU S
INNER JOIN DEPARTMENT D1 ON S.DEPTNO1 = D1.DEPTNO
INNER JOIN DEPARTMENT D2 ON D1.PART = D2.DEPTNO
INNER JOIN DEPARTMENT D3 ON D2.PART = D3.DEPTNO
WHERE D3.DNAME = '공과대학';

SELECT S.NAME, D1.* -- D1.* => D1에대한 모든 테이블 출력
FROM STU S
INNER JOIN DEPARTMENT D1 ON S.DEPTNO1 = D1.DEPTNO;

-- 인문대학에 속한 교수의 수를 구하시오
SELECT COUNT(D3.DNAME)
FROM PROFESSOR P
INNER JOIN DEPARTMENT D1 ON P.DEPTNO = D1.DEPTNO
INNER JOIN DEPARTMENT D2 ON D1.PART = D2.DEPTNO
INNER JOIN DEPARTMENT D3 ON D2.PART = D3.DEPTNO
WHERE D3.DNAME = '인문대학';

-- JUMIN 컬럼을 이용해서 남자 OR 여자 인지 판별
SELECT NAME, JUMIN,
    CASE WHEN SUBSTR(JUMIN, 7, 1) IN (1,3) THEN '남자'
         ELSE '여자'
    END 성별
FROM STU;

SELECT NAME, JUMIN, DECODE (SUBSTR(JUMIN, 7, 1), '1', '남자', '2', '여자')
FROM STU;

-- 1. 교수 번호가 1003번인 사람의 학과에 속한 학생들의 학번, 이름, 학년 출력
SELECT S.STUNO, S.NAME, S.GRADE
FROM PROFESSOR P
INNER JOIN STU S ON P.DEPTNO = S.DEPTNO1
WHERE P.PROFNO = '1003';

SELECT *
FROM STU;

-- 2. PROFESSOR 테이블에서 400이상의 급여를 받으면 A, 
--		300~400 사이면 B, 나머지는 C로 출력
SELECT P.*, NAME,
    CASE WHEN PAY >= 400 THEN 'A'
         WHEN PAY >= 300 THEN 'B'
         ELSE 'C'
    END AS 연봉듭급
FROM PROFESSOR P;

SELECT NAME,
    CASE WHEN PAY >= 400 THEN 'A'
         WHEN PAY BETWEEN 300 AND 400 THEN 'B'
         ELSE 'C'
    END 연봉듭급
FROM PROFESSOR;

-- 3. PROFESSOR 테이블에서 id의 앞에 3글자를 *로 표기(이미지 카페 참고)
SELECT NAME, LPAD(SUBSTR(ID, 4), LENGTH(ID), '*') AS ID
FROM PROFESSOR;

-- 4. PROFESSOR 테이블에서 직급(POSITION)별 
--		가장 큰 급여를 받는 사람의 이름, 급여, 직급 출력
SELECT NAME, P.POSITION, P.PAY
FROM PROFESSOR P
INNER JOIN (
    SELECT MAX(PAY) AS MAX_PAY, POSITION
    FROM PROFESSOR
    GROUP BY POSITION
) M ON P.PAY = M.MAX_PAY AND P.POSITION = M.POSITION;

-- 5. 학생들이 가장 많이 태어난 달 찾기(2개 이상이 같은 경우 레코드 2개 출력)
SELECT TO_CHAR(BIRTHDAY, 'MM') AS MONTH, COUNT(*) AS CNT
FROM STU
GROUP BY TO_CHAR(BIRTHDAY, 'MM')
HAVING COUNT(*) >= (
    SELECT MAX(COUNT(TO_CHAR(BIRTHDAY, 'MM')))
    FROM STU
    GROUP BY TO_CHAR(BIRTHDAY, 'MM')
);

SELECT MAX(CNT)
FROM (
    SELECT 
    SUBSTR(JUMIN, 3, 2) AS BITH, 
    COUNT(SUBSTR(JUMIN, 3, 2)) AS CNT
    FROM STU
    GROUP BY SUBSTR(JUMIN, 3, 2)
);

SELECT SUBSTR(JUMIN, 3, 2) AS BITH, COUNT(SUBSTR(JUMIN, 3, 2)) AS CNT
FROM STU
GROUP BY SUBSTR(JUMIN, 3, 2)
ORDER BY CNT DESC;


SELECT * FROM PROFESSOR;
SELECT * FROM STU;
SELECT * FROM DEPARTMENT;






