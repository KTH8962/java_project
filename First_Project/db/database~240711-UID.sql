-- UPDATE, INSERT, DELETE

-- UPDATE
UPDATE T_EMP 
SET HOBBY = '코딩',
PAY = PAY*1.1
WHERE EMPNO = 19960212;

UPDATE STUDENT
SET STU_HEIGHT = 170
WHERE STU_HEIGHT IS NULL;

-- INSERT
INSERT INTO STUDENT 
VALUES (20241234, '홍길동', '컴퓨터정보', 1, 'A', 'M', 170, 60);

INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT)
VALUES (20249876, '김철수', '기계');

INSERT INTO T_EMP
VALUES (20240001, '이소백', '98/05/15', 1007, '정규직', '02)655-8010', '노래', 35000000, '사원', 19960303);

-- DELETE
DELETE FROM T_EMP
WHERE EMPNO = '20240001';

DELETE FROM STUDENT
WHERE STU_NO IN (20241234, 20249876);

SELECT * FROM STUDENT;
SELECT * FROM T_EMP;
COMMIT;
ROLLBACK;






