package ru.faang.school.hashmap.task_1;

import java.util.HashMap;
import java.util.Map;



public class House {
    String name;
    String sigil;

    @Override
    public String toString() {
        return (name + " " + sigil);
    }

    public House(String name, String sigil) {
        this.name = name;
        this.sigil = sigil;
    }

    public static void main(String[] args) {
        Map<String, House> map = new HashMap<>();
        House starkHouse = new House("Stark", "Wolf");
        House lannisterHouse = new House("Lanister", "Dracon");
        House barateonHouse = new House("Barateon", "Deer");
        map.put("StarkHouseMap", starkHouse);
        map.put("LanisterHouseMap", lannisterHouse);
//        map.put("BarateonHouseMap", barateonHouse);
        mapAddHouse(map, "BarateonHouseMap", barateonHouse);
        mapFindHouse(map, "BarateonHouseMap", barateonHouse);
        mapPrintHouse(map);
    }

    public static void mapAddHouse(Map map, String name, House house) {
        map.put(name, house);
    }

    public static void mapDeleteHouse(Map map, String name, House house) {
        map.remove(name, house);
    }

    public static void mapFindHouse(Map map, String name, House house) {
        System.out.println(map.get(name));
    }

    public static void mapPrintHouse(Map<String, House> map) {
        for (Map.Entry<String, House> entry : map.entrySet()) {
            System.out.println("nameOfHouse = " + entry.getKey().toString() + " infoOfHouse =  " + entry.getValue().toString());
        }

    }
}



