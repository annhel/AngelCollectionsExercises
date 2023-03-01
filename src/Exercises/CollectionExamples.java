package Exercises;

import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Magenta");
        colors.add("Yellow");
        System.out.println("Colors in an ArrayList:");
        System.out.println(colors);
        System.out.println();

        // Iterating over a LinkedList in Reverse Order
        LinkedList<String> carMake = new LinkedList<>();
        carMake.add("Ford");
        carMake.add("Toyota");
        carMake.add("BMW");
        carMake.add("RAM");
        carMake.add("Mazda");
        System.out.println("Iterating over a LinkedList in Reverse:");
        while(!carMake.isEmpty()){
            System.out.println(carMake.removeLast());
        }
        System.out.println();

        //Printing number less than 7 in a treeset
        Set<Integer> nums = new TreeSet<>();
        nums.add(10);
        nums.add(14);
        nums.add(3);
        nums.add(-6);
        nums.add(0);
        nums.add(-2);
        nums.add(4);
        nums.add(7);
        System.out.println("Printing values from a TreeSet below 7:");
        for(Integer num: nums){
            if(num<7){
                System.out.println(num);
            }
        }
        System.out.println();

        //PriorityQueue
        Queue<String> customers = new PriorityQueue<>();

        customers.add("Customer 1");
        customers.add("Customer 2");
        customers.add("Customer 3");
        customers.add("Customer 4");
        customers.add("Customer 5");

        System.out.println("Printing elements from a PriorityQueue:");
        while(!customers.isEmpty()){
            System.out.println(customers.poll());
        }

    }
}
