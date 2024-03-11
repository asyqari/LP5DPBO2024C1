public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String keterangan;

    public Mahasiswa(String nim, String nama, String jenisKelamin,String keterangan) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.keterangan = keterangan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setKeterangan(String keterangan){this.keterangan = keterangan;}

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    public String getKeterangan(){
        return this.keterangan;
    }

}
