SELECT * 
FROM STUDENT
ORDER BY STU_HEIGHT; -- ����Ʈ : ��������(ASC) - ��������, ��������(DESC)

SELECT * 
FROM STUDENT
ORDER BY STU_HEIGHT ASC;

SELECT * 
FROM STUDENT
ORDER BY STU_HEIGHT DESC, STU_WEIGHT DESC;

-- STUDENT, ENROL, SUBJECT
SELECT STU_NAME, ENR_GRADE
FROM STUDENT
INNER JOIN ENROL ON STUDENT.STU_NO = ENROL.STU_NO;

-- ANSI JOIN
SELECT S.STU_NO �й�, STU_NAME , ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;

-- ORACLE JOIN
SELECT S.STU_NO �й�, STU_NAME , ENR_GRADE
FROM STUDENT S, ENROL E
WHERE S.STU_NO = E.STU_NO;

-- ENROL ���̺� ���� ����� ��, ������� ���� ���
SELECT E.SUB_NO, STU_NO, ENR_GRADE, SUB_NAME
FROM ENROL E
INNER JOIN SUBJECT S ON E.SUB_NO = S.SUB_NO;

-- �л� �̸�, ���� ���
SELECT STU_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;

-- �л� �̸�, �����, ���� ���
SELECT STU_NAME "�л� �̸�", SUB_NAME "���� ��", ENR_GRADE ����
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT S2 ON E.SUB_NO = S2.SUB_NO
ORDER BY STU_NAME;

SELECT AVG(ENR_GRADE), STU_NO
FROM ENROL
GROUP BY STU_NO; -- GROUP BY�� ������ �༭ ���κ� ������� ����.

-- ���� ��� ���� (���� ��ȣ, ��� ���� ���)
SELECT SUB_NO "���� ��ȣ", AVG(ENR_GRADE) "��� ����"
FROM ENROL
GROUP BY SUB_NO;

-- �л��� ��� ���� (�л��̸�, �а�, ������� ���)
SELECT STU_NAME, STU_DEPT, AVG(ENR_GRADE)
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
GROUP BY STU_NAME, STU_DEPT;

-- �л����� ��ü ��� �������� ��������� ���� �л����� �й�, �̸�, ���� ���
SELECT S.STU_NO, STU_NAME, AVG(ENR_GRADE)
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
GROUP BY S.STU_NO, STU_NAME;

SELECT AVG(ENR_GRADE) FROM STUDENT;

SELECT *
FROM (
    SELECT S.STU_NO, STU_NAME, AVG(ENR_GRADE) AS ENR_AVG
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, STU_NAME
) WHERE ENR_AVG > (SELECT AVG(ENR_GRADE) FROM ENROL);

-- 1. STUDENT ���̺��� ���� �̸鼭 Ű�� 170 �̻��� �л� ��ȸ
SELECT *
FROM STUDENT
WHERE STU_DEPT = '���' AND STU_HEIGHT >= 170;

-- 2. STUDENT ���̺��� Ű�� 165~175 ������ �л� ���ϱ�(BETWEEN ����ϱ�)
SELECT *
FROM STUDENT
WHERE STU_HEIGHT BETWEEN 165 AND 175;

-- 3. ��ǻ�������� �л��� ���� Ű ū �л����� ū Ű�� ���� �л��� ���ϱ�
SELECT *
FROM STUDENT
WHERE STU_HEIGHT > (
    SELECT MAX(STU_HEIGHT)
    FROM STUDENT
    WHERE STU_DEPT = '��ǻ������'
);

-- 4. �а��� ���� Ű�� ū ��(�а���, Ű ���)
SELECT STU_DEPT, MAX(STU_HEIGHT) AS "���� ū Ű"
FROM STUDENT
GROUP BY STU_DEPT;

-- 5. ��ǻ�Ͱ��� ������ ��� �л��� �й�, �̸� ���
SELECT S.STU_NO, STU_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_NAME = '��ǻ�Ͱ���';

-- 6. ���Ѻ��� ��� �������� ���� ��� ������ ���� �л����� �̸�, ��� ���� ���
SELECT STU_NAME, ENR_AVG
FROM (
    SELECT STU_NAME, AVG(ENR_GRADE) AS ENR_AVG
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY STU_NAME, S.STU_NO
) WHERE ENR_AVG > (
                    SELECT AVG(ENR_GRADE)
                    FROM STUDENT S
                    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
                    WHERE STU_NAME = '���Ѻ�'
                    -- GROUP BY S.STU_NO
);

SELECT COUNT(*)
FROM ENROL; -- ���ڵ��� ������ Ȯ���ϴ°�

SELECT COUNT(*) AS CNT
FROM STUDENT
WHERE STU_DEPT = '��ǻ������';

-- ������ 80���̻� ���� ����� ��(�ߺ� ���)
SELECT COUNT(*)
FROM ENROL
WHERE ENR_GRADE >= 80;

-- ������ 80���̻� ���� ����� �̸��� �й� ���
SELECT S.STU_NO, STU_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
WHERE ENR_GRADE >= 80;

-- 1. ������ �л��� ���� ������ ������ ���� �̸� ���
SELECT SUB_NAME, SUB_PROF
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE S.STU_NO = '20151062';

-- 2. �����۹�, �������ڽ��� ������ ��� �л��� �й�, �̸�, ������ ���
SELECT S.STU_NO, STU_NAME, SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_NAME = '�����۹�' OR SUB_NAME = '�������ڽ���';

SELECT S.STU_NO, STU_NAME, SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE SUB_NAME IN ('�����۹�', '�������ڽ���');

-- 3. �����̸鼭 ������ ������ ������ ��� �л��� �й�, �̸�, �а�, ������, ���� ���� ���
SELECT S.STU_NO, STU_NAME, SUB_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE STU_GENDER = 'F' AND SUB_PROF = '������';

-- 4. �������� ��� �������� ���� ������ ���� �л����� �̸�, �����, ���� ���
SELECT STU_NAME, SUB_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE ENR_GRADE < (
                    SELECT AVG(ENR_GRADE)
                    FROM STUDENT S
                    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
                    WHERE S.STU_NO = '20151062'
                   );

-- 5. 2�� �̻��� ������ ��� �л����� ��� ���(�����, ����)
SELECT STU_NAME, SUB_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
WHERE S.STU_NO IN(
    SELECT STU_NO
    FROM (
            SELECT COUNT(*) AS COUNTING, STU_NO 
            FROM ENROL E
            GROUP BY E.STU_NO
    ) WHERE COUNTING >= 2
)
ORDER BY STU_NAME;


SELECT STU_NAME, SUB_NAME, SUB_PROF
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SUB ON E.SUB_NO = SUB.SUB_NO
INNER JOIN (
        SELECT COUNT(*) AS CNT, STU_NO 
        FROM ENROL
        GROUP BY STU_NO
) C ON S.STU_NO = C.STU_NO
WHERE CNT >= 2
ORDER BY STU_NAME;


-- 6. �������ڰ��� ��� �������� ���� ������ ���� �л����� ��� ���
SELECT *
FROM (
    SELECT S.STU_NAME, AVG(ENR_GRADE) AS AVG_GRADE
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, STU_NAME
) 
WHERE AVG_GRADE > (
                    SELECT AVG(ENR_GRADE)
                    FROM STUDENT S
                    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
                    WHERE STU_DEPT = '��������'
);


SELECT STU_NAME, AVG(ENR_GRADE) AS AVG_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
GROUP BY S.STU_NO, STU_NAME
HAVING AVG(ENR_GRADE) > (
    SELECT AVG(ENR_GRADE)
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    WHERE STU_DEPT = '��������'
);
-- HAVING�� ����ϸ� �׷��Լ��� �������� ��밡��������.
-- WHERE�� GROUP BY���� ���� �����⿡ HAVING�� �� ������ ���;��Ѵ�.

-- 2���̻��� ������ ��� �л��� �й�
SELECT COUNT(*), STU_NO
FROM ENROL
GROUP BY STU_NO
HAVING COUNT(*) >= 2;

-- �а��� ���Ű�� 165�̻��� �а� ���
SELECT ROUND(AVG(STU_HEIGHT), 1), STU_DEPT
FROM STUDENT
GROUP BY STU_DEPT
HAVING AVG(STU_HEIGHT) >= 165;


SELECT * FROM STUDENT;
SELECT * FROM ENROL;
SELECT * FROM SUBJECT;






