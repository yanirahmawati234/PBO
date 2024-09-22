public class Kelas {
    private String kodeKelas;
    private String namaKelas;

    public Kelas(String kodeKelas, String namaKelas) {
        setKodeKelas(kodeKelas); // Menggunakan setter untuk validasi
        this.namaKelas = namaKelas;
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(String kodeKelas) {
        if (kodeKelas != null && kodeKelas.length() == 2) {
            this.kodeKelas = kodeKelas;
        } else {
            System.out.println("Kode kelas harus terdiri dari 2 karakter.");
        }
    }

    public String getNamaKelas() {
        return namaKelas;
    }
}
