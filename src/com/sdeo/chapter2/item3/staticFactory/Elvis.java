package com.sdeo.chapter2.item3.staticFactory;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package com.sdeo.chapter2.item3.finalField
 * @date 9/8/20
 * @comment: Singleton with static factory
 */
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

    public void leaveTheBuilding() {
        System.out.println("In leaveTheBuilding method..");
    }
}
