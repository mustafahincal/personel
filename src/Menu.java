
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hncal
 */
public class Menu {
    public static void main(String[] args){
        
        ArrayList<Personel> personeller = new ArrayList<Personel>();
        
        int secim;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\n1) Yönetici Ekle");
            System.out.println("2) Temsilci Ekle");
            System.out.println("3) Personel Ekle");
            System.out.println("4) Maaşları Hesapla");
            System.out.println("5) İzin Düş");
            System.out.println("6) Bütün Personel Bilgilerini Görüntüle");
            System.out.println("7) İşlem Sonlandır");
            System.out.print("\nIslem Seciniz : ");
            secim=scan.nextInt();
            
            switch(secim){
                case 1:
                    personeller.add(new Yonetici("Mustafa","Hıncal","CEO",30));
                    System.out.println("\nYönetici Eklendi");
                    break;
                case 2:
                    personeller.add(new Temsilci("Tunahan","Karyağdı","CTO",30));
                    System.out.println("\nTemsilci Eklendi");
                    break;
                case 3:
                    personeller.add(new Personel("Ali","Can","CFO",30));
                    System.out.println("\nPersonel Eklendi");
                    break;
                case 4:
                    for(Personel personel:personeller){
                        personel.maasHesapla();
                    }
                    break;
                case 5:
                    System.out.print("İzin Gününden düşmek istediğiniz Sicil No : ");
                    int sicil = scan.nextInt();
                    Personel.izindenDus(personeller, sicil, 5);
                    break;
                case 6:
                    for(Personel personel:personeller){
                        personel.bilgileriGoruntule();
                    }
                    break;
                case 7:
                    System.out.print("İşlem sonlandırılıyor...");
                    exit(0);
                    break;
                default:
                    System.out.println("Hatalı İşlem");
                    break;
            }
            
        }
    }
}
