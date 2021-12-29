# Module 9 :computer:

## Penjelasan Exception
Exception adalah suatu kondisi abnormal yang terjadi pada saat
menjalankan program. Teknik yang dipakai dalam Java untuk menangani
kondisi yang tidak biasa saat menjalankan operasi normal dalam program
dinamakan exception handling. Karena dalam java segala sesuatu
merupakan objek, maka exception juga direpresentasikan dalam sebuah objek
yang menjelaskan tentang exception tersebut. Contoh exception adalah
pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array,
kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses
objek yang belum diinisialisasi. 

## Latihan 1

```java
package tugas;

import java.io.FileNotFoundException;

public class Latihan1 {
public static void method1() throws

  FileNotFoundException {
    throw new FileNotFoundException("File Tidak Ada");
  }
  public static void main(String[] args) {
    try {
      method1();
    } catch (FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
```
**Penjelasan**

Pada latihan 1 diatas merupakan contoh dari checkedExeption, contoh diatas merupakan checked exeption dimana akan melakukan print 
```java
FileNotFoundException {
    throw new FileNotFoundException("File Tidak Ada");
  }
```

## Latihan 2

```java
package tugas;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
          System.out.print("Masukan Angka : ");
          int num = sc.nextInt();
          if (num > 10) throw new Exception();
          System.out.println("Angka kurang dari atau sama dengan 10 ");}
            catch (Exception s) {
              System.out.println("Angka lebih dari 10");
            }
            System.out.println("Selesai");
          }
}
```
**Penjelasan**

Menurut pengertian saya, jika kita input nilai < 10 maka sistem akan melakukan output **System.out.println("Angka kurang dari atau sama dengan 10 ");**, tetapi jika inputkan nilai > 10, maka sistem akan melakukan output **System.out.println("Angka lebih dari 10");** kenapa, karena saat user melakukan input > 10 maka sistem akan melakukan panggilan ke **Exception**
```java
if (num > 10) throw new Exception();
```
code diatas adalah sebab terjadinnya output berikut ini

**Output**

![picture 1](https://res.cloudinary.com/markdown-images-databases/image/upload/v1640760039/github/26fd2775e9c22db4687e90bb5065d3f377a040dd9c53625ba850f24b59803010.png)  

---

## Latihan 3

```java
package tugas;
import javax.swing.*;
class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}

public class Latihan3 {
  public static void main(String args[]) {
    try {
      throw new ExceptionC();
    } catch (ExceptionA a) {
      JOptionPane.showMessageDialog(null,
        a.toString(), "Exception",
        JOptionPane.INFORMATION_MESSAGE);
    }
    try {
      throw new ExceptionB();
    } catch (
      ExceptionA b) {
      JOptionPane.showMessageDialog(
        null, b.toString(), "Exception",
        JOptionPane.INFORMATION_MESSAGE);
    }
    System.exit(0);
  }
}
```
**Penjelasan**

Menggunakan konsep Inheritance untuk membuat superclass dan
subclass exception. Program menangani exception dengan
menangkap subclass exception dengan superclass.

**Output**
1

![picture 2](https://res.cloudinary.com/markdown-images-databases/image/upload/v1640760270/github/4fc98e12a5f2a606062a2c2971780099a642874d58f233348c21fda739c56a7b.png)  

**Output** 2

![picture 3](https://res.cloudinary.com/markdown-images-databases/image/upload/v1640760352/github/a558d93f15903877c87211b207705172fa1fc970c55d59c6b05c3679939c2cf4.png)  

---