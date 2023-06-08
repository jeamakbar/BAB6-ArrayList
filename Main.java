package Prak6;

public class Main {
    public static void main(String[] args) {
        // membuat objek DataMahasiswa
        DataMahasiswa dataMhs = new DataMahasiswa();
  
        // menambahkan data mahasiswa
        dataMhs.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        dataMhs.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));
  
        // menampilkan semua data mahasiswa
        dataMhs.tampilSemuaData();
  
        // mencari mahasiswa berdasarkan nama
        Mahasiswa mhs = dataMhs.cariMahasiswa("Denar Abidin");
        if (mhs != null) {
            System.out.println("Mahasiswa ditemukan!");
            dataMhs.tampilMahasiswa(mhs);
        } else {
            System.out.println("Mahasiswa tidak ditemukan!");
        }
  
        // mengupdate data mahasiswa
        dataMhs.updateMahasiswa("Grenda Jamaludin", "Sistem Informasi", true);
  
        // menampilkan data mahasiswa setelah diupdate
        mhs = dataMhs.cariMahasiswa("Grenda Jamaludin");
        if (mhs != null) {
            System.out.println("Mahasiswa ditemukan!");
            dataMhs.tampilMahasiswa(mhs);
        } else {
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }
  }