import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String devam = " ";
        int toplamTutar = 0;

        do {
            System.out.println("--------MENU-----------");
            System.out.println("1) Lahmacun --> 40 tl");
            System.out.println("2) Manti --> 65 tl");
            System.out.println("3) Icli Kofte --> 74 tl");
            System.out.println("4) Doner --> 130 tl");
            System.out.println("5) Karisik Kebap --> 320 tl");
            System.out.println("6) iskender --> 250 tl");
            System.out.println("7) Ayran --> 20 tl");
            System.out.print("Siparis vermek istediginiz yemegin numarasını giriniz : ");
            int siparis = scanner.nextInt();

            switch (siparis) {
                case 1:
                    System.out.println("Lahmacun siparişiniz hazirlaniyor");
                    toplamTutar += 40 ;
                    break;
                case 2:
                    System.out.println("Manti siparişiniz hazirlaniyor");
                    toplamTutar += 65;
                    break;
                case 3:
                    System.out.println("icli Kofte siparişiniz hazirlaniyor");
                    toplamTutar += 74;
                    break;
                case 4:
                    System.out.println("Doner siparişiniz hazirlaniyor");
                    toplamTutar += 130;
                    break;
                case 5:
                    System.out.println("Karisik Kebap siparisiniz hazirlaniyor");
                    toplamTutar += 320;
                    break;
                case 6:
                    System.out.println("Iskender siparisiniz hazirlaniyor");
                    toplamTutar += 250;
                    break;
                case 7:
                    System.out.println("Ayran siparisiniz hazirlaniyor");
                    toplamTutar += 20;
                    break;
                default:
                    System.out.println("Geçersiz islem girdiniz. Lütfen 1-7 arasında bir sayi giriniz");
                    continue;
            }

            System.out.print("Başka bir sipariş vermek ister misiniz? (Evet/Hayır): ");
            devam = scanner.next();

        } while (devam.equalsIgnoreCase("Evet"));

        System.out.println("Siparişiniz alınmıştır.  Toplam tutariniz : "+toplamTutar +"tl");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bizi Tercih Ettiginiz İcin Tesekkür Ederiz.  Yine Bekleriz.");
        scanner.close();
    }
}
