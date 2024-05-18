package kelasAbsterakDanInterface;

public interface Pembayaran {
  public boolean otentikasi(String pin);
  public String encode(String pin);
}