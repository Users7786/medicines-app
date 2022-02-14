package ese;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 0;
        for(int i = 0 ; i <  6 ; i++ ){
                temp  = num % 100000 ;
            int temp1 = num % 10000 ;
            System.out.println(temp);
            int temp2 = num / 1000 ;
            int temp3 = num / 100;
            int temp4 = num /10;
            int temp5 = num/1;
            int first = temp + temp1 + temp2;
            int second = temp3 +temp4 + temp5 ;
            if(first == second){
                System.out.println(" lucky number !!!");
                break;
            }
            else {
                System.out.println(" not lucky number !");
                break;
            }

        }

    }
}
