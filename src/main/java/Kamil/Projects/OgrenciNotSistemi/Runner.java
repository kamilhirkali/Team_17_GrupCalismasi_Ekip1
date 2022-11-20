package Kamil.Projects.OgrenciNotSistemi;

import Kamil.Projects.okul.Ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    /*Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
    her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
    yüzdesi ile dahil edin.
    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
    sınav notunun etkisi %80'dir.
    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin
    genel ortalamaya etkisi şu şekilde hesaplanır :
    Fizik Ortalaması : (90 * 0.20) + (60* 0.80);*/
    public static void main(String[] args) {

    baslat();

    }
public static void baslat(){
    double toplam=0;
    String dersAdi;
    String cikis;
    Scanner input=new Scanner(System.in);

    Teacher teacher1=new Teacher("Hasan Yilmaz","2345","FIZIK");
    Teacher teacher2=new Teacher("Mehmet Demir","4350","KIMYA");
    Teacher teacher3=new Teacher("Adnan Bilir","6742","MATEMATIK");


    Course course1=new Course("FIZIK",1000,"Hasan Yilmaz",0,0);
    Course course2=new Course("KIMYA",2000,"Mehmet Demir",0,0);
    Course course3=new Course("MATEMATIK",3000,"Adnan Bilir",0,0);


    course1.addTeacher(teacher1);
    course1.printTeacher();

    course2.addTeacher(teacher2);
    course2.printTeacher();

    course3.addTeacher(teacher3);
    course3.printTeacher();

    Student student1=new Student("ahmet","5623","11A","FIZIK","KIMYA","MATEMATIK",0,false);

    System.out.println("Not girisi yapilacak Ogrenci Adini giriniz");
    String ogrName= input.next();

    if(ogrName.equalsIgnoreCase(student1.getName())){
        dersAdi= student1.getCourse1();

        do {
            System.out.println(dersAdi + " dersinin sozlu notunu giriniz ");
            int prefix = input.nextInt();

            System.out.println(dersAdi + " dersinin yazili notunu giriniz ");
            int note = input.nextInt();

            System.out.println(dersAdi + " dersinin sozlu notuna etkisi yuzde kac olsun ?");
            int sozluYuzdesi = input.nextInt();

            toplam += student1.calcAvarage(prefix, note, sozluYuzdesi);

            if(dersAdi.equalsIgnoreCase(student1.getCourse1())){

                course1.setPrefix(prefix);
                course1.setNote(note);
                dersAdi=student1.getCourse2();

            } else if (dersAdi.equalsIgnoreCase(student1.getCourse2())){

                course2.setPrefix(prefix);
                course2.setNote(note);
                dersAdi = student1.getCourse3();

            }else if (dersAdi.equalsIgnoreCase(student1.getCourse3())){

                course3.setPrefix(prefix);
                course3.setNote(note);
                break;
            }
        }while(true);

        double genelOrtalama=toplam/3;

        if (genelOrtalama >= 50) {
            student1.setPass(true);
        } else {
            student1.setPass(false);
        }

        student1.setAvarage(genelOrtalama);

        student1.printNote(genelOrtalama);

    }else {
        System.out.println("Girilen isim yok!Tekrar giris yapmak istermisiniz? (Y/N)");
        cikis = input.next();
        if (cikis.equalsIgnoreCase("y")) {
        baslat();
        } else {
            System.out.println("Programdan cikis yapildi");
        }

    }







}



}
