import java.util.ArrayList;
import java.util.List;

public class Dosen extends civitasAkademika {
    private String kodeDosen;
    private List<mataKuliah> mataKuliahList;

    public Dosen(String nama, String alamat, String tglLahir, String gender, String kodeDosen) {
        super(nama, alamat, tglLahir, gender);
        this.kodeDosen = kodeDosen;
        this.mataKuliahList = new ArrayList<>();
    }

    public void tambahMataKuliah(mataKuliah mataKuliah) {
        if (!mataKuliahList.contains(mataKuliah)) {
            mataKuliahList.add(mataKuliah);
        }
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void tampilkanData() {
        System.out.printf("%-15s | %-24s | ", kodeDosen, getNama());
        for (mataKuliah mk : mataKuliahList) {
            System.out.printf("%-15s | %-20s\n", "", mk.getNamaMK());
        }
    }
}