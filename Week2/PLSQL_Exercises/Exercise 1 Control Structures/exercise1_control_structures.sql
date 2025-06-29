DECLARE
    v_num NUMBER := 5;
    v_result VARCHAR2(50);
BEGIN
    IF v_num > 0 THEN
        v_result := 'Positive number';
    ELSIF v_num = 0 THEN
        v_result := 'Zero';
    ELSE
        v_result := 'Negative number';
    END IF;

    DBMS_OUTPUT.PUT_LINE('IF Result: ' || v_result);

    -- LOOP Example: Print 1 to 5
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Number: ' || i);
    END LOOP;
END;