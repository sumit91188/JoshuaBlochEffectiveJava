package com.sdeo.chapter2.item4;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item4
 * @date 9/8/20
 * @comment: Noninstantiable utility class
 */
public class UtilityClass {

    //Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }
}
