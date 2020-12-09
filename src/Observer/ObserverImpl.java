package Observer;

/**
 * @Author: Tao
 * @Time: 2020/12/9 9:02
 * @ProjectName：Design-pattern
 * @FileName: ObserverImpl.java
 * @IDE: IntelliJ IDEA
 */
public class ObserverImpl implements Observer {
    private String identity;
    private String mesage;

    public ObserverImpl(String identity) {
        this.identity = identity;
    }

    @Override
    public void update(String mesage) {
        this.mesage = mesage;
        this.display();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ObserverImpl{" +
                "identity='" + identity + '\'' +
                ", mesage='" + mesage + '\'' +
                '}';
    }
}
