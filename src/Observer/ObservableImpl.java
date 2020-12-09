package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Tao
 * @Time: 2020/12/9 8:55
 * @ProjectName：Design-pattern
 * @FileName: ObserverImpl.java
 * @IDE: IntelliJ IDEA
 */
public class ObservableImpl implements Observable {
    private List<ObserverImpl> observerImpls;

    public ObservableImpl() {
        observerImpls = new ArrayList<ObserverImpl>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observerImpls.add((ObserverImpl) observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerImpls.remove((ObserverImpl) observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (ObserverImpl observerImpl : observerImpls) {
            observerImpl.update(message);
        }
    }

    @Override
    public void listAllObserver() {
        System.out.println(observerImpls.toString());
    }

}
