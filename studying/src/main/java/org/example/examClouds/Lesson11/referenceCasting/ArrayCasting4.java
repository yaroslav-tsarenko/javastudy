package org.example.examClouds.Lesson11.referenceCasting;

import org.example.examClouds.Lesson9.inheritance.Box6;

public class ArrayCasting4 {
    /**
     * Массив, основанный на типе HeavyBox, можно привести к массиву, основанному на типе Box, если сам тип HeavyBox приводится к типу Box.
     * @param
     */
    public class ArrayCastingDemo5 {
        public static void main(String[] args) {
            rightConversion();
            wrongConversion();
        }

        private static void rightConversion() {
            Box6[] boxArray = new Box6[5];
            HeavyBox1[] heavyBoxArray = new HeavyBox1[6];
            boxArray = heavyBoxArray;
        }

        private static void wrongConversion() {
            Box6[] boxArray = new Box6[5];
            HeavyBox1[] heavyBoxArray = new HeavyBox1[6];
            //ошибка времени выполнения
            heavyBoxArray = (HeavyBox1[]) boxArray;
        }
    }
}
