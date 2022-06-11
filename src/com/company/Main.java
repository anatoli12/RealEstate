package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> furnishing1=new HashMap<>();
        furnishing1.put("divani", 8);
        furnishing1.put("stolove", 44);
        furnishing1.put("masi", 10);
        furnishing1.put("televizori", 6);
	Estate estate1=new Estate.EstateBuilder(EstateType.Apartament, 434.33f, 118500,furnishing1, Face.South,
            Location.Suburb, 5)
            .garage()
            .build();
    Estate estate2=new Estate.EstateBuilder(EstateType.House, 242.2f, 244255.22f, furnishing1, Face.Northwest,
            Location.Residential, 4)
            .garden()
            .build();
    Estate estate3=new Estate.EstateBuilder(EstateType.Office, 50.4f, 45000.40f, furnishing1, Face.Northwest,
            Location.Centre, 1)
            .build();
    Agent agent = Agent.getAgent("Anatoli", "Dimov");
    agent.addToList(estate1);
    agent.addToList(estate2);
        System.out.println(agent);
    agent.removeFromList(estate2);
    agent.addToList(estate3);
        System.out.println(agent);

    }
}
