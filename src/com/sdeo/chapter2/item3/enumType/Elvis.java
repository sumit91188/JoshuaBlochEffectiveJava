package com.sdeo.chapter2.item3.enumType;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item3.enumType
 * @date 9/8/20
 * @comment:
 */
public enum Elvis {
    INSTANCE;

    public static void main(String[] args) {
        Elvis elvis = INSTANCE;
        elvis.leaveTheBuilding();
    }

    public void leaveTheBuilding() {
        System.out.println("In leaveTheBuilding method..");
    }
}
