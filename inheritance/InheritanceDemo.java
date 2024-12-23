package inheritance;

import inheritance.luaskeliling.*;
import inheritance.superthis.*;

public class InheritanceDemo {

  public void demo() {

    Zombie zombie = new Zombie();

    // mengakses method dari class induk
    zombie.attack();
    // mengakses method dari kelas
    zombie.walk();

  }

  public void demoBangunDatar() {
    // membuat objek bangun datar
    BangunDatar bangunDatar = new BangunDatar();

    // membuat objek persegi dan mengisi nilai properti
    Persegi persegi = new Persegi();
    persegi.sisi = 2;

    // membuat objek Lingkaran dan mengisi nilai properti
    Lingkaran lingkaran = new Lingkaran();
    lingkaran.r = 22;

    // membuat objek Persegi Panjang dan mengisi nilai properti
    PersegiPanjang persegiPanjang = new PersegiPanjang();
    persegiPanjang.panjang = 8;
    persegiPanjang.lebar = 4;

    // membuat objek Segitiga dan mengisi nilai properti
    Segitiga mSegitiga = new Segitiga();
    mSegitiga.alas = 12;
    mSegitiga.tinggi = 8;

    // memanggil method luas dan keliling
    bangunDatar.luas();
    bangunDatar.keliling();

    persegi.luas();
    persegi.keliling();

    lingkaran.luas();
    lingkaran.keliling();

    persegiPanjang.luas();
    persegiPanjang.keliling();

    mSegitiga.luas();
    mSegitiga.keliling();
  }

  public void demoSuperKeyword() {
    Employee dian = new Employee("Dian", 23, 4000f);

    // dian.showInfo();
    dian.info();
  }

}