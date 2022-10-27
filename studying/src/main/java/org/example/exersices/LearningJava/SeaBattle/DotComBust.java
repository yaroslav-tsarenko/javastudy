package org.example.exersices.LearningJava.SeaBattle;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        one.setName("eToys.com");
        DotCom three = new DotCom();
        one.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your target - break down three sites");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try break down this sites for minimum tries");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Make try");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGame(String userGuess) {
        numOfGuesses++;
        String result = "Miss";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourSelf(userGuess);

            if (result.equals("Hit")) {
                break;
            }
            if (result.equals("Break down")) {
                dotComList.remove(dotComList);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(){
        System.out.println("All sites broke down");
        if(numOfGuesses <= 18){
            System.out.println("It took " + numOfGuesses + "tries");
            System.out.println("You ran away while your sites brake down");
        } else{
            System.out.println("It took from you a lot of time" + numOfGuesses + "tries");
            System.out.println("You looser");
        }
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Miss";

        for(DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourSelf(userGuess);

            if(result.equals("Hit")){
                break;
            }

            if (result.equals("Break down")){
                dotComList.remove(dotComToTest);
                break;
            }

        }
        System.out.println(result);
    }



    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
