
package kullanıcı.girişi.programı;

import java.util.Scanner;

public class KullanıcıGirişiProgramı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Giriş_Hakki = 3;
        
        String sys_Kullanıcı_adı = "Melihcan Karaca";
        String sys_Parola = "12345";
        
        System.out.println("********************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("********************************");
        
        while (true) {
            
            System.out.print("Kullanıcı Adı :");
            String kullanici = scanner.nextLine();
            
            System.out.print("Parola :");
            String parola = scanner.nextLine();
            
            if (kullanici.equals(sys_Kullanıcı_adı) && parola.equals(sys_Parola)){
            
                System.out.println("Hoşgeldiniz..." + kullanici);
                break;
            }
            
            else if (kullanici.equals(sys_Kullanıcı_adı) && !parola.equals(sys_Parola)){
                System.out.println("Parolanız Yanlış...");
                Giriş_Hakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + Giriş_Hakki);
                
            }
            else if (!kullanici.equals(sys_Kullanıcı_adı) && parola.equals(sys_Parola)){
                System.out.println("Kullanıcı Adınız Yanlış...");
                Giriş_Hakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + Giriş_Hakki);
            }
            else {
                System.out.println("Kullanıcı Adı ve Parolanız Yanlış...");
                        
                Giriş_Hakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + Giriş_Hakki);
            }
            
            if (Giriş_Hakki == 0) {
                System.out.println("Giriş Hakkınız Bitti. Daha sonra tekrar deneyiniz...");
                break;
                
            }
        
        
        }
        
    }
    
}
