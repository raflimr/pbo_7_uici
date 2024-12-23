package inheritance;

// Parent Class
public class Enemy {
  
  // attribute dalam Class Enemy
  String name;
  int hp;
  int attackPoin;

  // Method yang bisa diakses oleh Sub-class yang menggunakan class ini sebagai parent
  void attack() {
    System.out.println("Serang!");
  }
}