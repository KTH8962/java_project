-- WHERE -> LIKE
-- a% a�� �����ϴ�, %a a�� ������, %a% a�� ���Ե�
-- '_____' _�� 5���� �ƹ����ڳ� 5��
SELECT *
FROM STU
WHERE ID LIKE '%a%';

SELECT *
FROM STU
WHERE ID LIKE '____o';

-- ��ҹ��� ���о��� UPPER, LOWER �� �� �ϳ� ���.
SELECT *
FROM STU
WHERE UPPER(ID) LIKE '%B%';

SELECT *
FROM STU
WHERE UPPER(ID) LIKE '%_%'; -- %_% �̰� �� �� ���� ������� ��� �� ���´�.

SELECT *
FROM STU
WHERE UPPER(ID) LIKE '%\_%' ESCAPE '\'; -- ESCAPE ��� �� ��� ����� �Ѵ�. %�� ����ϰ� ������ ESCAPE ���

SELECT *
FROM DEPARTMENT
WHERE DNAME LIKE '%��ǻ��%';

