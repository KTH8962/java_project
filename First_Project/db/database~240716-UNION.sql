-- �μ��� ��ձ޿��� ��ü ���
SELECT 
    DNAME AS �μ���,
    CEIL(AVG(SAL)) AS ��ձݾ�
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
GROUP BY DNAME
UNION
SELECT 
    '��ü���',
    FLOOR(AVG(SAL))
FROM EMP;

-- �а��� ��հ� ��ü ���
SELECT �а�, ���
FROM (
    SELECT 
        STU_DEPT AS �а�,
        AVG(ENR_GRADE) AS ���,
        1 ODERKEY 
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY STU_DEPT
    UNION
    SELECT 
        '��ü���',
        ROUND(AVG(ENR_GRADE), 1),
        2 ODERKEY
    FROM ENROL
    ORDER BY ODERKEY ASC, ��� DESC
);





