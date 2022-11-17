package Kamil.Projects.scrabble;

public class Oyuncu {
    String adi;
    int puan;
    boolean cikis;

    public Oyuncu(String adi, int puan, boolean cikis) {
        this.adi = adi;
        this.puan = puan;
        this.cikis = cikis;
    }

    @Override
    public String toString() {
       if(cikis){
        return adi+"  ==>  "+puan+"  puan";
       }
        return "";
}

}
