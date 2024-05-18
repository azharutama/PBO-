package kelasAbsterakDanInterface;

public class Main {
  public static void main(String[] args) {
      PembayaranDigital pembayaranDigital = new PembayaranDigital("example@example.com");
      System.out.println("Otentikasi: " + pembayaranDigital.otentikasi("123"));
      System.out.println("Encoded PIN: " + pembayaranDigital.encode("123"));
  }
}