package org.example.examClouds.Lesson12.homework;

public class PracticeMethod {
    public static void main(String[] args) {
        Double[] doubles = new Double[4];
         doubles[0] = new Double("4.1");
         doubles[1] = 4.2;
         doubles[2] = Double.valueOf(4.5);
         doubles[3] = Double.valueOf("4.6");
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
    }
}

class ParseToDouble{
    public static void main(String[] args) {
        String k = "4.4";
        Double parsing = Double.parseDouble(k);
        System.out.println(parsing);
    }
}

class ParseFromDouble{
    public static void main(String[] args) {
        Object[] object = new Object[6];
        Double objectDouble = new Double("4.1");
        object[0] = Float.parseFloat(String.valueOf(objectDouble));
        object[1] = Integer.parseInt(String.valueOf(objectDouble));
        object[2] = Boolean.parseBoolean(String.valueOf(objectDouble));
        object[3] = Byte.parseByte(String.valueOf(objectDouble));
        object[4] = Long.parseLong(String.valueOf(objectDouble));
        object[5] = Short.parseShort(String.valueOf(objectDouble));
        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }

    }
}
