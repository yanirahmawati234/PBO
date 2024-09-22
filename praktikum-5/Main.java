import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<mataKuliah> mataKuliahList = new ArrayList<>();
        List<Dosen> dosenList = new ArrayList<>();
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        List<Ruangan> ruanganList = new ArrayList<>();
        List<Kelas> kelasList = new ArrayList<>();
        List<jadwalKuliah> jadwalKuliahList = new ArrayList<>();

        // 10 MataKuliah
        mataKuliahList.add(new mataKuliah("21IF2015", "Komputer Grafik", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2013", "Pengantar Rekayasa Perangkat Lunak", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2016", "Proyek 3", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2045", "PBO", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2070", "Sistem Operasi", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2080", "Jaringan Komputer", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2090", "Kecerdasan Buatan", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2100", "PRPL", "PR"));
        mataKuliahList.add(new mataKuliah("21IF2110", "Teknologi Basis Data", "TE"));
        mataKuliahList.add(new mataKuliah("21IF2012", "Basis Data", "PR"));

        // 10 Dosen
        dosenList.add(new Dosen("Yudi W", "jl a", "22/09/1990","L","KO013N"));
        dosenList.add(new Dosen("Santi Sundari","jl b", "22/09/1990", "P","KO009N"));
        dosenList.add(new Dosen("Bambang W", "jl c","22/09/1990","L","KO003N"));
        dosenList.add(new Dosen("Andi Setiawan", "jl d","22/09/1990","L","KO007N"));
        dosenList.add(new Dosen("Mira Lestari", "jl e","22/09/1990","P","KO011N"));
        dosenList.add(new Dosen("Rudi Hartono", "jl f","22/09/1990","L","KO003N"));
        dosenList.add(new Dosen("Sri Mulyani", "jl g","22/09/1990","P","KO015N"));
        dosenList.add(new Dosen("Yadhi Aditya", "jl h","22/09/1990","L","KO052N"));
        dosenList.add(new Dosen("Zulkifli Arsyad", "jl i","22/09/1990","L","KO061N"));
        dosenList.add(new Dosen("Ade Hodijah","jl j","22/09/1990","P","KO060N"));

        // Assign MataKuliah to Dosen
        dosenList.get(0).tambahMataKuliah(mataKuliahList.get(0));
        dosenList.get(0).tambahMataKuliah(mataKuliahList.get(1));
        dosenList.get(1).tambahMataKuliah(mataKuliahList.get(3));
        dosenList.get(2).tambahMataKuliah(mataKuliahList.get(2));
        dosenList.get(4).tambahMataKuliah(mataKuliahList.get(4));
        dosenList.get(5).tambahMataKuliah(mataKuliahList.get(5));
        dosenList.get(6).tambahMataKuliah(mataKuliahList.get(6));
        dosenList.get(7).tambahMataKuliah(mataKuliahList.get(7));
        dosenList.get(8).tambahMataKuliah(mataKuliahList.get(8));
        dosenList.get(9).tambahMataKuliah(mataKuliahList.get(9));
        dosenList.get(3).tambahMataKuliah(mataKuliahList.get(9));

        // 10 Ruangan
        ruanganList.add(new Ruangan("D105", "Kelas"));
        ruanganList.add(new Ruangan("D106", "Lab. SDB"));
        ruanganList.add(new Ruangan("D107", "Kelas"));
        ruanganList.add(new Ruangan("D108", "Kelas"));
        ruanganList.add(new Ruangan("D102", "Lab. MT"));
        ruanganList.add(new Ruangan("D115", "Lab. PjBL-1"));
        ruanganList.add(new Ruangan("D116", "Lab. PjBL-2"));
        ruanganList.add(new Ruangan("D112", "Kelas"));
        ruanganList.add(new Ruangan("D113", "Kelas"));
        ruanganList.add(new Ruangan("D114", "Kelas"));

        // 10 Kelas
        for (int i = 0; i < 10; i++) {
            kelasList.add(new Kelas("2" + (char)('A' + i), "Kelas 2" + (char)('A' + i) + "-D3"));
        }

        // 10 Mahasiswa
        mahasiswaList.add(new Mahasiswa("Yani", "JL A","22/09/2005","P","200001",  kelasList.get(0)));
        mahasiswaList.add(new Mahasiswa("Tresna","JL B","22/09/2005","L","200002", kelasList.get(0)));
        mahasiswaList.add(new Mahasiswa("Radja","JL C","22/09/2005","L","200003", kelasList.get(1)));
        mahasiswaList.add(new Mahasiswa("Erina","JL D","22/09/2005","P","200004",  kelasList.get(1)));
        mahasiswaList.add(new Mahasiswa("Eka","JL E","22/09/2005","P","200005", kelasList.get(2)));
        mahasiswaList.add(new Mahasiswa("Alanna","JL F","22/09/2005","P","200006",  kelasList.get(2)));
        mahasiswaList.add(new Mahasiswa("Gina","JL G","22/09/2005","P","200007", kelasList.get(3)));
        mahasiswaList.add(new Mahasiswa("Heri","JL H","22/09/2005","L","200008",  kelasList.get(3)));
        mahasiswaList.add(new Mahasiswa("Indah","JL I","22/09/2005","P","200009",  kelasList.get(4)));
        mahasiswaList.add(new Mahasiswa("Joko","JL J","22/09/2005","L","200010",  kelasList.get(4)));

        // Menampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-15s\n", "NIM", "Nama", "Alamat", "Gender", "Kelas");
        System.out.println("--------------------------------------------------------------");
        for (Mahasiswa mhs : mahasiswaList) {
            mhs.tampilkanData();
        }

        // Menampilkan data dosen
        System.out.println("\nData Dosen:");
        System.out.printf("%-15s | %-20s | %-10s\n", "Kode Dosen", "Nama Dosen", "Mata Kuliah");
        System.out.println("-----------------------------------------------------------");
        for (Dosen dosen : dosenList) {
            dosen.tampilkanData();
        }

        // Membuat JadwalKuliah
        jadwalKuliahList.add(new jadwalKuliah("Senin", "08:40", "09:30", mataKuliahList.get(0), ruanganList.get(0), kelasList.get(0), dosenList.get(0)));
        jadwalKuliahList.add(new jadwalKuliah("Selasa", "07:00", "07:50", mataKuliahList.get(9), ruanganList.get(1), kelasList.get(0), dosenList.get(9)));
        jadwalKuliahList.add(new jadwalKuliah("Rabu", "07:00", "07:50", mataKuliahList.get(2), ruanganList.get(6), kelasList.get(0), dosenList.get(2)));
        jadwalKuliahList.add(new jadwalKuliah("Kamis", "08:40", "09:30", mataKuliahList.get(3), ruanganList.get(0), kelasList.get(0), dosenList.get(8)));
        jadwalKuliahList.add(new jadwalKuliah("Jumat", "08:40", "09:30", mataKuliahList.get(7), ruanganList.get(6), kelasList.get(0), dosenList.get(7)));


        // Menampilkan jadwal kuliah
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-6s | %-10s | %-10s | %-20s | %-15s | %-15s | %-15s\n",
                "Hari", "Waktu Mulai", "Waktu Selesai", "Mata Kuliah", "Dosen", "Ruangan", "Kelas");
        for (jadwalKuliah jadwal : jadwalKuliahList) {
            jadwal.tampilkanJadwal();
        }
    }
}