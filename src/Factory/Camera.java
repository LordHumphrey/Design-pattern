package Factory;

/**
 * @Author: Tao
 * @Time: 2020/12/9 9:39
 * @ProjectName：Design-pattern
 * @FileName: camera.java
 * @IDE: IntelliJ IDEA
 */
public class Camera implements Components {
    String name;

    public Camera(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "name='" + name + '\'' +
                '}';
    }
}
