package org.example.enumerations;

import java.text.SimpleDateFormat;

public enum Animal {
    DOG("собака"), CAT("кіт"), FROG("жаба");

    private String translation;

    Animal(String translation){
        this.translation = translation;

    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return "Переклад на україську мову" + translation;
    }
}
