package Question3;

import java.util.Scanner;

public class weekday {

    public static void main(String[] args) {
        String[] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day position(0-6)");
        int position=sc.nextInt();

        try {
            if (position<0 || position>=weekdays.length){
                throw new ArrayIndexOutOfBoundsException("Day position is outside of the range");
            }
            String dayName=weekdays[position];
            System.out.println("Day name"+dayName);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error"+e.getMessage());
        }


    }
}
