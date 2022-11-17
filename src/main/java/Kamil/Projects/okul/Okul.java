package Kamil.Projects.okul;

import Kamil.Projects.okul.Ogrenci;

import java.util.ArrayList;
import java.util.List;

public class Okul {
 private String okulAd;
   private int maxOgrenciSayisi;
    private List<Ogrenci>ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int maxOgrenciSayisi) {
       setOkulAd(okulAd);
       setMaxOgrenciSayisi(maxOgrenciSayisi);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
}
