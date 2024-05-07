package RelasiKelas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TranskripNilai<Mahasiswa> {

    private Date tglCetak;
    private double ipk = 0.0;
    private List<kartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalBobotNilai = 0;
        double totalSKS = 0;

        for (kartuHasilStudi khs : kartuHasilStudi) {
            totalBobotNilai += khs.getIPS() * khs.getDaftarMatakuliah().size(); // Total index nilai * sks
            totalSKS += khs.getDaftarMatakuliah().size(); // Total SKS
        }

        if (totalSKS > 0) {
            ipk = totalBobotNilai / totalSKS; // Calculate IPK
        }
    }

    public void addKHS(kartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (kartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.displayKartuHasilStudi());
        }
    }

    // Setter for tglCetak
    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    // Getter for tglCetak
    public Date getTglCetak() {
        return tglCetak;
    }

    // Setter for ipk
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Getter for ipk
    public double getIpk() {
        return ipk;
    }

    // Setter for kartuHasilStudi
    public void setKartuHasilStudi(List<kartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    // Getter for kartuHasilStudi
    public List<kartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    // Setter for mahasiswa
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    // Getter for mahasiswa
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
}

