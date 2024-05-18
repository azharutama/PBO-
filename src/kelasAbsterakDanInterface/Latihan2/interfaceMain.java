package kelasAbsterakDanInterface.Latihan2;

public class interfaceMain {
  
  public static void main(String[] args) {
    KartuElektronik kartu = new KartuElektronik("IF111", "123");
    System.out.println("Otentikasi : "+ kartu.otentikasi("123"));
  }

  

}
