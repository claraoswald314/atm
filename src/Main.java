import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        int sayi;
        int price;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("merhaba, kodluyoruz bankasına hoşgeldiniz ! ");
                System.out.println("İşlem seçiniz : 1- para yatırma\n" + "2-para çekme\n" + "3- bakiye sorgula\n" + "4- çıkış yap");
                sayi = input.nextInt();
                switch (sayi) {
                    case 1:
                        System.out.println("para miktarı : ");
                        price = input.nextInt();
                        balance += price;
                        System.out.println("bakiyeniz : " + balance);
                        break;
                    case 2:
                        System.out.println("para miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                            System.out.println("kalan bakiyeniz : " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere");
                        break;
                    default:
                        System.out.println("Lütfen 1 ile 4 arasında bir değer giriniz.");

                }
            } else {
                System.out.println("kullanıcı adı veya parola hatalı. Lütfen tekrar deneyiniz");
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }


        }
    }
}
