package Factory;

/**
 * @Author: Tao
 * @Time: 2020/12/9 9:42
 * @ProjectName：Design-pattern
 * @FileName: ComponentsFactory.java
 * @IDE: IntelliJ IDEA
 */
public class MemoryFactory implements Factory {

    private MemoryFactory() {
    }

    @Override
    public void produce(String components) {
        if ("内存".equals(components)) {
            Camera camera = new Camera("内存");
            System.out.println(camera);
        } else {
            System.out.println("暂时无法生产");
        }
    }

    private static class ComponentsFactoryHolder {
        private static final MemoryFactory MEMORY_FACTORY = new MemoryFactory();
    }

    public static MemoryFactory getComponentsFactory() {
        return ComponentsFactoryHolder.MEMORY_FACTORY;
    }
}
