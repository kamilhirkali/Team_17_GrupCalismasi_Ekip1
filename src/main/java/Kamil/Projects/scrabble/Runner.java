package Kamil.Projects.scrabble;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int oyuncu2Puan = 0;
        int oyuncu1Puan = 0;
        String kelime,cevap,gamer;
        boolean cikis;

        Scanner input = new Scanner(System.in);

        System.out.println("Oyuncu1 isminizi giriniz");
        String oyuncu1Adi = input.next();

        System.out.println("Oyuncu2 isminizi giriniz");
        String oyuncu2Adi = input.next();

        System.out.println(oyuncu1Adi + "  oyunu baslatmak icin bir kelime giriniz");
        kelime = input.next();

        gamer = oyuncu2Adi;
//oyunuBaslat();
        while (true) {
            System.out.println(gamer + " girilen " + kelime + " kelimesini kabul ediyormusun (Y/N)");
            cevap = input.next();

            if (cevap.equalsIgnoreCase("y")) {

                // puanHesapla();
                if (gamer.equalsIgnoreCase(oyuncu1Adi)) {
                    oyuncu2Puan += kelime.length() * 10;
                } else {
                    oyuncu1Puan += kelime.length() * 10;
                }

                System.out.println("Oyuna devam etmek istiyormusunuz (Y/N)");
                cevap = input.next();
                if (cevap.equalsIgnoreCase("y")) {

                    System.out.println(gamer + " " + kelime + " kelimesinin basina yada sonuna bir harf ekleyiniz");
                    kelime = input.next();

                    if (gamer.equalsIgnoreCase(oyuncu1Adi)) {
                        gamer = oyuncu2Adi;
                    } else {
                        gamer = oyuncu1Adi;
                    }
                    //oyunuBaslat();
                } else {
                    cikis=true;
                    new Exit(oyuncu1Puan,oyuncu2Puan,oyuncu1Adi,oyuncu2Adi);
                    break;
                }
            } else {
                cikis=false;
                new Exit(gamer,oyuncu1Adi,oyuncu2Adi);
                break;
            }
        }
        Oyuncu oyuncu1 = new Oyuncu(oyuncu1Adi, oyuncu1Puan,cikis);
        Oyuncu oyuncu2 = new Oyuncu(oyuncu2Adi, oyuncu2Puan,cikis);

        System.out.println(oyuncu1);
        System.out.println(oyuncu2);
    }



}


