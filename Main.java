package problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer hh,mm,ss;
        System.out.print("Enter the hour : ");
        hh=sc.nextInt();
        System.out.print("Enter the minute : ");
        mm=sc.nextInt();
        System.out.print("Enter the second : ");
        ss=sc.nextInt();
        Time tt = new Time(hh, mm, ss);
        System.out.println(tt.toString());
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);
        sc.close();
    }
}
