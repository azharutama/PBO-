package Latihan3;

import org.w3c.dom.Node;

public class Student {
    private int nrp;

    // Konstruktor untuk kelas Student
    public Student() {
        // dikosongkan
    }

    // Metode untuk mengatur NRP (Nomor Registrasi Mahasiswa)
    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    // Metode untuk mendapatkan NRP (Nomor Registrasi Mahasiswa)
    public int getNrp() {
        return nrp;
    }
}