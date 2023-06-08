package Prak6;
import java.util.ArrayList;

public class DataMahasiswa {
  private ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
  
  public void tambahMahasiswa(Mahasiswa mahasiswa) {
      mahasiswaList.add(mahasiswa);
  }
  
  public void tampilSemuaData() {
      System.out.println("Daftar Mahasiswa");
      for (Mahasiswa mahasiswa : mahasiswaList) {
          System.out.println("Nama: " + mahasiswa.getNama());
          System.out.println("Jurusan: " + mahasiswa.getJurusan());
          System.out.println("Status: " + (mahasiswa.isStatus() ? "Menikah" : "Lajang"));
          System.out.println();
      }
  }
  
  public Mahasiswa cariMahasiswa(String nama) {
      for (Mahasiswa mahasiswa : mahasiswaList) {
          if (mahasiswa.getNama().equals(nama)) {
              return mahasiswa;
          }
      }
      return null;
  }
  
  public void tampilMahasiswa(Mahasiswa mahasiswa) {
      if (mahasiswa != null) {
          System.out.println("Data Mahasiswa");
          System.out.println("Nama: " + mahasiswa.getNama());
          System.out.println("Jurusan: " + mahasiswa.getJurusan());
          System.out.println("Status: " + (mahasiswa.isStatus() ? "Menikah" : "Lajang"));
          System.out.println();
      } else {
          System.out.println("Mahasiswa tidak ditemukan");
      }
  }
  
  public void updateMahasiswa(String nama, String jurusan, boolean status) {
      Mahasiswa mahasiswa = cariMahasiswa(nama);
      if (mahasiswa != null) {
          mahasiswa.setNama(nama);
          mahasiswa.setJurusan(jurusan);
          mahasiswa.setStatus(status);
          System.out.println("Data mahasiswa berhasil diperbarui");
      } else {
          System.out.println("Mahasiswa tidak ditemukan");
      }
  }
}