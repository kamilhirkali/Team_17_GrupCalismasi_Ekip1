package Kamil.Projects.okul;

import Kamil.Projects.okul.Ogrenci;
import Kamil.Projects.okul.Okul;

import java.util.Scanner;

public class OkulRunner {
    public static void main(String[] args) {
        Okul okul1=new Okul("Mevlana Lisesi",3);
        int ogrenciSayisi=1;
        Scanner input=new Scanner(System.in);
do {
    System.out.println(ogrenciSayisi + ".ogrenci adini giriniz");
    String ogrAd = input.next();

    System.out.println(ogrenciSayisi + ".ogrenci soyadini giriniz");
    String ogrSoyad = input.next();

    System.out.println(ogrenciSayisi + ".ogrenci yasini giriniz");
    int ogrYas = input.nextInt();


    try {
        Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, ogrYas);
       okul1.getOgrenciler().add(ogr);
        ogrenciSayisi++;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println("Yeni Ogrenci ismi giriniz");
    }
}while(ogrenciSayisi<= okul1.getMaxOgrenciSayisi());

for(Ogrenci w: okul1.getOgrenciler()){
    System.out.println(w);
}



    }







}
