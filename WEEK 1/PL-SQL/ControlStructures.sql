CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER(10,2),
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER(5,2),
    DueDate DATE,
    CONSTRAINT fk_customer
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1,'Rahul',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Priya',45,8000,'FALSE');
INSERT INTO Customers VALUES (3,'Amit',70,20000,'FALSE');
INSERT INTO Customers VALUES (4,'Sneha',30,12000,'FALSE');
INSERT INTO Customers VALUES (5,'Karan',62,9000,'FALSE');

COMMIT;

INSERT INTO Loans VALUES (101,1,9.5,SYSDATE+10);
INSERT INTO Loans VALUES (102,2,8.0,SYSDATE+40);
INSERT INTO Loans VALUES (103,3,10.0,SYSDATE+20);
INSERT INTO Loans VALUES (104,4,7.5,SYSDATE+15);
INSERT INTO Loans VALUES (105,5,9.0,SYSDATE+60);

COMMIT;

SELECT * FROM Customers;

SELECT * FROM Loans;

BEGIN
    FOR c IN (
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = c.CustomerID;
    END LOOP;

    COMMIT;
END;
/

SELECT * FROM Loans;

BEGIN
    FOR c IN (
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = c.CustomerID;
    END LOOP;

    COMMIT;
END;
/

SELECT * FROM Customers;

SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT c.CustomerName,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || rec.LoanID ||
            ' for ' || rec.CustomerName ||
            ' is due on ' ||
            TO_CHAR(rec.DueDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/