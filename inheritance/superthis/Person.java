package inheritance.superthis;

// Parent Class
public class Person {

  // Inisilisasi nilai attribute dengan nilai awal
  String name = "Surya Saputra";
  int age = 22;

  // Constructor
  public Person() {
    System.out.println("Eksekusi konstruktor Person()");
  }
  
  // Method yang bisa diakses oleh kelas turunan
  public void showMessage() {
    System.out.println("Hello, ini pesan dari class Person...");
  }

}
