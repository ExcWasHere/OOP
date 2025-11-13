package Jobsheet11;

public class Tester2 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("P02", "Charlie", 6000);
        employee e = pEmp;
        e.getEmployeeInfo();
        pEmp.getEmployeeInfo();
    }
}
