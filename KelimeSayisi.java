import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        try {

            System.out.println("Buraya birseyler yaziniz.");
            String yazi = scnr.nextLine();
            String[] kelimeler = yazi.split(" ");
            if (kelimeler.length > 0) {
                System.out.println("Tebrikler! Kelime yazdiniz.");
            } else {
                System.out.println("Maalesef konsoldan girilen kelime bulunmyor.");
            }
            System.out.println("Yazdiginiz metinde " + kelimeler.length + " adet kelime bulunmaktadir.");
        } finally {
            scnr.close();
        }

    }

}
