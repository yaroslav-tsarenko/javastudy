package org.example.examClouds.Lesson9.homework.Shop;

public class Main {
    public static void main(String[] args) {
        Main start = new Main();
        Product[] products1 = new Product[3];
        Category[] categories = new Category[3];
        categories[0] = (Category) new Product("Pillow", 5, 7, new int[]{3, 4, 5});
        categories[0] = (Category) new Product("Bath", 500, 8, new int[]{3, 10, 9});
        categories[0] = (Category) new Product("Shower", 400, 10, new int[]{9, 2, 6});
        start.arrayPrint(categories);
    }

    public void arrayPrint(Category[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
