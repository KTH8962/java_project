-- PL/SQL

DECLARE -- 변수 선언부

BEGIN -- 실행부

EXCEPTION -- 예외처리부 (생략 가능)

END; -- 종료
/ -- 끝나는 선언

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
        DBMS_OUTPUT.PUT_LINE('사번을 다시 확인해주세요.');
    ELSIF p_count = 1 THEN
        DBMS_OUTPUT.PUT_LINE('저장되었습니다.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('2개 이상 저장되었습니다.');
    END IF;
    COMMIT;
END update_sal; 
/
-- END 뒤(update_sal) 생략은 가능하다.
-- ROWCOUNT : 위에서 변경의 영향을 받은 행의 갯수를 출력해준다.
-- COMMIT은 변경은 다 한 뒤 마지막에 선언해야한다.
-- 텍스트 이어 붙이기는 ||을 사용한다.
SELECT * FROM EMP;
SET SERVEROUTPUT ON;
-- 최초에 선언을 해야 DBMS_OUTPUT.PUT_LINE('저장되었습니다.')이 출력이 가능해진다.
EXECUTE UPDATE_SAL(7369, 50);
-- 프로시져 선언 바로 뒤에는 주석이오면 안된다.




-- STUDENT 테이블을 대상
-- 학번을 입력받아서 해당 학번의 학생의 키를 1증가 시키는 프로시저 생성

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
        DBMS_OUTPUT.PUT_LINE('해당 학번이나 과목이 존재하지 않습니다.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('저장되었습니다.');
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
    DBMS_OUTPUT.PUT_LINE(P_STUNAME || '의 학과는 ' || P_STUDEPT || '이며 학년은 ' || P_GRADE || '입니다.');
END STUINFO;
/

EXECUTE STUINFO(20131001);
-- 해당 학번을 가진 학생의 이름, 학과, 학년 프린트문으로 출력
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
    DBMS_OUTPUT.PUT_LINE('해당 사번의 이름은 ' || P_ENAME || '이며 직급은 ' || P_JOB ||'입니다');
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
    DBMS_OUTPUT.PUT_LINE('해당 사번의 이름은 ' || P_EMP.ENAME || '이며 직급은 ' || P_EMP.JOB ||'입니다');
END EMPINFO;
/
EXECUTE EMPINFO(7499);

-- 프로시저 호출 시 SELECT 데이터가 여러개일 경우
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
-- 10번 부서 사람들의 사번, 이름, 급여



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
-- REVERSE는 반대로 출력.
-- MOD는 나머지 연산자.

DECLARE
    i NUMBER := 1;
BEGIN
    WHILE i <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
        i := i + 1;
    END LOOP;
END;
/

-- 쇼핑몰
-- 1. 고객 테이블 (TBL_USER) - 필요한 컬럼 정의
-- 2. 제품 테이블 (TBL_PRODUCT) - 필요한 컬럼 정의
-- 컬럼명까지
-- 쿠폰이 있다면 고객테이블에 쿠폰리스트를 추가할수 없다.
-- 파생되는 테이블은 어떤것이 있는지 테이블 명만.



