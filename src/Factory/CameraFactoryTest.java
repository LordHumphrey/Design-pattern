package Factory;

import org.junit.jupiter.api.Test;

/**
 * @Author: Tao
 * @Time: 2020/12/9 9:46
 * @ProjectName：Design-pattern
 * @FileName: ComponentsFactoryTest.java
 * @IDE: IntelliJ IDEA
 */
class CameraFactoryTest {

    @Test
    void produce() {
        CameraFactory cameraFactory = CameraFactory.getComponentsFactory();
        MemoryFactory memoryFactory = MemoryFactory.getComponentsFactory();
        cameraFactory.produce("摄像头");
        memoryFactory.produce("内存");
        cameraFactory.produce("电池");
    }
}