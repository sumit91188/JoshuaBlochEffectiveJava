package com.sdeo.chapter2.item2.hierarchicalbuilder;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item2.hierarchicalbuilder
 * @date 9/8/20
 * @comment:
 */
public class PizzaTestClient {

    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addTopping(Pizza.Topping.HAM)
                .build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
