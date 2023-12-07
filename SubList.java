package com;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        try{
            List<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println(list);

            List<Integer>list2=list.subList(3,1);
            System.out.println(list2);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");

        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");

        }finally {
            System.out.println("Finally block printed");
        }
    }
}
