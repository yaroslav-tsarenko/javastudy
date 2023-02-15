package org.example.examClouds.Lesson13.stringBuilder;

public class DeleteDemo {
    /**
     * <li>Метод delete() удаляет подстроку, используя указанные позиции.
     * <li>Метод deleteCharAt() удаляет символ с указанной позиции:
     * @param
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("This is a test.");

        sb.delete(5, 9);
        System.out.println("После delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("После deleteCharAt: " + sb);
        //
    }
}