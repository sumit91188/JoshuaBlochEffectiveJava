import com.sdeo.chapter2.item3.staticFactory.Elvis;

/**
 * @author sumitdeo
 * @projectName JoshuaBlochEffectiveJava
 * @package PACKAGE_NAME
 * @date 9/8/20
 * @comment:
 */
public class TestTemplate {

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}
