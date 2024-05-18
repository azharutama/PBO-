package kelasAbsterakDanInterface;

// Concrete class implementing Pembayaran interface
public class PembayaranDigital implements Pembayaran {
  private String email;

  public PembayaranDigital(String email) {
      this.email = email;
  }

  @Override
  public boolean otentikasi(String pinInput) {
      // Authentication logic
      return true; // Example: always true
  }

  @Override
  public String encode(String pin) {
      // Encoding implementation
      return pin; // Example: no encoding
  }
}