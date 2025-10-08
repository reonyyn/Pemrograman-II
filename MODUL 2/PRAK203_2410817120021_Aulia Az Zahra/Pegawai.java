package praktikum;

public class Pegawai {
    public String nama;
    //tipe data berbeda yang seharusnya string tetapi char.
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    //tipe data yang seharusnya string tetapi char.
    public String getAsal() {
        return asal;
    }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}