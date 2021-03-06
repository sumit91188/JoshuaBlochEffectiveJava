package com.sdeo.chapter2.item2.telescopingConstructor;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item2.telescopingConstructor
 * @date 9/7/20
 * @comment: Telescoping constructor pattern - does not scale well!
 */
public class NutritionFacts {

    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // (per serving) optional
    private final int fat; // (g/serving) optional
    private final int sodium; // (mg/serving) optional
    private final int carbohydrate; // (g/serving) optional

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(240, 8, 100, 0, 35, 27);
        System.out.println(nutritionFacts);
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
