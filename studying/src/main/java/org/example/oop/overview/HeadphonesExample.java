package org.example.oop.overview;

public class HeadphonesExample {
    String charge = "Micro usb";
    String[] controls = {"power", "volume", "skip", "play/pause"};
    String color = "Red/Black";
    static boolean power = false;
    static int volume = 0;

    public static void powerOn() {
        power = true;
    }

    public static void powerOff() {
        power = false;
    }
    public static void volumeUp(){
        volume++;
    }

    public static void volumeDown(){
        volume--;
    }
}
