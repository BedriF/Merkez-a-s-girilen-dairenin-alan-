import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double yarıCap,merkezAcı,alan;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapını giriniz: ");
        yarıCap = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        merkezAcı = input2.nextDouble();

        alan= (pi*(yarıCap*yarıCap)*merkezAcı)/360;
        System.out.println("Merkez açısı girilen dairenin alanı :" + alan);


    }
}