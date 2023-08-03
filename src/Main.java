import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nsayi;
        System.out.print("Basamak Sayisini Giriniz :");
        Scanner scanner=new Scanner(System.in);
        nsayi=scanner.nextInt();
        for (int i=nsayi;i>=1;i--){
            for (int x=0;x<nsayi-i;x++) {
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}