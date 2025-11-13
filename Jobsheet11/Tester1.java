package Jobsheet11;

public class Tester1 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("P01", "Alice", 5000);
        internshipEmployee iEmp = new internshipEmployee("I01", "Bob");

        employee e;
        payable p;
        payable eBill = new ElectricityBill("E001", 250);
        e = pEmp; 
        e.getEmployeeInfo();
        e = iEmp;
        e.getEmployeeInfo();
        p = pEmp;
        p.pay();
        p = eBill;
        p.pay();
    }
}
