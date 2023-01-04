package org.example.examClouds.Lesson18.homework;

import org.example.examClouds.Lesson9.inheritance.HeavyBox;
import org.example.statements.arrays.Array;

import java.util.ArrayList;
import java.util.List;

public class CollectionSplitter {
    public static void main(String[] args) {

        HeavyBox[] box = new HeavyBox[10];

        box[0] = new HeavyBox(300, 400, 500, 600);
        box[1] = new HeavyBox(200, 400, 500, 600);
        box[2] = new HeavyBox(350, 400, 500, 600);
        box[3] = new HeavyBox(400, 400, 500, 600);
        box[4] = new HeavyBox(300, 400, 500, 600);
        box[5] = new HeavyBox(340, 400, 500, 600);
        box[6] = new HeavyBox(270, 400, 500, 600);
        box[7] = new HeavyBox(340, 400, 500, 600);
        box[8] = new HeavyBox(800, 400, 500, 600);
        box[9] = new HeavyBox(230, 400, 500, 600);

        weightChecker(box);


    }

    public static void weightChecker(HeavyBox[] array) {

        List<HeavyBox> boxesUnderAllowableWeight = new ArrayList<>();
        List<HeavyBox> boxesOverAllowableWeight = new ArrayList<>();
        List<HeavyBox> boxesEqualsAllowableWeight = new ArrayList<>();



        for (HeavyBox boxes : array) {

            if (boxes.getWeight() < 300) {
                System.out.println(boxesUnderAllowableWeight.add(boxes));
                System.out.println("Box which weights under 300: ");
                System.out.println(boxes);

            } else if (boxes.getWeight() > 300) {
                System.out.println(boxesOverAllowableWeight.add(boxes));
                System.out.println("Box which weights over 300: ");
                System.out.println(boxes);

            } else if (boxes.getWeight() == 300) {
                System.out.println(boxesEqualsAllowableWeight.add(boxes));
                System.out.println("Box which equals 300: ");
                System.out.println(boxes);

            } else {
                System.err.println("There isn't boxes in array");
            }
        }
    }
}
