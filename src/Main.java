import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi Boyutu Giriniz");
        a = input.nextInt();

        int[] list = new int[a];

        for(int i= 0 ; i< list.length ; i++){
            Scanner inp = new Scanner(System.in);
            System.out.println((i+1)+". elemanı giriniz :");
            list[i] = inp.nextInt();
        }

        Arrays.sort(list);
        System.out.println("Sıralama : "+Arrays.toString(list));

    }
}