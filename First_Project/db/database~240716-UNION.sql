-- 부서별 평균급여와 전체 평균
SELECT 
    DNAME AS 부서명,
    CEIL(AVG(SAL)) AS 평균금액
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
GROUP BY DNAME
UNION
SELECT 
    '전체평균',
    FLOOR(AVG(SAL))
FROM EMP;

-- 학과별 평균과 전체 평균
SELECT 학과, 평균
FROM (
    SELECT 
        STU_DEPT AS 학과,
        AVG(ENR_GRADE) AS 평균,
        1 ODERKEY 
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY STU_DEPT
    UNION
    SELECT 
        '전체평균',
        ROUND(AVG(ENR_GRADE), 1),
        2 ODERKEY
    FROM ENROL
    ORDER BY ODERKEY ASC, 평균 DESC
);





