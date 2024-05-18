package kelasAbsterakDanInterface;

public abstract class KartuPembayaran implements Pembayaran {
  private String nomorKartu;

  public KartuPembayaran(String nomorKartu) {
      this.nomorKartu = nomorKartu;
  }

  public String getNomorKartu() {
      return nomorKartu;
  }
}



