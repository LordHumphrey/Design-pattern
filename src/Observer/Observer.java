package Observer;

/**
 * @Author: Tao
 * @Time: 2020/12/9 8:58
 * @ProjectName：Design-pattern
 * @FileName: Observer.java
 * @IDE: IntelliJ IDEA
 */
public interface Observer {
    /**
     * 观察者更新方法
     */
    void update(String mesage);

    /**
     * 显示信息
     */
    void display();
}
