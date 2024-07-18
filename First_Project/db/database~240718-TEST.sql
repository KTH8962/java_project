-- 1. 조건을 이용한 SELECT 조회
-- STUDENT 테이블에서 컴퓨터정보 학과(STU_DEPT) 학생들을 모두 출력하시오.
SELECT *
FROM STUDENT
WHERE STU_DEPT = '컴퓨터정보';

-- 2. DML 명령어
-- 2-1) EMP 테이블에 INSERT 구문을 이용하여 레코드 추가
-- (필수 컬럼 : EMPNO, ENAME, MGR, SAL)
-- 데이터는 임의의 값을 넣으면 되나, MGR의 경우 EMPNO와 MGR의 관계를 고려하여 값을 넣을 것.
-- 2-2) 2-1에서 만든 데이터의 SAL을 2000으로 변경
-- 2-3) 2-1에서 만든 데이터를 EMPNO를 조건으로 삭제
INSERT INTO EMP
VALUES(7980, 'SAM', 'SALESMAN', 7698, SYSDATE, 800, 10, 30);
UPDATE EMP
SET SAL = 2000
WHERE EMPNO = 7980;
DELETE FROM EMP WHERE EMPNO = 7980;

SELECT * FROM EMP;

 -- 3. 내장 함수 (PROFESSOR)
-- PROFESSOR 테이블의 EMAIL 컬럼을 아래 이미지와 같이 변환하여 출력하시오.
-- 함수를 포함한 어떠한 기능을 가져다 써도 상관없이 결과만 도출되면 됨.
SELECT 
    SUBSTR(LPAD(SUBSTR(EMAIL, INSTR(EMAIL,'@')), LENGTH(EMAIL), '*'), 1, INSTR(EMAIL,'@')) 
    || 
    LPAD(SUBSTR(EMAIL, INSTR(EMAIL, '.')), LENGTH(EMAIL) - INSTR(EMAIL, '@'), '*') SECRETEMAIL,
    EMAIL
FROM PROFESSOR;

-- 4. 그룹 함수 (STUDENT)
-- STUDENT테이블에서 컴퓨터정보 학과(STU_DEPT) 학생들의 수를 구하시오.
SELECT COUNT(*)
FROM STUDENT
WHERE STU_DEPT = '컴퓨터정보';

-- 5. 조인 - 2문제
-- ex) 5-1) 컴퓨터정보 학과에 속한 교수의 수업을 듣는 학생들의 목록을 출력하시오. (STUDENT, ENROL, SUBJECT)
SELECT *
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_DEPT = '컴퓨터정보';

-- ex) 5-2) EMP 테이블에 속한 사람들의 사번(EMPNO), 이름(ENAME), 급여등급을 출력하시오. (EMP, SALGRADE)
SELECT E.EMPNO, E.ENAME, S.GRADE
FROM EMP E
INNER JOIN SALGRADE S ON E.SAL >= S.LOSAL AND E.SAL <= S.HISAL;

SELECT * FROM SALGRADE;

-- 6. 셀프조인 (STU, DEPARTMENT)
-- ex) 전공(DEPTNO1)과 부전공(DEPTNO2)이 공과대학에 속하는 학생의 수를 구하시오.
SELECT COUNT(DISTINCT NAME) AS "학생 수"
FROM STU S
INNER JOIN DEPARTMENT D1 ON S.DEPTNO1 = D1.DEPTNO OR S.DEPTNO2 = D1.DEPTNO
INNER JOIN DEPARTMENT D2 ON D1.PART = D2.DEPTNO
INNER JOIN DEPARTMENT D3 ON D2.PART = D3.DEPTNO
WHERE D3.DNAME = '공과대학';

 -- 7. 학생들의 시험 평균 점수가 가장 높은 학생과 가장 낮은 학생의 차이를 구하시오
-- (STUDENT, ENROL)
SELECT MIN(AVG_GRADE) MIN, MAX(AVG_GRADE) MAX, (MAX(AVG_GRADE) - MIN(AVG_GRADE)) "MAX - MIN"
FROM (
    SELECT AVG(ENR_GRADE) AVG_GRADE
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY STU_NAME
);

-- 8. 2개의 수업을 들은 학생들의 평균점수와 1개의 수업을 들은 학생들의 평균점수의 차이를 구하시오.
-- (STUDENT, ENROL)
SELECT MAX(ONE) MAX , MIN(ONE) MIN, (MAX(ONE)-MIN(ONE)) "MAX - MIN"
FROM (
    SELECT AVG(SUM(ENR_GRADE)) ONE
    FROM ENROL
    GROUP BY STU_NO
    HAVING COUNT(STU_NO) = 1
    UNION ALL
    SELECT AVG(SUM(ENR_GRADE/2))
    FROM ENROL
    GROUP BY STU_NO
    HAVING COUNT(STU_NO) = 2
);






