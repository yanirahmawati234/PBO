public class Mahasiswa extends civitasAkademika {
    private String nim;
    private Kelas kelas;

    // Constructor
    public Mahasiswa(String nama, String alamat, String tglLahir, String gender, String nim, Kelas kelas) {
        super(nama, alamat, tglLahir, gender);
        setNim(nim);// Menggunakan setter untuk validasi
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim != null && nim.length() == 6) {
            this.nim = nim;
        } else {
            System.out.println("NIM harus terdiri dari 6 karakter.");
        }
    }

    public void tampilkanData() {
        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-15s\n",
                getNim(), getNama(), getAlamat(), getGender(), kelas.getNamaKelas());
    }
}
