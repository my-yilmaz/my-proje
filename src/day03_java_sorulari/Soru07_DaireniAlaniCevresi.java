package day03_java_sorulari;

public class Soru07_DaireniAlaniCevresi {
    /* Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
    r=7;
    Pi=3.14
    Ipucu:
    Dairenin Cevresi : 2Pir
    Dairenin Alani : Pirr
    Ornek Cikti:
    43.96
    153.86
     */
    public static void main(String[] args) {
        int r=7;
        double daireninCevresi=2*3.14*r;
        double daireninAlani=3.14*r*r;
        System.out.println(daireninCevresi);
        System.out.println(daireninAlani);

    }
}
