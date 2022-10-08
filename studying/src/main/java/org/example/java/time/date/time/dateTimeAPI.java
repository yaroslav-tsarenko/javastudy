package org.example.java.time.date.time;

import java.util.Date;

public class dateTimeAPI {
    public static void main(String[] args) {
        Date md1 = new Date();
        long start = md1.getTime();
        try {

            Thread.sleep(2000);
        } catch (Exception ex) {

        }
        Date md2 = new Date();
        long finish = md2.getTime();

        System.out.println(md1);
        System.out.println(((double) (finish - start) / 1000));
    }
}
