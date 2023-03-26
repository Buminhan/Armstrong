import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int basamak = 0, arm, arm1, arm2, arms = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        arm1 = arm2 = arm = s.nextInt();
        while(arm1 != 0){
            arm1 /=10;
            basamak++;
        }
        while (arm2 != 0){
            arms += Math.pow(arm2%10,basamak);
            arm2 /= 10;
        }
        if(arm==arms){
            System.out.println(arm+" sayısı armstrong sayısıdır.");
        }
        else{
            System.out.println(arm+" sayısı armstrong sayısı değildir.");
        }
    }
}
