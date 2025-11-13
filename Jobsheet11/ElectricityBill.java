package Jobsheet11;

public class ElectricityBill implements payable {
    private String billNumber;
    private double amount;

    public ElectricityBill(String billNumber, double amount) {
        this.billNumber = billNumber;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Paying electricity bill " + billNumber + " : " + amount);
    }

    public void showBillInfo() {
        System.out.println("Bill #" + billNumber + ", Amount: " + amount);
    }
}
