package panicbutton;


public class Berita {
    
    int idberita;
    String judul;
    String lokasi;
    String isi;
    String tglberita;
    String img;
    User user = new User();
    KategoriBerita kategori = new KategoriBerita();

    public int getIdberita() {
        return idberita;
    }

    public void setIdberita(int idberita) {
        this.idberita = idberita;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getTglberita() {
        return tglberita;
    }

    public void setTglberita(String tglberita) {
        this.tglberita = tglberita;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    
    
}
