-- NVL (NULL ���� ��ü�ؼ� ������ִ� �Լ�)
SELECT EMPNO, ENAME, SAL, NVL(COMM, 0) AS COMM
FROM EMP;

-- NVL2 (NULL �� ��쿡�� 3��°�� �ƴҰ��� 2��°������ ��ü�ȴ�.)
SELECT EMPNO, ENAME, SAL, NVL2(COMM, 0, 1), COMM
FROM EMP;

-- DECODE(����Ŭ������ ����ϴ� ����Ŭ ���� - IF�� �����ϸ�ȴ�.)
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '����')
FROM EMP;

-- IF ~ ELSE
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '����', '���')
FROM EMP;

-- IF ~ ELSE IF ~ ELSE
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '����', 'MANAGER', '������', '���') AS JOB
FROM EMP;

-- CASE ~ WHEN (�������� ���Ǵ� IF)
SELECT EMPNO, ENAME,
    CASE JOB WHEN 'PRESIDENT' THEN '����'
             WHEN 'MANAGER' THEN '������'
             ELSE '���'
    END AS ����
FROM EMP;

SELECT EMPNO, ENAME,
    CASE WHEN SAL > 3000 THEN '����'
             WHEN SAL > 2000 THEN '������'
             ELSE 'ȭ����'
    END AS ����
FROM EMP;

-- SYSDATE (���� ���� �ð�) => ����ÿ��� �ð��� ���� ����ȴ�. ��½ÿ��� ��¥�� ���´�.
-- MYSQL => NOW
-- (Y �� M �� D �� H�� MI�� S��) H�ڿ� 24�� �ٿ���� 24�ñ������� ǥ�� ������ 13 -> 1�� ��µȴ�.
SELECT 
    SYSDATE,
    TO_CHAR(SYSDATE, 'YYMMDD') AS CASE1,
    TO_CHAR(SYSDATE, 'YYYYMMDD') AS CASE2,
    TO_CHAR(SYSDATE, 'YY-MM-DD') AS CASE3,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS CASE4,
    TO_CHAR(SYSDATE, 'YY-MM-DD HH:MI:SS') AS CASE5,
    TO_CHAR(SYSDATE, 'YY-MM-DD HH24:MI:SS') AS CASE6
FROM DUAL;

