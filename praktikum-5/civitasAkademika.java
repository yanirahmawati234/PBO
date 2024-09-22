abstract class civitasAkademika {
    private String nama;
    private String alamat;
    private String tglLahir; // Format: dd/mm/yyyy
    private String gender; // "L" atau "P"

    // Constructor
    public civitasAkademika(String nama, String alamat, String tglLahir, String gender) {
        this.nama = nama;
        this.alamat = alamat;
        setTglLahir(tglLahir); // Menggunakan setter untuk validasi
        setGender(gender); // Menggunakan setter untuk validasi
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getTglLahir() {
        return tglLahir;
    }
    public void setTglLahir(String tglLahir) {
        // Validasi format tanggal
        if (tglLahir.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.tglLahir = tglLahir; // Simpan jika format benar
        } else {
            System.out.println("Tanggal lahir harus dalam format dd/mm/yyyy.");
        }
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender.equals("L") || gender.equals("P")) {
            this.gender = gender;
        } else {
            System.out.println("Gender harus 'L' (Laki-laki) atau 'P' (Perempuan).");
        }
    }
}