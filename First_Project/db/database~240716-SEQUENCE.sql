CREATE SEQUENCE SAMPLE_SEQ;
    INCREMENT BY 1 -- 증가값
    START WITH 1 -- 시작값
    MINVALUE 1 -- 최소 값
    MAXVALUE 9999 -- 최대 값
    CYCLE; -- MAXVALUE까지 도달 시 다시 처음부터 <=> NOCYCLE
    
-- START WITH까지 입력하면 된다.
-- 그러면 MAXVALUE는 거의 무한대에 가까워진다.
-- CYCEL을 입력안하면 NOCYCLE이 DEFAULT






