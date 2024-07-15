-- WHERE -> LIKE
-- a% a로 시작하는, %a a로 끝나는, %a% a가 포함된
-- '_____' _가 5개라 아무글자나 5개
SELECT *
FROM STU
WHERE ID LIKE '%a%';

SELECT *
FROM STU
WHERE ID LIKE '____o';

-- 대소문자 구분없이 UPPER, LOWER 둘 중 하나 사용.
SELECT *
FROM STU
WHERE UPPER(ID) LIKE '%B%';

SELECT *
FROM STU
WHERE UPPER(ID) LIKE '%_%'; -- %_% 이건 앞 뒤 글자 상관없이 모두 다 나온다.

SELECT *
FROM STU
WHERE UPPER(ID) LIKE '%\_%' ESCAPE '\'; -- ESCAPE 사용 시 명시 해줘야 한다. %도 사용하고 싶으면 ESCAPE 사용

SELECT *
FROM DEPARTMENT
WHERE DNAME LIKE '%컴퓨터%';

