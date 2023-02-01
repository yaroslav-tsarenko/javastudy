package org.example.javaJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        SomeData someData = new SomeData();
        InnerObject innerObject = new InnerObject();
        innerObject.setParam1("Hello");
        innerObject.setParam2("BoostBrain");

        someData.setInnerObject(innerObject);

        String result = null;


        try {
            result = objectMapper.writeValueAsString(someData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);



        SomeData newData = null;
        try {
            newData = objectMapper.readValue(result, SomeData.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newData);
    }
}
