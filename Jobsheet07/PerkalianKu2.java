public class PerkalianKu2 {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }

    void perkalian(double a, double b){
        System.out.println(a * b);
    }

    public static void main(String args[]){
        PerkalianKu2 objek = new PerkalianKu2();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}

//4.3 Dari source coding diatas terletak dimanakah overloading?
// Jawaban: Overloading terdapat pada dua method perkalian(), void perkalian(int a, int b), void perkalian(double a, double b)

//4.4 Jika terdapat overloading ada berapa tipe parameter yang berbeda?
//Terdapat dua tipe parameter yang berbeda -> int dan double