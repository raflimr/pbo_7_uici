package inheritance.superthis;

// Kelas turunan yang mengambil Person sebagai kelas Induk
public class Employee extends Person {
  
  // Attribue Class Employee
  float salary;
  String name;
  int age;

  // Constructor
  public Employee(String name, int age, float salary) {
    
    // Mengambil data dari kelas parent
    super();

    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  
  //
  public void showInfo() {
    // Menggunakan super.* menggambil nilai yang ada dikelas parent
    // System.out.println("Name: " + super.name);
    // System.out.println("Age: " + super.age);

    // Menggunakan this.* mengambil nilai yang ada di class ini atau subclass nya
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);

    System.out.println("Salary: $" + salary);
  }
 
  // Method yang menggunakan method dari kelas parent
  public void info() {
    // Super disini memanggil kelas method yang ada di parent
    super.showMessage();
  }

}