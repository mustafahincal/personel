/**
 *
 * @author hncal
 */
public class Yonetici extends Personel{
    
    public Yonetici(String ad, String soyad, String unvan, int calistigiGunSayisi){
        super(ad,soyad,unvan,calistigiGunSayisi);
    }
    
    @Override
    public double maasHesapla(){
       return ((getGunlukUcret()*getCalistigiGunSayisi())+(getGunlukUcret()*getCalistigiGunSayisi())*0.2);
    }
}
