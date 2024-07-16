-- PL/SQL

DECLARE -- ���� �����

BEGIN -- �����

EXCEPTION -- ����ó���� (���� ����)

END; -- ����
/ -- ������ ����

CREATE OR REPLACE PROCEDURE update_sal
    (P_EMPNO IN NUMBER, 
    P_SAL IN NUMBER)
IS
    p_count NUMBER;
BEGIN
    DBMS_OUTPUT.ENABLE;
    UPDATE EMP
    SET
        SAL = SAL + P_SAL
    WHERE EMPNO = P_EMPNO;
    p_count := SQL%ROWCOUNT;
    IF p_count = 0 THEN 
        DBMS_OUTPUT.PUT_LINE('����� �ٽ� Ȯ�����ּ���.');
    ELSIF p_count = 1 THEN
        DBMS_OUTPUT.PUT_LINE('����Ǿ����ϴ�.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('2�� �̻� ����Ǿ����ϴ�.');
    END IF;
    COMMIT;
END update_sal; 
/
-- END ��(update_sal) ������ �����ϴ�.
-- ROWCOUNT : ������ ������ ������ ���� ���� ������ ������ش�.
-- COMMIT�� ������ �� �� �� �������� �����ؾ��Ѵ�.
-- �ؽ�Ʈ �̾� ���̱�� ||�� ����Ѵ�.
SELECT * FROM EMP;
SET SERVEROUTPUT ON;
-- ���ʿ� ������ �ؾ� DBMS_OUTPUT.PUT_LINE('����Ǿ����ϴ�.')�� ����� ����������.
EXECUTE UPDATE_SAL(7369, 50);
-- ���ν��� ���� �ٷ� �ڿ��� �ּ��̿��� �ȵȴ�.




-- STUDENT ���̺��� ���
-- �й��� �Է¹޾Ƽ� �ش� �й��� �л��� Ű�� 1���� ��Ű�� ���ν��� ����

CREATE OR REPLACE PROCEDURE UPDATE_HEIGHT
    (P_STUNO IN NUMBER)
IS
BEGIN
    DBMS_OUTPUT.ENABLE;
    UPDATE STUDENT
    SET
        STU_HEIGHT = STU_HEIGHT + 1
    WHERE STU_NO = P_STUNO;
END UPDATE_HEIGHT;
/

SELECT * FROM STUDENT;
EXECUTE UPDATE_HEIGHT(20153075);

--------------------------------------------------------------------------------------------

CREATE OR REPLACE PROCEDURE update_score
    (P_STUNO IN ENEROL.STU_NO%TYPE, P_SUBNO IN ENEROL.SUB_NO%TYPE, P_ENRGRADE IN ENROL.ENR_GRADE%TYPE)
IS
    p_count NUMBER;
BEGIN
    UPDATE ENROL
        SET
        ENR_GRADE = ENR_GRADE + P_ENRGRADE
    WHERE STU_NO = P_STUNO AND SUB_NO = P_SUBNO;
    p_count := SQL%ROWCOUNT;
    
    IF p_count = 0 THEN
        DBMS_OUTPUT.PUT_LINE('�ش� �й��̳� ������ �������� �ʽ��ϴ�.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('����Ǿ����ϴ�.');
    END IF;
    COMMIT;
END UPDATE_SCORE;
/

SELECT * FROM ENROL;
EXECUTE UPDATE_SCORE(20131001, 101, 1);

--------------------------------------------------------------------------------------------


CREATE OR REPLACE PROCEDURE STUINFO
    (P_STUNO IN STUDENT.STU_NO%TYPE)
IS
    P_STUNAME STUDENT.STU_NAME%TYPE;
    P_STUDEPT STUDENT.STU_DEPT%TYPE;
    P_GRADE STUDENT.STU_GRADE%TYPE;
BEGIN
    SELECT STU_NAME, STU_DEPT, STU_GRADE
    INTO P_STUNAME, P_STUDEPT, P_GRADE
    FROM STUDENT
    WHERE STU_NO = P_STUNO;
    DBMS_OUTPUT.PUT_LINE(P_STUNAME || '�� �а��� ' || P_STUDEPT || '�̸� �г��� ' || P_GRADE || '�Դϴ�.');
END STUINFO;
/

EXECUTE STUINFO(20131001);
-- �ش� �й��� ���� �л��� �̸�, �а�, �г� ����Ʈ������ ���
SELECT * FROM STUDENT;

--------------------------------------------------------------------------------------------

CREATE OR REPLACE PROCEDURE EMPINFO
    (P_EMPNO IN EMP.EMPNO%TYPE)
IS
    P_ENAME EMP.ENAME%TYPE;
    P_JOB EMP.JOB%TYPE;
BEGIN
    SELECT ENAME, JOB
    INTO P_ENAME, P_JOB
    FROM EMP
    WHERE EMPNO = P_EMPNO;
    DBMS_OUTPUT.PUT_LINE('�ش� ����� �̸��� ' || P_ENAME || '�̸� ������ ' || P_JOB ||'�Դϴ�');
END EMPINFO;
/

EXECUTE EMPINFO(7499);
SELECT * FROM EMP;

--------------------------------------------------------------------------------------------

CREATE OR REPLACE PROCEDURE EMPINFO
    (P_EMPNO IN EMP.EMPNO%TYPE)
IS
    P_EMP EMP%ROWTYPE;
BEGIN
    SELECT ENAME, JOB
    INTO P_EMP.ENAME, P_EMP.JOB
    FROM EMP
    WHERE EMPNO = P_EMPNO;
    DBMS_OUTPUT.PUT_LINE('�ش� ����� �̸��� ' || P_EMP.ENAME || '�̸� ������ ' || P_EMP.JOB ||'�Դϴ�');
END EMPINFO;
/
EXECUTE EMPINFO(7499);

-- ���ν��� ȣ�� �� SELECT �����Ͱ� �������� ���
CREATE OR REPLACE PROCEDURE DEPT_LIST
    (P_DEPTNO IN EMP.DEPTNO%TYPE)
IS
    TYPE EMPNO_TABLE IS TABLE OF EMP.EMPNO%TYPE
    INDEX BY BINARY_INTEGER;
    TYPE ENAME_TABLE IS TABLE OF EMP.ENAME%TYPE
    INDEX BY BINARY_INTEGER;
    TYPE SAL_TABLE IS TABLE OF EMP.SAL%TYPE
    INDEX BY BINARY_INTEGER;
    
    EMPNO_TAB EMPNO_TABLE;
    ENAME_TAB ENAME_TABLE;
    SAL_TAB SAL_TABLE;
BEGIN
    SELECT EMPNO, ENAME, SAL
    FROM EMP
    WHERE DEPTNO = P_DEPTNO;
END DEPT_LIST;
/


SELECT * FROM EMP;
EXECUTE DEPT_LIST(10);
-- 10�� �μ� ������� ���, �̸�, �޿�



DECLARE
    i NUMBER;
BEGIN
    FOR i IN REVERSE 1..10 LOOP
        IF i MOD 2 = 1 THEN
            DBMS_OUTPUT.PUT_LINE(i);
        END IF;
    END LOOP;
END;
/
-- REVERSE�� �ݴ�� ���.
-- MOD�� ������ ������.

DECLARE
    i NUMBER := 1;
BEGIN
    WHILE i <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
        i := i + 1;
    END LOOP;
END;
/

-- ���θ�
-- 1. �� ���̺� (TBL_USER) - �ʿ��� �÷� ����
-- 2. ��ǰ ���̺� (TBL_PRODUCT) - �ʿ��� �÷� ����
-- �÷������
-- ������ �ִٸ� �����̺� ��������Ʈ�� �߰��Ҽ� ����.
-- �Ļ��Ǵ� ���̺��� ����� �ִ��� ���̺� ��.



