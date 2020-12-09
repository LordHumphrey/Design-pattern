package Adapter;

/**
 * @Author: Tao
 * @Time: 2020/12/4 15:26
 * @ProjectName：Design-pattern
 * @FileName: MicroUsb.java
 * @IDE: IntelliJ IDEA
 */
public interface MicroUsb {
    /**
     * 读取数据
     */
    void readData();

    /**
     * 普通速度充电
     */
    void charge();
}
