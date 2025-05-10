package UTS;

/**
 *
 * @author Maria Apriliani Lanus
 * NIM: 2301010267
 * Tgl 7/05/2025
 */
public class Makanan {
    private String kode;
    private String nama;

    public Makanan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}