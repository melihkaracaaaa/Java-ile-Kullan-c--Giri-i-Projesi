
package kullanici.girişi.programi;

import java.util.Scanner;

public class KullaniciGirişiProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Giris_Hakki = 3;
        
        String sys_Kullanici_adi = "Melihcan Karaca";
        String sys_Parola = "12345";
        
        System.out.println("********************************");
        System.out.println("Kullanici Girisine Hoşgeldiniz...");
        System.out.println("********************************");
        
        while (true) {
            
            System.out.print("Kullanici Adi :");
            String kullanici = scanner.nextLine();
            
            System.out.print("Parola :");
            String parola = scanner.nextLine();
            
            if (kullanici.equals(sys_Kullanici_adi) && parola.equals(sys_Parola)){
            
                System.out.println("Hosgeldiniz..." + kullanici);
                break;
            }
            
            else if (kullanici.equals(sys_Kullanici_adı) && !parola.equals(sys_Parola)){
                System.out.println("Parolaniz Yanlis...");
                Giriş_Hakki -= 1;
                System.out.println("Kalan Giris Hakki : " + Giris_Hakki);
                
            }
            else if (!kullanici.equals(sys_Kullanici_adi) && parola.equals(sys_Parola)){
                System.out.println("Kullanici Adiniz Yanlis..");
                Giris_Hakki -= 1;
                System.out.println("Kalan Giris Hakki : " + Giris_Hakki);
            }
            else {
                System.out.println("Kullanici Adi ve Parolaniz Yanlis...");
                        
                Giris_Hakki -= 1;
                System.out.println("Kalan Giris Hakki : " + Giris_Hakki);
            }
            
            if (Giris_Hakki == 0) {
                System.out.println("Giris Hakkiniz Bitti. Daha sonra tekrar deneyiniz...");
                break;
                
            }
        
        
        }
        
    }
    
}
