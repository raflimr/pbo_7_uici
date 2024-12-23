package inheritance;

// Kelas Turunan dari Enemy
public class Zombie extends Enemy {

  // method yang hanya dimiliki Class Zombie atau Class ini
  void walk() {
    System.out.println("Zombie jalan-jalan");
  }
}