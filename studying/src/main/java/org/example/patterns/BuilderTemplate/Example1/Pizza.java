package org.example.patterns.BuilderTemplate.Example1;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {


    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE};


    abstract static class Builder<T extends Builder<T>>{

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();

        }

        protected abstract T self();
    }

    abstract Pizza build();

}
