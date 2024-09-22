public class mataKuliah {
    private String kodeMK;
    private String namaMK;
    private String jenisMK;

    public mataKuliah(String kodeMK, String namaMK, String jenisMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.jenisMK = jenisMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public String getJenisMK() {
        return jenisMK;
    }
}
