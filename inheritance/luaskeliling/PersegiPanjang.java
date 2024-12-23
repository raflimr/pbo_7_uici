package inheritance.luaskeliling;

// Method yang bisa diakses oleh kelas turunan
public class PersegiPanjang extends BangunDatar {
  
  // Attribute yang diperlukan pada Class PersegiPanjang
  public float panjang;
  public float lebar;

  // Melakukan penyesuaian method yang ada di Class parent sehingga sesuai dengan subclass Persegi Panjang    
  @Override
  public float luas() {
    float luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang:" + luas);
    return luas;
  }

  @Override
  public float keliling() {
    float kll = 2 * panjang + 2 * lebar;
    System.out.println("Keliling Persegi Panjang: " + kll);
    return kll;
  }
}