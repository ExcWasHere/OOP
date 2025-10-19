public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }

    public static void main(String args[]){
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}

//4.1 Dari source coding diatas terletak dimanakah overloading?
// Jawaban: Overloading terletak pada dua method perkalian(), void perkalian(int a, int b), void perkalian(int a, int b, int c)

//4.2 Jika terdapat overloading ada berapa jumlah parameter yang berbeda?
// Jawaban: Ada dua versi method -> perkalian(int a, int b) → 2 parameter, perkalian(int a, int b, int c) → 3 parameter