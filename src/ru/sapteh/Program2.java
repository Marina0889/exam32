package ru.sapteh;


import java.util.ArrayList;

public class Program2 {

        public static void main(String[] args) throws Exception{
            ArrayList<String> list = new ArrayList<String>();

            list.add("Hello");
            list.add("Java");
            list.add("Hibernate");
            list.add("Interface");
            list.add("World");

            System.out.println(list.size());

            for(int i = 0; i < 5; i++){
                System.out.println(list.get(i));
            }
        }




}
