package Exercises.PriorityQueueExample;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pokemon implements Comparable<Pokemon> {
    String name;
    String type;
    int level;

    public Pokemon(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                '}';
    }

    //implementing Comparable in our class, so we must define compareTo
    //NOTE: this method will only compare strings
    public int compareTo(Pokemon o){
        int result;
        result = this.name.compareTo(o.getName());
        if(result != 0){
            return result;
        }else{
            return this.level - o.getLevel();
        }
    }

}

