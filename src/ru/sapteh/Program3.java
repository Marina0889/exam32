package ru.sapteh;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {

    private static List<String> strings;

        public static void main(String[] args) throws Exception {

        strings = new ArrayList<>();
            int logn = 0;
            String s = "";


            for (int i = 0; i < 5; i++) {
                Scanner sc = new Scanner(System.in);
                strings.add(sc.nextLine());
            }

            for (int i = 0; i < strings.size(); i++) {

                if (strings.get(i).length() > logn) {
                    logn = strings.get(i).length();
                    s = strings.get(i);
                }


            }
            System.out.println(s);


        }
}



