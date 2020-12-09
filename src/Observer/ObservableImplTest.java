package Observer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Tao
 * @Time: 2020/12/9 9:13
 * @ProjectName：Design-pattern
 * @FileName: ObservableImplTest.java
 * @IDE: IntelliJ IDEA
 */
class ObservableImplTest {
    private ObservableImpl observable;

    @BeforeEach
    void initialize() {
        observable = new ObservableImpl();
    }

    @Test
    void registerObserver() {
        observable.registerObserver(new ObserverImpl("质检员"));
        observable.registerObserver(new ObserverImpl("组装车间"));
    }

    @Test
    void removeObserver() {
        ObserverImpl observer = new ObserverImpl("质检员");
        observable.registerObserver(observer);
        observable.registerObserver(new ObserverImpl("组装车间"));
        observable.removeObserver(observer);
        observable.listAllObserver();
    }

    @Test
    void notifyObservers() {
        observable.registerObserver(new ObserverImpl("质检员"));
        observable.registerObserver(new ObserverImpl("组装车间"));
        observable.notifyObservers("摄像头出现故障");
    }
}