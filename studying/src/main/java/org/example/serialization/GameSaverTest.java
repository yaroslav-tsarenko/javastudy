package org.example.serialization;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"Bow", "Sword", "brass knuckles"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"Hands", "Huge axe"});
        GameCharacter three = new GameCharacter(120, "Wizard", new String[]{"Spell", "Invisible"});
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
