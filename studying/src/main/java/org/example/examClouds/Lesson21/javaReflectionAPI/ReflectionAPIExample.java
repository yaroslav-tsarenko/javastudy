package org.example.examClouds.Lesson21.javaReflectionAPI;

public class ReflectionAPIExample {
    public static void main(String[] args) {
        User user = new User(25L, "Ivan");
        Class<? extends User> userClass = user.getClass();
        Class<User> userClass1 = User.class;
        System.out.println(userClass == userClass);
    }

    private class Test1{

    }

    private enum Test2{
        ONE, TWO
    }


}
