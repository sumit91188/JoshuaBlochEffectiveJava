package com.sdeo.chapter2.item3.finalField;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item3.finalField
 * @date 9/8/20
 * @comment: Singleton with public final field
 */
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    public void leaveTheBuilding() {
        System.out.println("In leaveTheBuilding method..");
    }
}
