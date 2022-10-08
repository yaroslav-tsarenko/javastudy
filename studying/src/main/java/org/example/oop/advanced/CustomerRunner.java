package org.example.oop.advanced;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("line1", "Hyderabad", "500035");
        Customer customer = new Customer("Ranga", homeAddress);
        System.out.println(customer);

        Address wordAddress = new Address("line 1 for work", "Hyderabad", "50035");
        customer.setWorkAddress(wordAddress);

        System.out.println(customer);
    }
}
