CREATE OR REPLACE VIEW V_EMP
AS
    SELECT EMPNO, ENAME, JOB, HIREDATE
    FROM EMP
    WHERE DEPTNO = 20
    WITH READ ONLY
;
DROP VIEW V_EMP;

SELECT *
FROM V_EMP;

-- VIEW�� ���������� �ʿ��� ������ �߶� �����Ѵ�.
-- �̸��� �������� V_�� ���۵ȴ�.
-- SELF�����ؼ� ���°� �̸� �۾��ؼ� ��� �� �� �ִ�.
-- CREATE �ڿ� OR REPLACE�� ����ϸ� ������ �����ϴ�.
-- WITH READ ONLY�� ����ϸ� ������ �� �� ���� �� ��.