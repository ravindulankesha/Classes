package com.classes;
import java.util.*;

public class Person{
    public static void viewguests(String guest[][]){for(int r=0; r<8; r++){for(int t=0; t<3; t++){if (guest[r][t]!=null){System.out.println("guest "+ t + " in room "+ r +" is " + guest[r][t]);}
    else{System.out.println("guest"+ t + " in room "+ r +" is empty");}}}

    }

    public static void addguest(String guest[][]){
        int p;
        int num=1;
        Scanner input = new Scanner(System.in);
        System.out.println("For which room number(0-7) do you want to add the guest for / type any other number to stop:");
        p=input.nextInt();
        if(p<7){for(int y=0; y<3; y++){if (num<3){
            System.out.println("To continue enter 1 to exit type any other number:");
            num=input.nextInt();
            if(num==1){System.out.println("What is the guest " + y +"'s first name:");
                guest[p][y]=input.next();
                String details;
                System.out.println("What is the guest " + y +"'s second name:");
                details= input.next();
                int number;
                System.out.println("What is the guest " + y +"'s credit card number:");
                number= input.nextInt();}}}System.out.println("Process finished");}

    }
}
