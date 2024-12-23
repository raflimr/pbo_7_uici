package inheritance.luaskeliling;

// Method yang bisa diakses oleh kelas turunan
public class Persegi extends BangunDatar {

  // attribute yang dibutukan dalam class Persegi
  public float sisi;

  // Melakukan penyesuaian method yang ada di Class parent sehingga sesuai dengan subclass Persegi  
  @Override
  public float luas() {
    float luas = sisi * sisi;
    System.out.println("Luas Persegi: " + luas);
    return luas;
  }

  @Override
  public float keliling() {
    float keliling = 4 * sisi;
    System.out.println("Keliling Persegi: " + keliling);
    return keliling;
  }
}