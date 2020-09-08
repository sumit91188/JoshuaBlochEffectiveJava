package com.sdeo.chapter2.item2.hierarchicalbuilder;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item2.hierarchicalbuilder
 * @date 9/8/20
 * @comment:
 */
public class Calzone extends Pizza {

    private final boolean sauceInside;

    Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }
    }
}
