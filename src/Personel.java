
import java.util.ArrayList;

/**
 *
 * @author hncal
 */
public class Personel {
    private String ad;
    private String soyad;
    private int sicilNo;
    private static int numarator=1;
    private String unvan;
    private int gunlukUcret;
    private int calistigiGunSayisi;
    private int kalanIzinGunSayisi;

    public Personel(){
        
    }
    public Personel(String ad, String soyad, String unvan, int calistigiGunSayisi) {
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.calistigiGunSayisi = calistigiGunSayisi;
        this.gunlukUcret=100;
        kalanIzinGunSayisi=20;
        this.sicilNo=numarator;
        Personel.numarator++;
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
    public  int getSicilNo() {
        return sicilNo;
    }
    public  void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }
    public String getUnvan() {
        return unvan;
    }
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public int getGunlukUcret() {
        return gunlukUcret;
    }
    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }
    public int getCalistigiGunSayisi() {
        return calistigiGunSayisi;
    }
    public void setCalistigiGunSayisi(int calistigiGunSayisi) {
        this.calistigiGunSayisi = calistigiGunSayisi;
    }
    public int getKalanIzinGunSayisi() {
        return kalanIzinGunSayisi;
    }
    public void setKalanIzinGunSayisi(int kalanIzinGunSayisi) {
        this.kalanIzinGunSayisi = kalanIzinGunSayisi;
    }
    

    public double maasHesapla(){
        return gunlukUcret*calistigiGunSayisi;
    }
    
    public static void izindenDus(ArrayList<Personel> personeller ,int sicilNo,int gun){
        for(Personel personel:personeller){
            if(personel.sicilNo==sicilNo){
                personel.kalanIzinGunSayisi-=gun;
            }
        }
    }
    
    public void bilgileriGoruntule(){
        System.out.println("\nSicil No : "+this.sicilNo+"\nAdı : "+this.ad+"\nSoyad : "
                + this.soyad+"\nÜnvan : "+this.unvan+"\nMaaş : "+this.maasHesapla()
                +"\nKalan izin sayisi : "+this.kalanIzinGunSayisi);
    }
}
