public class jadwalKuliah {
    private mataKuliah mataKuliah;
    private Ruangan ruangan;
    private Kelas kelas;
    private Dosen dosen;
    private String hari;
    private String waktuMulai;
    private String waktuSelesai;

    public jadwalKuliah(String hari, String waktuMulai, String waktuSelesai, mataKuliah mataKuliah, Ruangan ruangan, Kelas kelas, Dosen dosen) {
        this.hari = hari;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
        this.kelas = kelas;
        this.dosen = dosen;
    }

    public void tampilkanJadwal() {
        System.out.printf("%-6s | %-10s | %-10s | %-20s | %-15s | %-15s | %-15s\n",
                hari, waktuMulai, waktuSelesai, mataKuliah.getNamaMK(), dosen.getNama(), ruangan.getNamaRuangan(), kelas.getNamaKelas());
    }
}
