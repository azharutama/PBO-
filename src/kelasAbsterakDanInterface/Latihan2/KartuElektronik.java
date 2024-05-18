package kelasAbsterakDanInterface.Latihan2;

public class KartuElektronik implements kartu {

  private String kodeBank;
  private String pin;

  public KartuElektronik(String kodeBank, String pin) {
    this.kodeBank = kodeBank;
    this.pin = pin;
  }

  @Override
  public boolean otentikasi(String pinInput) {
    return pin.equals(pinInput);
  }

  @Override
  public String encode(String pin) {
    // Implementasi encoding bisa ditambahkan di sini
    return pin;
  }
}