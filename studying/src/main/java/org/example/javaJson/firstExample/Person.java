package org.example.javaJson.firstExample;

public class Person {

    private String firstName;
    private String lastName;
    private String alias;
    private int age;
    private boolean isMale;
    private Address address;

    public Person(String firstName, String lastName, String alias, int age, boolean isMale, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.alias = alias;
        this.age = age;
        this.isMale = isMale;
        this.address = address;
    }

    public Person() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", alias=" + alias + ", age=" + age
                + ", isMale=" + isMale + ", address=" + address + "]";
    }
}

class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address() {}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
    }
}

class PersonDemo{
    public static void main(String[] args) {
        Address johnDoeAddress = new Address("100 Elm Way", "Foo City", "NJ", "01234");
        Person johnDoe = new Person("John", "Doe", null, 29, true, johnDoeAddress);


        System.out.println(johnDoe);
    }
}