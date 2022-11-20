package Kamil.Projects.okul;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;


    public Ogrenci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        setYas(yas);
    }

    public String getAd() {

        return ad;
    }

    public void setAd(String ad) {

        this.ad = ad;
    }

    public String getSoyad() {

        return soyad;
    }

    public void setSoyad(String soyad) {

        this.soyad = soyad;
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {
        if(yas>15){
            throw new RuntimeException("Yas degeri 15 den buyuk olamaz");
        }else{
            this.yas=yas;
        }

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }



}
