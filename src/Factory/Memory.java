package Factory;

/**
 * @Author: Tao
 * @Time: 2020/12/9 9:40
 * @ProjectName：Design-pattern
 * @FileName: Memory.java
 * @IDE: IntelliJ IDEA
 */
public class Memory implements Components {
    String name;

    public Memory(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "name='" + name + '\'' +
                '}';
    }
}
