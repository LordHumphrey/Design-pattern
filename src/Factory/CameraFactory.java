package Factory;

/**
 * @Author: Tao
 * @Time: 2020/12/9 9:42
 * @ProjectName：Design-pattern
 * @FileName: ComponentsFactory.java
 * @IDE: IntelliJ IDEA
 */
public class CameraFactory implements Factory {

    private CameraFactory() {
    }

    @Override
    public void produce(String components) {
        if ("摄像头".equals(components)) {
            Camera camera = new Camera("摄像头");
            System.out.println(camera);
        } else {
            System.out.println("暂时无法生产");
        }
    }

    private static class ComponentsFactoryHolder {
        private static final CameraFactory CAMERA_FACTORY = new CameraFactory();
    }

    public static CameraFactory getComponentsFactory() {
        return ComponentsFactoryHolder.CAMERA_FACTORY;
    }
}
