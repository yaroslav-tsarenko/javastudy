package org.example.reflection.waysToManipulateWithClass.sevethWay;

import java.lang.reflect.*;

public class array1 {
    public static void main(String args[]) {
        try {
            Class cls = Class.forName(
                    "java.lang.String");
            Object arr = Array.newInstance(cls, 10);
            Array.set(arr, 5, "this is a test");
            String s = (String) Array.get(arr, 5);
            System.out.println(s);
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
/*    У цьому прикладі створюється масив рядків довжиною 10,
      а потім встановлюється для розташування 5 у масиві значення
      рядка. Значення витягується та відображається.

      Більш складну роботу з масивами ілюструє такий код:*/

class array2 {
    public static void main(String args[]) {
        int dims[] = new int[]{5, 10, 15};
        Object arr = Array.newInstance(Integer.TYPE, dims);

        Object arrobj = Array.get(arr, 3);
        Class cls = arrobj.getClass().getComponentType();
        System.out.println(cls);
        arrobj = Array.get(arrobj, 5);
        Array.setInt(arrobj, 10, 37);

        int arrcast[][][] = (int[][][]) arr;
        System.out.println(arrcast[3][5][10]);
    }
}

   /* У цьому
    прикладі створюється масив 5x 10x 15int,а потім переходить до встановлення значення 37для розташування[3][5][10] у масиві.
    Зверніть увагу,що багатовимірний масив насправді є масивом масивів, щоб, наприклад, після першого Array.get результатом
    в arrobj був масив 10x 15.Це ще раз очищається,щоб отримати масив довжиною 15,а 10-й слот у цьому масиві встановлюється
    за допомогою Array.setInt.
    Зауважте,що тип створюваного масиву є динамічним і не обов’язково відомий під час компіляції.
*/