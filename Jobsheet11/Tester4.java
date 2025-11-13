package Jobsheet11;

public class Tester4 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("P04", "Fani", 7000);
        ElectricityBill eBill = new ElectricityBill("E003", 400);
        internshipEmployee iEmp = new internshipEmployee("I03", "Gilang");

        Owner ow = new Owner();
        ow.pay(eBill);
        ow.pay(pEmp);
        payable p = eBill;
        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p; // cast to access specific methods
            eb.showBillInfo();
        }
    }
}
