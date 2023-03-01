package Exercises.PriorityQueueExample;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Pokemon> myPokemon = new PriorityQueue<>();

        myPokemon.add(new Pokemon("Butterfree","Bug",38));
        myPokemon.add(new Pokemon("Pikachu","Electric",22));
        myPokemon.add(new Pokemon("Blaziken","Fire",42));
        myPokemon.add(new Pokemon("Pikachu","Electric",26));
        myPokemon.add(new Pokemon("Flygon","Dragon",68));
        myPokemon.add(new Pokemon("Milotic","Water",55));
        System.out.println("PriorityQueue using Comparable:");
        while(!myPokemon.isEmpty()){
            System.out.println(myPokemon.poll());
        }
        System.out.println();

        Queue<Pokemon> myPokemon1 = new PriorityQueue<>(new LevelComparator());
        myPokemon1.add(new Pokemon("Butterfree","Bug",38));
        myPokemon1.add(new Pokemon("Pikachu","Electric",22));
        myPokemon1.add(new Pokemon("Blaziken","Fire",42));
        myPokemon1.add(new Pokemon("Pikachu","Electric",26));
        myPokemon1.add(new Pokemon("Flygon","Dragon",68));
        myPokemon1.add(new Pokemon("Milotic","Water",55));
        System.out.println("PriorityQueue using Comparator:");
        while(!myPokemon1.isEmpty()){
            System.out.println(myPokemon1.poll());
        }

    }
}
