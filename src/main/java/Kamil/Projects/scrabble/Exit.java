package Kamil.Projects.scrabble;

public class Exit {

    public Exit(int oyuncu1Puan, int oyuncu2Puan, String oyuncu1Adi, String oyuncu2Adi) {

        if(oyuncu1Puan>oyuncu2Puan) {
            System.out.println("Oyunu  " + oyuncu1Adi + "  KAZANDI...");
        }else {
            System.out.println("Oyunu  " + oyuncu2Adi + "  KAZANDI...");
        }
    }


    public Exit(String gamer, String oyuncu1Adi, String oyuncu2Adi) {

        if (gamer.equalsIgnoreCase(oyuncu1Adi)) {

            System.out.println("Gecersiz kelime,Oyun bitti.Oyunu  " + oyuncu2Adi + " kazandi");

        } else {
            System.out.println("Gecersiz kelime,Oyun bitti.Oyunu  " + oyuncu1Adi + " kazandi");

        }



    }
}
