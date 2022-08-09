import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int select;
        int balance = 3000;
        int amount;
        Scanner inp = new Scanner(System.in);

        while (right != 0) {
            System.out.print("Kullanici adini giriniz:");
            userName = inp.next();
            System.out.print("Sifrenizi giriniz:");
            password = inp.next();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba\nYapmak istediginiz islemi seciniz:");
                System.out.print("1=>Bakiye Sorgulama\n2>=Para cekme\n3>=Para yatirma\n4>=Cikis\nSeciminiz:");
                select = inp.nextInt();
                switch (select) {

                    case 1:
                        System.out.println("Bakiyeniz:" + balance);
                        break;

                    case 2:
                        System.out.print("Cekmek istediginiz tutari giriniz:");
                        amount = inp.nextInt();
                        if (balance < amount) {
                            System.out.println("Hesabinizda cekmek istediginiz tutar bulunmamaktadir.");
                            continue;
                        } else {
                            balance -= amount;
                            System.out.println("Kalan Bakiyeniz:" + balance);
                        }
                        break;

                    case 3:
                        System.out.print("Yatirmak istediginiz tutari giriniz:");
                        amount = inp.nextInt();
                        balance += amount;
                        System.out.println("Toplam Bakiyeniz:" + balance);
                        break;

                    case 4:
                        System.out.println("Iyi gunler Dileriz:");
                        break;
                }
                break;
            } else {
                right--;
                System.out.println("Hatali giris yaptiniz.Tekrar deneyiniz.");
                System.out.println("=======================================");
                System.out.println("Kalan hakkiniz:" + right);
            }
        }
        if (right == 0) {
            System.out.println("Hesabiniz bloke olmustur.Banka ile iletisime geciniz.");
        }
    }
}
