-- 1. ������ �̿��� SELECT ��ȸ
-- STUDENT ���̺��� ��ǻ������ �а�(STU_DEPT) �л����� ��� ����Ͻÿ�.
SELECT *
FROM STUDENT
WHERE STU_DEPT = '��ǻ������';

-- 2. DML ��ɾ�
-- 2-1) EMP ���̺� INSERT ������ �̿��Ͽ� ���ڵ� �߰�
-- (�ʼ� �÷� : EMPNO, ENAME, MGR, SAL)
-- �����ʹ� ������ ���� ������ �ǳ�, MGR�� ��� EMPNO�� MGR�� ���踦 ����Ͽ� ���� ���� ��.
-- 2-2) 2-1���� ���� �������� SAL�� 2000���� ����
-- 2-3) 2-1���� ���� �����͸� EMPNO�� �������� ����
INSERT INTO EMP
VALUES(7980, 'SAM', 'SALESMAN', 7698, SYSDATE, 800, 10, 30);
UPDATE EMP
SET SAL = 2000
WHERE EMPNO = 7980;
DELETE FROM EMP WHERE EMPNO = 7980;

SELECT * FROM EMP;

 -- 3. ���� �Լ� (PROFESSOR)
-- PROFESSOR ���̺��� EMAIL �÷��� �Ʒ� �̹����� ���� ��ȯ�Ͽ� ����Ͻÿ�.
-- �Լ��� ������ ��� ����� ������ �ᵵ ������� ����� ����Ǹ� ��.
SELECT 
    SUBSTR(LPAD(SUBSTR(EMAIL, INSTR(EMAIL,'@')), LENGTH(EMAIL), '*'), 1, INSTR(EMAIL,'@')) 
    || 
    LPAD(SUBSTR(EMAIL, INSTR(EMAIL, '.')), LENGTH(EMAIL) - INSTR(EMAIL, '@'), '*') SECRETEMAIL,
    EMAIL
FROM PROFESSOR;

-- 4. �׷� �Լ� (STUDENT)
-- STUDENT���̺��� ��ǻ������ �а�(STU_DEPT) �л����� ���� ���Ͻÿ�.
SELECT COUNT(*)
FROM STUDENT
WHERE STU_DEPT = '��ǻ������';

-- 5. ���� - 2����
-- ex) 5-1) ��ǻ������ �а��� ���� ������ ������ ��� �л����� ����� ����Ͻÿ�. (STUDENT, ENROL, SUBJECT)
SELECT *
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_DEPT = '��ǻ������';

-- ex) 5-2) EMP ���̺� ���� ������� ���(EMPNO), �̸�(ENAME), �޿������ ����Ͻÿ�. (EMP, SALGRADE)
SELECT E.EMPNO, E.ENAME, S.GRADE
FROM EMP E
INNER JOIN SALGRADE S ON E.SAL >= S.LOSAL AND E.SAL <= S.HISAL;

SELECT * FROM SALGRADE;

-- 6. �������� (STU, DEPARTMENT)
-- ex) ����(DEPTNO1)�� ������(DEPTNO2)�� �������п� ���ϴ� �л��� ���� ���Ͻÿ�.
SELECT COUNT(DISTINCT NAME) AS "�л� ��"
FROM STU S
INNER JOIN DEPARTMENT D1 ON S.DEPTNO1 = D1.DEPTNO OR S.DEPTNO2 = D1.DEPTNO
INNER JOIN DEPARTMENT D2 ON D1.PART = D2.DEPTNO
INNER JOIN DEPARTMENT D3 ON D2.PART = D3.DEPTNO
WHERE D3.DNAME = '��������';

 -- 7. �л����� ���� ��� ������ ���� ���� �л��� ���� ���� �л��� ���̸� ���Ͻÿ�
-- (STUDENT, ENROL)
SELECT MIN(AVG_GRADE) MIN, MAX(AVG_GRADE) MAX, (MAX(AVG_GRADE) - MIN(AVG_GRADE)) "MAX - MIN"
FROM (
    SELECT AVG(ENR_GRADE) AVG_GRADE
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY STU_NAME
);

-- 8. 2���� ������ ���� �л����� ��������� 1���� ������ ���� �л����� ��������� ���̸� ���Ͻÿ�.
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






