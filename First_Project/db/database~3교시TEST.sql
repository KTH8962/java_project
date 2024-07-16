-- 1. BOOK ���̺��� PRICE�� 20000 �̻� ���
SELECT *
FROM BOOK
WHERE PRICE >= 20000;

-- 2. BOOK ���̺��� BOOKNAME �÷��� '�߱�' �� �� ���ڵ� ���
SELECT *
FROM BOOK
WHERE BOOKNAME LIKE '%�߱�%';

-- 3. BOOK ���̺��� PUBLISHER �÷��� '�½�����'�� �����͸� BOOKNAME �÷� ������������ ���
SELECT *
FROM BOOK
WHERE PUBLISHER = '�½�����'
ORDER BY BOOKNAME DESC;

-- 4. BOOK ���̺��� PRICE �� 5000�̻� 20000���� ������ ���
SELECT *
FROM BOOK
WHERE PRICE BETWEEN 5000 AND 20000;

-- 5. CUSTOMER ���̺��� PHONE�� NULL�� �ƴϰ� CUSTID�� 3�̻��� ���ڵ� ���
SELECT *
FROM CUSTOMER
WHERE PHONE IS NOT NULL AND CUSTID >= 3;

-- 6. ���� ��� �ֹ� �ݾ��� ��� ������ �ݿø��� ���� ���Ͻÿ�.
SELECT ROUND(AVG(SALEPRICE), -2)
FROM ORDERS
GROUP BY CUSTID;

-- 7. �̻�̵���� �� �߿��� ���� ��(��)�� ���� ����� �� ���̳� �Ǵ��� ���� �ο����� ���Ͻÿ�.
SELECT COUNT(*) "���� ��(��)"
FROM (
    SELECT COUNT(C.NAME)
    FROM ORDERS O
    INNER JOIN BOOK B ON O.BOOKID = B.BOOKID
    INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
    WHERE PUBLISHER = '�̻�̵��'
    GROUP BY C.NAME
    HAVING COUNT(C.NAME) > 1
);

SELECT COUNT(DISTINCT C.NAME)
FROM ORDERS O
INNER JOIN BOOK B ON O.BOOKID = B.BOOKID
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
WHERE PUBLISHER = '�̻�̵��'
GROUP BY C.NAME;

-- DISTINCT �ߺ��� �����͸� ���Ž����ش�.

-- 8. �̻�̵��� 2020�� 7�� 7�Ͽ� �ֹ����� ������ �ֹ���ȣ, �ֹ���, ����ȣ, ������ȣ�� ��� ���̽ÿ�. �� �ֹ����� ��yyyy-mm-dd ���ϡ� ���·� ǥ���Ѵ�.
SELECT O.ORDERID �ֹ���ȣ, TO_CHAR(O.ORDERDATE, 'YYYY-MM-DD') �ֹ���, O.CUSTID ����ȣ, O.BOOKID ������ȣ
FROM ORDERS O
INNER JOIN BOOK B ON O.BOOKID = B.BOOKID
WHERE B.PUBLISHER = '�̻�̵��';

-- 9. �̸�, ��ȭ��ȣ�� ���Ե� ������� ���̽ÿ�. ��, ��ȭ��ȣ�� ���� ���� ������ó���������� ǥ���Ͻÿ�.
SELECT NAME AS �̸�, NVL(PHONE, '����ó����') AS ��ȭ��ȣ
FROM CUSTOMER;

-- 10. ����Ͽ��� ����ȣ, �̸�, ��ȭ��ȣ�� ���� �� �� ���̽ÿ�.
SELECT *
FROM CUSTOMER
WHERE ROWNUM < 3;

-- 11. ��� �ֹ��ݾ� ������ �ֹ��� ���ؼ� �ֹ���ȣ�� �ݾ��� ���̽ÿ�.
SELECT ORDERID, SALEPRICE
FROM ORDERS
WHERE SALEPRICE < (
                SELECT AVG(SALEPRICE)
                FROM ORDERS
);

-- 12. �����ѹα����� �����ϴ� ������ �Ǹ��� ������ �� �Ǹž��� ���Ͻÿ�
SELECT SUM(SALEPRICE) AS "�� �Ǹž�"
FROM ORDERS O
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
WHERE SUBSTR(ADDRESS, 1, 4) = '���ѹα�';

-- 13. 3�� ���� �ֹ��� ������ �ְ� �ݾ׺��� �� ��� ������ ������ �ֹ��� �ֹ���ȣ�� �ݾ��� ���̽ÿ�.
SELECT ORDERID �ֹ���ȣ, SALEPRICE �ֹ��ݾ�
FROM ORDERS
WHERE SALEPRICE > (
    SELECT MAX(SALEPRICE) AS MAX_PRICE
    FROM ORDERS
    WHERE CUSTID = 3
);

-- 14. �̻�̵���� ���� �Ǹž��� ���̽ÿ�(���̸��� ���� �Ǹž� ���).
SELECT NAME ���̸�, SUM(SALEPRICE) �Ǹž�
FROM ORDERS O
INNER JOIN BOOK B ON O.BOOKID = B.BOOKID
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
WHERE PUBLISHER = '�̻�̵��'
GROUP BY NAME;

-- 15. ����ȣ�� 2 ������ ���� �Ǹž��� ���̽ÿ�(���̸��� ���� �Ǹž� ���).
SELECT NAME ���̸�, SUM(SALEPRICE) �Ǹž�
FROM ORDERS O
INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
WHERE O.CUSTID <= 2
GROUP BY NAME;

-- 16. �ּҿ� �����ѹα����� �����ϴ� ����� ������ �並 ����� ��ȸ�Ͻÿ�. ���� �̸��� vw_Customer�� �����Ͻÿ�.
CREATE OR REPLACE VIEW vw_Customer
AS
    SELECT *
    FROM CUSTOMER
    WHERE SUBSTR(ADDRESS, 1, 4) = '���ѹα�'
    WITH READ ONLY
;
SELECT * FROM vw_Customer;

-- 17. Orders ���̺��� ���̸��� �����̸��� �ٷ� Ȯ���� �� �ִ� �並 ������ ��, ���迬�ơ� ���� ������ ������ �ֹ���ȣ, �����̸�, �ֹ����� ���̽ÿ�.
CREATE VIEW V_ORDER_NEW
AS
    SELECT NAME, BOOKNAME, O.*
    FROM ORDERS O
    INNER JOIN CUSTOMER C ON O.CUSTID = C.CUSTID
    INNER JOIN BOOK B ON O.BOOKID = B.BOOKID;
SELECT *
FROM V_ORDER_NEW
WHERE NAME = '�迬��';




