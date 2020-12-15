package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("ilość wpisów:");
        int n = Integer.valueOf(scanner.nextLine());
        Map<String,Integer> phoneBook = new HashMap<>();
        for (int i =0;i<n;i++) {
//            System.out.println("imie");
            String imię= scanner.nextLine();
//            System.out.println("numer");
            int numer =Integer.valueOf(scanner.nextLine());
            phoneBook.put(imię,numer);
        }

        while(scanner.hasNext())
        {
            String s =scanner.nextLine();
            if (phoneBook.containsKey(s)){
                System.out.println(s+ "=" + phoneBook.get(s));
            }else {
                System.out.println("Not found");
            }
        }
    }
}
