/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cop2805homework3;

/**
 *
 * @author robianalabady
 */
public class COP2805Homework3 {

    public static <E extends Comparable<E>> E min (E list[]){
        E minElement = list[0];
        
        for(int i = 1; i < list.length; i++){
            if(list[i].compareTo(minElement) < 0){
                minElement = list[i];
            }
        }
        return minElement;
    }//end E min
    
    public static void main(String[] args) {
        String[] colors = {"Red","Green","Blue"};
        Integer[] numbers = {1, 2, 3};
        Double[] circleRadius = {3.0, 5.9, 2.9};
        
        System.out.println("List of Minimums: \n");
        System.out.print("Colors ----------> ");
        System.out.println(min(colors));
        System.out.print("Numbers ---------> ");
        System.out.println(min(numbers));
        System.out.print("Circle Radius ---> ");
        System.out.println(min(circleRadius));
        
    }//end main
    
}//end COP2805Homework3
