package com.MerveHoca.MEXT.Day_2;

public class Engineer extends Employee { // 'public' Bu sınıfın her yerden erişilebilir olduğunu belirtir.

    // 'extends' Employee, Engineer classını(sınıfının) Employee sınıfından miras aldığını belirtir.
    // Employee' sınfından miras aldığını belirtir. Yani 'Engineer' sınıfının tüm özelliklerine ve metotlarını sahip olur.

    // Constructure ---> ifade asla RETURN döndürmez.
    public Engineer(String name, double salary, int age) { // Bu sınıfın(Engineer) örneği oluşturulurken çağırılan metodudur.
        super(name, salary, age); // 'Employee sınıfının yapıcı metodunu çağırır. 'name', 'salary', 'age' parametrelerini
        // 'Employee' sınıfına iletir.
    }
public double getAnnualBonus(){ //Engineer'in yıllık bonusunu hesaplayan metottur. Ve bu metotu döndürür.
        return super.salary * .05;
       // Bu metot Employee sınıfından alınana maaş/salary değişkenine erişir.
    // Ne ile erişir? super anahtar kelimesi ile erişir.
    // Metotun genel işlevi ise maaşın %5'ini hesaplar ve döndürür. Bu Engineer'ın yıllık bonusunu belirler.

    }
}

