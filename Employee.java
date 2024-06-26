package com.MerveHoca.MEXT.Day_2;

public class Employee { // 'public' Bu sınıfın her yerden erişilebilir olduğunu belirtir.

    private String name; // 'private' Bu değişkenin sadece bu sınıfın içinden erişilenilir olduğunu belirtir.

    // Çalışanın adını tutan betin değişkenidir.

    protected double salary; // Bu değişkene aynı paket içerisinden veya alt sınıflardan erişilebilir.

    //Çalışanın yaşını tutan tam sayı değişkeni.

    private int age; // 'private' Bu değişkenin sadece bu sınıfın içinden erişilenilir olduğunu belirtir.

    public Employee(String name, double salary, int age) { // Bu sınıfın bi örneği oluşturulurken çağrılan metottur.
        this.name = name; //"name" parametresini sınıfın 'name' değişkenine atar.
        this.salary = salary; //"salary" parametresini sınıfın 'salary' değişkenine atar.
        this.age = age; //"age" parametresini sınıfın 'age' değişkenine atar.
    }

    // Getter ve Setter metotları:
    // Bu metodlar, özel değişkenlerin değerlerini dış dünyaya ( başka sınıflara yani) vermek için kullanılır.

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
