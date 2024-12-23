package inheritance.luaskeliling;


// Method yang bisa diakses oleh kelas turunanpublic class Lingkaran extends BangunDatar {
public class Lingkaran extends BangunDatar {

  // jari-jari lingkaran
  public float r;

  // Melakukan penyesuaian method yang ada di Class parent sehingga sesuai dengan subclass Lingkaran
  @Override
  public float luas() {
    float luas = (float) (Math.PI * r * r);
    System.out.println("Luas lingkaran: " + luas);
    return luas;
  }

  @Override
  public float keliling() {
    float keliling = (float) (2 * Math.PI * r);
    System.out.println("Keliling Lingkaran: " + keliling);
    return keliling;
  }

}