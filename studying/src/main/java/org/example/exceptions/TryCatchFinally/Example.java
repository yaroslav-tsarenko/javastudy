package org.example.exceptions.TryCatchFinally;

public class Example {

    private ABC abc;
    public void foo() {
        //  int arr [] = {1,2,3};
        //   arr[5] = 3;

        try {
            abc.show();
        } catch (NullPointerException e) {
            System.err.println("Zero devision: ");
        }
    }
}
