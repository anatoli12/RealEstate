package com.company;

import java.util.ArrayList;
import java.util.List;

public final class Agent {
    private static Agent agent;
    private String firstName;
    private String lastName;
    private static List<Estate> estateList= new ArrayList<>();
    private Agent(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public static Agent getAgent(String firstName, String lastName){
        if(agent==null){
            agent = new Agent(firstName, lastName);
        }
        return agent;
    }
    public void addToList(Estate estate){
        estateList.add(estate);
    }
    public void removeFromList(Estate estate){
        estateList.remove(estate);
    }

    @Override
    public String toString() {
        return "Agent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", estateList=" + estateList +
                '}';
    }
}
