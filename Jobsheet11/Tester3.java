package Jobsheet11;

public class Tester3 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("P03", "Dina", 5500);
        internshipEmployee iEmp = new internshipEmployee("I02", "Edo");
        ElectricityBill eBill = new ElectricityBill("E002", 300);

        employee[] e = new employee[2];
        e[0] = pEmp;
        e[1] = iEmp;

        payable[] p = new payable[2];
        p[0] = pEmp;
        p[1] = eBill;
    }
}