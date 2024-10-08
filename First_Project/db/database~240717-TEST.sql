-- 1. 함수 연습문제
CREATE OR REPLACE FUNCTION FORMAT_DATE2(P_DATE DATE, P_TYPE VARCHAR2)
RETURN VARCHAR2
IS
BEGIN
    IF P_TYPE = 'DATETIME' THEN
        RETURN TO_CHAR(P_DATE, 'YYYY-MM-DD HH24:MI:SS');
    ELSIF P_TYPE = 'DATE' THEN
        RETURN TO_CHAR(P_DATE, 'YYYY-MM-DD');
    ELSIF P_TYPE = 'TIME' THEN
        RETURN TO_CHAR(P_DATE, 'HH24:MI:SS');
    END IF;
END;
/
SELECT FORMAT_DATE2(HIREDATE, 'DATETIME') FROM EMP;
SELECT FORMAT_DATE2(HIREDATE, 'DATE') FROM EMP;
SELECT FORMAT_DATE2(HIREDATE, 'TIME') FROM EMP;


-- 2. 프로시저 연습문제(대상 테이블 : PROFESSOR)
CREATE OR REPLACE PROCEDURE PROF_SAL(P_PROFNO NUMBER, P_RATE NUMBER)
IS
BEGIN
    UPDATE PROFESSOR
        SET PAY = PAY * (1 + P_RATE/100);
END;
/
EXECUTE PROF_SAL(1002, 10);
SELECT * FROM PROFESSOR;

-- 3. 트리거 연습문제(대상 테이블 : PROFESSOR)
CREATE TABLE PROFESSOR_LOG (
    PROFNO NUMBER,
    NAME VARCHAR2(20),
    PAY NUMBER,
    ID VARCHAR2(20),
    CDATETIME DATE,
    EVENT VARCHAR2(10)
);

CREATE OR REPLACE TRIGGER PROFESSOR_TRIGGER1
    AFTER
    UPDATE OR INSERT OR DELETE ON PROFESSOR
    FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO PROFESSOR_LOG
        VALUES(:NEW.PROFNO, :NEW.NAME, :NEW.PAY, SYS_CONTEXT('USERENV', 'SESSION_USER'), SYSDATE, 'I');
    ELSIF UPDATING THEN
        INSERT INTO PROFESSOR_LOG
        VALUES(:NEW.PROFNO, :NEW.NAME, :NEW.PAY, SYS_CONTEXT('USERENV', 'SESSION_USER'), SYSDATE, 'U');
    ELSIF DELETING THEN
        RAISE_APPLICATION_ERROR(-20002,'삭제 불가능');
    END IF;
END;
/

UPDATE PROFESSOR
SET BONUS = BONUS + 1
WHERE PROFNO = 1001;
INSERT INTO PROFESSOR
VALUES(1234, '홍길동', '123DD', '전임강사', 250, SYSDATE, NULL, 103, NULL, NULL);
DELETE FROM PROFESSOR WHERE PROFNO = 1234;

SELECT * FROM PROFESSOR;
SELECT * FROM PROFESSOR_LOG; 








