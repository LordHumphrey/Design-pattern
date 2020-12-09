package Observer;

/**
 * @Author: Tao
 * @Time: 2020/12/4 16:52
 * @ProjectName：Design-pattern
 * @FileName: Observer.java
 * @IDE: IntelliJ IDEA
 */
public interface Observable {
    /**
     * @param observer 观察者
     *          添加观察者
     */
    void registerObserver(Observer observer);

    /**
     * @param observer 观察者
     *          删除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers(String message);

    /**
     * 打印当前观察者
     */
    void listAllObserver();
}
