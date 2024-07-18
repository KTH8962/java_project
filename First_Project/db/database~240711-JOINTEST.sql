SELECT * 
FROM STUDENT
ORDER BY STU_HEIGHT; -- 디폴트 : 오름차순(ASC) - 생략가능, 내림차순(DESC)

SELECT * 
FROM STUDENT
ORDER BY STU_HEIGHT ASC;

SELECT * 
FROM STUDENT
ORDER BY STU_HEIGHT DESC, STU_WEIGHT DESC;

-- STUDENT, ENROL, SUBJECT
SELECT STU_NAME, ENR_GRADE
FROM STUDENT
INNER JOIN ENROL ON STUDENT.STU_NO = ENROL.STU_NO;

-- ANSI JOIN
SELECT S.STU_NO 학번, STU_NAME , ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;

-- ORACLE JOIN
SELECT S.STU_NO 학번, STU_NAME , ENR_GRADE
FROM STUDENT S, ENROL E
WHERE S.STU_NO = E.STU_NO;

-- ENROL 테이블 정보 출력할 때, 과목명을 같이 출력
SELECT E.SUB_NO, STU_NO, ENR_GRADE, SUB_NAME
FROM ENROL E
INNER JOIN SUBJECT S ON E.SUB_NO = S.SUB_NO;

-- 학생 이름, 점수 출력
SELECT STU_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;

-- 학생 이름, 과목명, 점수 출력
SELECT STU_NAME "학생 이름", SUB_NAME "과목 명", ENR_GRADE 점수
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT S2 ON E.SUB_NO = S2.SUB_NO
ORDER BY STU_NAME;

SELECT AVG(ENR_GRADE), STU_NO
FROM ENROL
GROUP BY STU_NO; -- GROUP BY로 조건을 줘서 개인별 평균점수 구함.

-- 과목별 평균 점수 (과목 번호, 평균 점수 출력)
SELECT SUB_NO "과목 번호", AVG(ENR_GRADE) "평균 점수"
FROM ENROL
GROUP BY SUB_NO;

-- 학생별 평균 점수 (학생이름, 학과, 평균점수 출력)
SELECT STU_NAME, STU_DEPT, AVG(ENR_GRADE)
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
GROUP BY STU_NAME, STU_DEPT;

-- 학생들의 전체 평균 점수보다 평균점수가 높은 학생들의 학번, 이름, 점수 출력
SELECT S.STU_NO, STU_NAME, AVG(ENR_GRADE)
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
GROUP BY S.STU_NO, STU_NAME;

SELECT AVG(ENR_GRADE) FROM STUDENT;

SELECT *
FROM (
    SELECT S.STU_NO, STU_NAME, AVG(ENR_GRADE) AS ENR_AVG
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, STU_NAME
) WHERE ENR_AVG > (SELECT AVG(ENR_GRADE) FROM ENROL);

-- 1. STUDENT 테이블에서 기계과 이면서 키가 170 이상인 학생 조회
SELECT *
FROM STUDENT
WHERE STU_DEPT = '기계' AND STU_HEIGHT >= 170;

-- 2. STUDENT 테이블에서 키가 165~175 사이인 학생 구하기(BETWEEN 사용하기)
SELECT *
FROM STUDENT
WHERE STU_HEIGHT BETWEEN 165 AND 175;

-- 3. 컴퓨터정보과 학생중 가장 키 큰 학생보다 큰 키를 가진 학생들 구하기
SELECT *
FROM STUDENT
WHERE STU_HEIGHT > (
    SELECT MAX(STU_HEIGHT)
    FROM STUDENT
    WHERE STU_DEPT = '컴퓨터정보'
);

-- 4. 학과별 가장 키가 큰 값(학과명, 키 출력)
SELECT STU_DEPT, MAX(STU_HEIGHT) AS "가장 큰 키"
FROM STUDENT
GROUP BY STU_DEPT;

-- 5. 컴퓨터개론 수업을 듣는 학생의 학번, 이름 출력
SELECT S.STU_NO, STU_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_NAME = '컴퓨터개론';

-- 6. 옥한빛의 평균 점수보다 높은 평균 점수를 받은 학생들의 이름, 평균 점수 출력
SELECT STU_NAME, ENR_AVG
FROM (
    SELECT STU_NAME, AVG(ENR_GRADE) AS ENR_AVG
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY STU_NAME, S.STU_NO
) WHERE ENR_AVG > (
                    SELECT AVG(ENR_GRADE)
                    FROM STUDENT S
                    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
                    WHERE STU_NAME = '옥한빛'
                    -- GROUP BY S.STU_NO
);

SELECT COUNT(*)
FROM ENROL; -- 레코드의 개수를 확인하는것

SELECT COUNT(*) AS CNT
FROM STUDENT
WHERE STU_DEPT = '컴퓨터정보';

-- 시험을 80점이상 맞은 사람의 수(중복 허용)
SELECT COUNT(*)
FROM ENROL
WHERE ENR_GRADE >= 80;

-- 시험을 80점이상 맞은 사람의 이름과 학번 출력
SELECT S.STU_NO, STU_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
WHERE ENR_GRADE >= 80;

-- 1. 김인중 학생이 들은 수업의 과목명과 교수 이름 출력
SELECT SUB_NAME, SUB_PROF
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE S.STU_NO = '20151062';

-- 2. 기계공작법, 기초전자실험 수업을 듣는 학생의 학번, 이름, 수업명 출력
SELECT S.STU_NO, STU_NAME, SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_NAME = '기계공작법' OR SUB_NAME = '기초전자실험';

SELECT S.STU_NO, STU_NAME, SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_NAME IN ('기계공작법', '기초전자실험');

-- 3. 여자이면서 구봉규 교수의 수업을 드는 학생의 학번, 이름, 학과, 수업명, 과목 점수 출력
SELECT S.STU_NO, STU_NAME, SUB_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE STU_GENDER = 'F' AND SUB_PROF = '구봉규';

-- 4. 김인중의 평균 점수보다 낮은 점수를 받은 학생들의 이름, 과목명, 점수 출력
SELECT STU_NAME, SUB_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE ENR_GRADE < (
                    SELECT AVG(ENR_GRADE)
                    FROM STUDENT S
                    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
                    WHERE S.STU_NO = '20151062'
                   );

-- 5. 2개 이상의 과목을 듣는 학생들의 목록 출력(과목명, 점수)
SELECT STU_NAME, SUB_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE S.STU_NO IN(
    SELECT STU_NO
    FROM (
            SELECT COUNT(*) AS COUNTING, STU_NO 
            FROM ENROL E
            GROUP BY E.STU_NO
    ) WHERE COUNTING >= 2
)
ORDER BY STU_NAME;


SELECT STU_NAME, SUB_NAME, SUB_PROF
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
INNER JOIN (
        SELECT COUNT(*) AS CNT, STU_NO 
        FROM ENROL
        GROUP BY STU_NO
) C ON S.STU_NO = C.STU_NO
WHERE CNT >= 2
ORDER BY STU_NAME;


-- 6. 전기전자과의 평균 점수보다 높은 점수를 받은 학생들의 목록 출력
SELECT *
FROM (
    SELECT S.STU_NAME, AVG(ENR_GRADE) AS AVG_GRADE
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, STU_NAME
) 
WHERE AVG_GRADE > (
                    SELECT AVG(ENR_GRADE)
                    FROM STUDENT S
                    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
                    WHERE STU_DEPT = '전기전자'
);


SELECT STU_NAME, AVG(ENR_GRADE) AS AVG_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
GROUP BY S.STU_NO, STU_NAME
HAVING AVG(ENR_GRADE) > (
    SELECT AVG(ENR_GRADE)
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    WHERE STU_DEPT = '전기전자'
);
-- HAVING을 사용하면 그룹함수를 조건으로 사용가능해진다.
-- WHERE가 GROUP BY보다 먼저 나오기에 HAVING은 그 다음에 나와야한다.

-- 2개이상의 과목을 듣는 학생의 학번
SELECT COUNT(*), STU_NO
FROM ENROL
GROUP BY STU_NO
HAVING COUNT(*) >= 2;

-- 학과의 평균키가 165이상인 학과 출력
SELECT ROUND(AVG(STU_HEIGHT), 1), STU_DEPT
FROM STUDENT
GROUP BY STU_DEPT
HAVING AVG(STU_HEIGHT) >= 165;


SELECT * FROM STUDENT;
SELECT * FROM ENROL;
SELECT * FROM SUBJECT;






