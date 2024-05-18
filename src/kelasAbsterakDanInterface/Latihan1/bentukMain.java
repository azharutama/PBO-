package kelasAbsterakDanInterface.Latihan1;

public class bentukMain {

  public static void main(String[] args) {
    Lingkaran lingkaran = new Lingkaran(10);
    Tabung tabung = new Tabung(10, 5);

    System.out.println("----Lingkaran----");
    System.out.println("jari2 : 10");
    System.out.println("Luas Lingkaran:  " + lingkaran.luas());


    System.out.println("----Tabung----");
    System.out.println("jari2 : 10, tinggi : 5" );
    System.out.println("Luas Permukaan Tabung: " + tabung.luas());
}
}

