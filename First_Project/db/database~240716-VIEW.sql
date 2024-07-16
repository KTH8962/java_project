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

-- VIEW는 제공용으로 필요한 정보만 잘라서 제공한다.
-- 이름의 시작점은 V_로 시작된다.
-- SELF조인해서 쓰는걸 미리 작업해서 사용 할 수 있다.
-- CREATE 뒤에 OR REPLACE를 사용하면 수정도 가능하다.
-- WITH READ ONLY를 사용하면 삭제를 할 수 없게 된 다.