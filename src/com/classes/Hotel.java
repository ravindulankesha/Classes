package com.classes;
import java.util.*;
import java.io.*;

public class Hotel{

    public static void view(String hotel[]){for (int x = 0; x < 8; x++ )
    {Scanner input = new Scanner(System.in);
        System.out.println("room " + x + " is occupied by "+ hotel[x]);}
    }


    public static void add(String hotel[],String queue[]) {
        for (int n = 0; n < 7; n++) {
            queue[n] = "empty";
        }
        ;
        Scanner input = new Scanner(System.in);
        String roomName;
        String name;
        int numb = 1;
        if (!hotel[0].equals("empty") && !hotel[1].equals("empty") && !hotel[2].equals("empty") && !hotel[3].equals("empty") && !hotel[4].equals("empty") && !hotel[5].equals("empty") && !hotel[6].equals("empty") && !hotel[7].equals("empty") && numb == 1) {
            for (int o = 0; o < 8; o++) {
                if (numb == 1) {
                    System.out.println("enter number 1 to add customer to waiting list or any other number to quit:");
                    numb = input.nextInt();
                    if (numb == 1) {input.nextLine();
                        System.out.println("enter customer's name to add to waiting list");
                        name = input.nextLine();
                        queue[o] = name;
                    }
                }
            }
        } else {
            int roomNum = 0;
            while (roomNum < 8) {
                System.out.println("Enter room number (0-7) or any other number to stop:");
                roomNum = input.nextInt();
                if (roomNum < 8) {
                    if (hotel[roomNum].equals("empty")) {
                        input.nextLine();
                        System.out.println("Enter name of the customer for room " + roomNum + " :");
                        roomName = input.nextLine();
                        hotel[roomNum] = roomName;
                    } else {
                        System.out.println("room " + roomNum + " is already occupied by " + hotel[roomNum]);
                    }
                }
                System.out.println("process finished");
            }
        }
    }

    public static void viewempty(String hotel[]){
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < 8; x++ ){if (hotel[x].equals("empty")){System.out.println("Room no " + x + " is empty");}}
    }


    public static void delete(String hotel[],String queue[]){
        Scanner input = new Scanner(System.in);
        int deletenum=0;
        while(deletenum<8){if(deletenum<8){
            System.out.println("Type the room number(0-7) you want to delete the customer from or any other number to cancel:");
            deletenum= input.nextInt();
            {if(deletenum<8){
                if (hotel[deletenum].equals("empty")){System.out.println("Room no " + deletenum + " is already empty");}
                else {hotel[deletenum]=queue[0];queue[0]=queue[1];queue[1]=queue[2];queue[2]=queue[3];queue[3]=queue[4];queue[4]=queue[5];queue[5]=queue[6];queue[6]=queue[7];
                    System.out.println("Successfully deleted customer from room no. " + deletenum+ " and added from waiting list");}
            }else {System.out.println("process finished");}}
        }}
    }


    public static void find(String hotel[]){
        Scanner input = new Scanner(System.in);
        String customer;
        System.out.println("What is the name of the customer:");
        customer=input.nextLine();
        for(int y=0; y<8; y++){if(hotel[y].equals(customer)){System.out.println(customer+ " is in room number " + y);}}
    }

    public static void store(String hotel[])
    {Scanner input = new Scanner(System.in);

        try{FileWriter output= new FileWriter("outputtext.txt");
            for (int x = 0; x < 8; x++ )output.write("room " + x + " is occupied by "+ hotel[x] + "\n");output.close();System.out.println("Successfully written into text file");}
        catch(Exception e){System.out.println("Error writing into text");}
    }

    public static void load(String hotel[])
    {try{BufferedReader reader=new BufferedReader(new FileReader("src/inputtext.txt"));
        String row=reader.readLine();
        String textinfo="";
        while(row != null){
            textinfo += row;
            row=reader.readLine();
        }hotel[0]=textinfo.substring(22,41);
        hotel[1]=textinfo.substring(63,67);
        hotel[2]=textinfo.substring(89,93);
        hotel[3]=textinfo.substring(115,118);
        hotel[4]=textinfo.substring(140,144);
        hotel[5]=textinfo.substring(166,173);
        hotel[6]=textinfo.substring(195,199);
        hotel[7]=textinfo.substring(221,226);
        System.out.println("Data successfully loaded from file can check by viewing all rooms");}

    catch(Exception e){System.out.println("Error getting data from text file");}
    }

    public static void order(String hotel[]){
        String swap;
        for(int n=0; n<7; n++){if (hotel[n].compareTo(hotel[n+1])>0){swap=hotel[n+1];
            hotel[n+1]=hotel[n];
            hotel[n]=swap;}}
        for(int k=0; k<8; k++){System.out.println(hotel[k]);}
    }

}
