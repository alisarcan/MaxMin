import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı giriceksiniz : ");
        int n = input.nextInt();
        int number,i=1,max=0,min=54564564;
        while (i <= n){
            System.out.print(i+". Sayıyı giriniz : ");
            number = input.nextInt();
            if (number>max){
                max = number;
            }
            if (number<min){
                min = number;
            }
            i++;
        }
        System.out.println("En Büyük Sayı : "+max);
        System.out.print("En Küçük Sayı : "+min);
    }
}
