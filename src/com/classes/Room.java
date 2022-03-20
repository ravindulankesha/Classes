package com.classes;
import java.util.*;

public class Room {
    public static void main(String[] args){
        rooms objects=new rooms();                 //new object of the class "rooms"
        Scanner input = new Scanner(System.in);
        objects.decision= "V";                   //instances of the created object
        objects.guest = new String[8][3];
        objects.hotel = new String[8];
        objects.queue = new String[8];
        objects.mycls= new Hotel();
        objects.mycls2=new Person();

        for (int x = 0; x < 8; x++ ){objects.hotel[x] = "empty";};
        while(objects.decision.equals("V")|| objects.decision.equals("A") || objects.decision.equals("E") || objects.decision.equals("D") || objects.decision.equals("F") || objects.decision.equals("S") || objects.decision.equals("L") || objects.decision.equals("O") || objects.decision.equals("G") || objects.decision.equals("P")){
            if(objects.decision.equals("V")|| objects.decision.equals("A") || objects.decision.equals("E") || objects.decision.equals("D") || objects.decision.equals("F") || objects.decision.equals("S") || objects.decision.equals("L") || objects.decision.equals("O") || objects.decision.equals("G") || objects.decision.equals("P")){
                System.out.println(" V to view all the rooms \n A to add customers to rooms \n E to view empty rooms \n D to delete customer from room \n F to find room from customer name \n S to store customer rooms to file \n L to load customer rooms from file \n O to order customers alphabetically \n G to view guests in each customer's room \n P to paying and add guest \n or any other letter to stop:");
                objects.decision=input.next();
                if (objects.decision.equals("V"))objects.mycls.view(objects.hotel);
                else if(objects.decision.equals("A"))objects.mycls.add(objects.hotel,objects.queue);
                else if(objects.decision.equals("E"))objects.mycls.viewempty(objects.hotel);
                else if(objects.decision.equals("D"))objects.mycls.delete(objects.hotel,objects.queue);
                else if(objects.decision.equals("F"))objects.mycls.find(objects.hotel);
                else if(objects.decision.equals("S"))objects.mycls.store(objects.hotel);
                else if(objects.decision.equals("L"))objects.mycls.load(objects.hotel);
                else if(objects.decision.equals("O"))objects.mycls.order(objects.hotel);
                else if(objects.decision.equals("G"))objects.mycls2.viewguests(objects.guest);
                else if(objects.decision.equals("P"))objects.mycls2.addguest(objects.guest);}}
        System.out.println("process quited");
    }
}

class rooms{
    String decision;         //declaring variables
    String[][] guest;
    String[] hotel;
    String[] queue;
    Hotel mycls;
    Person mycls2;
}



