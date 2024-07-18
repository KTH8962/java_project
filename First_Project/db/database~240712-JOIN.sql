-- 1. �����, ����, �μ���, �μ���ġ�� ���
SELECT ENAME, JOB, DNAME, LOC
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO;

-- �����ȣ, �����, �޿�, �޿������ ��� 
SELECT EMPNO, ENAME, SAL, GRADE
FROM EMP E
INNER JOIN SALGRADE S ON SAL BETWEEN LOSAL AND HISAL;

SELECT EMPNO, ENAME, SAL, GRADE, LOSAL, HISAL
FROM EMP E
INNER JOIN SALGRADE S ON SAL >= LOSAL AND SAL <= HISAL;

-- �� ����(JOB)�� �޿� ��յ��
SELECT JOB, ROUND(AVG(GRADE), 1)
FROM EMP E
INNER JOIN SALGRADE S ON SAL BETWEEN LOSAL AND HISAL
GROUP BY JOB;

-- �μ��� �޿� ��յ��(�μ���, ��յ�� ���)
SELECT DNAME, ROUND(AVG(GRADE), 1)
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
GROUP BY DNAME;

-- 1. 2000�̻� �޿��� �޴� ����� ���� ���Ͻÿ�
SELECT COUNT(*)
FROM EMP
WHERE SAL >= 2000;

-- 2. �����ȣ, �̸�, �޿��� ����Ͻÿ�. ��, �޿��� ����� ��, 
--   Ŀ�̼��� �޴� ����� Ŀ�̼ǰ� ���ؼ� ����� ��.
SELECT EMPNO, ENAME, SUM(SAL + NVL(COMM, 0)) AS SAL
FROM EMP
GROUP BY EMPNO, ENAME;

SELECT EMPNO, ENAME, SAL + NVL(COMM, 0) AS SAL
FROM EMP;

-- 3. WARD���� ���� �޿�(SAL)�� �޴� ������� ����Ͻÿ�.
SELECT *
FROM EMP
WHERE SAL > (SELECT SAL
            FROM EMP
            WHERE ENAME = 'WARD');

-- 4. �޿������ 3��� �̻��� ������� ���� ����Ͻÿ�.
SELECT COUNT(*)
FROM EMP E
INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE GRADE >= 3;

-- 5. 81�⵵�� �Ի��� ������� ��� ����Ͻÿ�.
SELECT *
FROM EMP
WHERE TO_CHAR(HIREDATE, 'YY') = '81';

-- 6. �� ���޺� ���� ���� �޿��� �޴� ����� ����Ͻÿ�.
SELECT *
FROM EMP E
INNER JOIN (
    SELECT MAX(SAL) AS SAL, JOB
    FROM EMP
    GROUP BY JOB
) S ON E.SAL = S.SAL AND E.JOB = S.JOB;

-- �� �� �̻��� �÷��� ���ϴ� ���
SELECT *
FROM EMP
WHERE (SAL, JOB) IN (
    SELECT MAX(SAL) AS SAL, JOB
    FROM EMP
    GROUP BY JOB
);

-- 7. SALEMAN ���޺��� ��ձ޿��� ���� �μ����� �μ���, ��յ���� ����Ͻÿ�.
SELECT DNAME, ROUND(AVG(GRADE), 1)
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
GROUP BY DNAME
HAVING AVG(SAL) > (SELECT AVG(SAL)
                    FROM EMP
                    WHERE JOB = 'SALESMAN');

--7. SALESMAN ����(JOB)���� ��ձ޿���� ���� �μ����� �μ���, ��ձ޿������ ����Ͻÿ�.
SELECT ROUND(AVG(GRADE), 1), DNAME
FROM EMP E
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
GROUP BY DNAME
HAVING AVG(GRADE) > (
    SELECT AVG(GRADE)
    FROM EMP E
    INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
    WHERE JOB = 'SALESMAN'
);

SELECT * FROM EMP;
SELECT * FROM DEPT;
SELECT * FROM SALGRADE;





