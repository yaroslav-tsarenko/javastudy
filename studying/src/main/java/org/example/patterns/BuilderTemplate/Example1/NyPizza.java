package org.example.patterns.BuilderTemplate.Example1;

import java.util.Objects;

public abstract class NyPizza extends Pizza {
    protected NyPizza(Builder size) {
        super();
        this.size = size;
    }

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Builder size;

    public static class Builder extends Pizza.Builder<Builder> {
        private Size size = null;
        public Object Builder(Size size){
            this.size = Objects.requireNonNull(size);

                return new NyPizza(this) {
                    @Override
                    Pizza build() {
                        return null;
                    }
                };
        }

        @Override
        protected Builder self() {
            return null;
        }
    }
}
