public class Peminjam {
    private String namaPeminjam;
    private String nim;
    private String kelas;
    private String prodi;

    public Peminjam(String namaPeminjam, String nim, String kelas, String prodi) {
        this.namaPeminjam = namaPeminjam;
        this.nim = nim;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getProdi() {
        return prodi;
    }
}
