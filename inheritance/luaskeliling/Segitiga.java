package inheritance.luaskeliling;

// Method yang bisa diakses oleh kelas turunan
public class Segitiga extends BangunDatar {

  // Attribute yang diperlukan Class Segitiga
  public float alas;
  public float tinggi;

  // Melakukan penyesuaian method yang ada di Class parent sehingga sesuai dengan subclass Segitiga  
  @Override
  public float luas() {
    // float luas = 1 / 2 * (alas * tinggi); 1 / 2 berupa int maka hasilnya selalu 0
    float luas = (1f / 2f) * (alas * tinggi); // Kode perbaikan menggunakan tipe data yang sama yaitu Float
    System.out.println("Luas Segitiga: " + luas);
    return luas;
  }

}