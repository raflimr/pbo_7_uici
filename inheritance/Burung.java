package inheritance;

// Kelas Turunan dari Enemy
public class Burung extends Enemy {

  // method yang hanya dimiliki Class Burung atau Class ini
  void walk() {
    System.out.println("Burung berjalan");
  }

  void jump() {
    System.out.println("Burung loncat-loncat");
  }

  void fly() {
    System.out.println("Burung Terbang...");
  }
}