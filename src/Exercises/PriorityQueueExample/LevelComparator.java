package Exercises.PriorityQueueExample;

import java.util.Comparator;

public class LevelComparator implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon o1, Pokemon o2){
        if(o1.getLevel() > o2.getLevel()) return 1;
        else if(o1.getLevel() < o2.getLevel()) return -1;
        else return 0;
    }
}
