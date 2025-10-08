package praktikum;

public class Soal3Main {
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        //p1.nama = "Roi" eror karena tidak ada ";"
        p1.asal = "Kingdom of Orvel";
        //p1.jabatan = "Assasin"; terjadi error karena deklarasi tidak sesuai dengan yang ada pada class Pegawai, maka tambahkan method "setJabatan"
        p1.setJabatan ("Assasin");
        //Belum ditambahkan pendeklarasian pada property umur
        p1.umur = 17;

        //Output yang diperintahkan adalah "Nama: Roi", jadi kata Pegawai bisa dihapus saja.
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Untuk mencetak kata tahun diakhir kalimat maka tambahkan (+ " tahun")
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}