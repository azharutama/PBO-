package RelasiKelas;

import java.util.ArrayList;
import java.util.List;

public class kartuHasilStudi {

  private String semester;
  private double ips;private List<Matakuliah> daftarMatakuliah;
  
  
  public kartuHasilStudi(String semester) {
    this.semester = semester;
    this.daftarMatakuliah = new ArrayList<>();

  }
  
  public void addMatakuliah(Matakuliah Matakuliah) {
    daftarMatakuliah.add(Matakuliah);

  }

  public String displayKartuHasilStudi() {
    StringBuilder sb = new StringBuilder();
    for (Matakuliah mk : daftarMatakuliah) {
      sb.append(mk.display());
      sb.append("\n");
    }
    return sb.toString();
  }

  public void hitungIPS() {

    double totalSks = 0;
    double totalNilai = 0;
    for (Matakuliah matakuliah : daftarMatakuliah) {
        totalSks += matakuliah.getSks();
        totalNilai += matakuliah.getSks() * matakuliah.nilaiIndex();
    }
    this.ips = totalNilai / totalSks;

  }
  
   // Setter for semester
   public void setSemester(String semester) {
    this.semester = semester;
  }

  // Getter for semester
  public String getSemester() {
    return semester;
  }

  // Setter for daftarMatakuliah
  public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
    this.daftarMatakuliah = daftarMatakuliah;
  }

  // Getter for daftarMatakuliah
  public List<Matakuliah> getDaftarMatakuliah() {
    return daftarMatakuliah;
  }

  // Setter for IPS
  public void setIPS(double ips) {
    this.ips = ips;
  }

  // Getter for IPS
  public double getIPS() {
    return ips;
  }

  
}
