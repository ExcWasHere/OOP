package Jobsheet10.Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        Rector rector = new Rector();
        Bachelor bachelor = new Bachelor("Izuu");
        Postgraduate postgraduate = new Postgraduate("Excell");

        rector.giveCumlaudeCertificate(bachelor);
        rector.giveCumlaudeCertificate(postgraduate);
    }
}