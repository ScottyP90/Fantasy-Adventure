package Dungon;

import Adventures.Adventurers;
import Interface.Iplayer;

import java.util.ArrayList;

public class Room {

    private String roomName;
    private ArrayList<Monster> monsters;
    private ArrayList<Treasure> treasures;
    private ArrayList<Adventurers> adventurers;
    private int monsterCap;
    private int treasureCap;

    public Room(String roomName, int monsterCap, int treasureCap) {
        this.roomName = roomName;
        this.monsters = new ArrayList<Monster>();
        this.treasures = new ArrayList<Treasure>();
        this.adventurers = new ArrayList<Adventurers>();
        this.monsterCap = monsterCap;
        this.treasureCap = treasureCap;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getMonsters() {
        return monsters.size();
    }

    public int getTreasures() {
        return treasures.size();
    }

    public int getAdventurers() {
        return adventurers.size();
    }

    public int getMonsterCap() {
        return monsterCap;
    }

    public int getTreasureCap() {
        return treasureCap;
    }

    public void addMonster(Monster monster){
        this.monsters.add(monster);
    }

    public void addTresure(Treasure treasure){
        this.treasures.add(treasure);
    }

    public void addAdventurers(Adventurers adventurer){
        this.adventurers.add(adventurer);
    }

    public void battle(Adventurers adventurer, Monster monster){
        monster.takeDamage(adventurer.attack());
        if (monster.getVitality() <= 0){
            this.monsters.remove(monster);
        }

        adventurer.defend(monster);
        if (adventurer.getVitality() <= 0){
            this.adventurers.remove(adventurer);
        }
    }

    public void moveToNextRoom(Adventurers adventurer, Room room){
        if (this.getMonsters() == 0 && this.getTreasures() == 0){
            int index = this.adventurers.indexOf(adventurer);
            Adventurers selectedAdventurer = this.adventurers.remove(index);
            room.addAdventurers(selectedAdventurer);
        }
    }
}
