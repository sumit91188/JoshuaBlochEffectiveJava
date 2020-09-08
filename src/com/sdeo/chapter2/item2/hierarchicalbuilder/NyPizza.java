package com.sdeo.chapter2.item2.hierarchicalbuilder;

import java.util.Objects;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item2.builder
 * @date 9/8/20
 * @comment:
 */
public class NyPizza extends Pizza {

    private final Size size;

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }
    }
}
