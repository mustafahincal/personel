/**
 *
 * @author hncal
 */
public class Temsilci extends Personel{
    
    public Temsilci(String ad, String soyad, String unvan, int calistigiGunSayisi){
        super(ad,soyad,unvan,calistigiGunSayisi);
    }
    
    @Override
    public double maasHesapla(){
       return ((getGunlukUcret()*getCalistigiGunSayisi())+(getGunlukUcret()*getCalistigiGunSayisi())*0.1);
    }
    
}
