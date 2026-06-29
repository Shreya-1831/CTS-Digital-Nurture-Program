CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    AccountType VARCHAR2(20),
    Balance NUMBER(10,2)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER(10,2)
);

INSERT INTO Accounts VALUES (101,'Rahul','Savings',10000);
INSERT INTO Accounts VALUES (102,'Priya','Savings',15000);
INSERT INTO Accounts VALUES (103,'Amit','Current',20000);
INSERT INTO Accounts VALUES (104,'Sneha','Savings',8000);

INSERT INTO Employees VALUES (1,'John','HR',50000);
INSERT INTO Employees VALUES (2,'Alice','IT',60000);
INSERT INTO Employees VALUES (3,'Bob','IT',55000);
INSERT INTO Employees VALUES (4,'David','Finance',70000);

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied successfully.');
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/

SELECT * FROM Accounts;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department VARCHAR2,
    p_bonus NUMBER
)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus / 100)
    WHERE Department = p_department;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Employee bonus updated successfully.');
END;
/

BEGIN
    UpdateEmployeeBonus('IT',10);
END;
/

SELECT * FROM Employees;

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from NUMBER,
    p_to NUMBER,
    p_amount NUMBER
)
AS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from;

    IF v_balance >= p_amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to;

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Transfer Successful.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer Failed: Insufficient Balance.');
    END IF;
END;
/

BEGIN
    DBMS_OUTPUT.ENABLE;
    ProcessMonthlyInterest;
    UpdateEmployeeBonus('IT',10);
    TransferFunds(101,102,2000);
END;
/

SELECT * FROM Accounts;
SELECT * FROM Employees;