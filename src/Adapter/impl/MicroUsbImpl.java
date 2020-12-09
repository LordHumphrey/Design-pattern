package Adapter.impl;

import Adapter.MicroUsb;

/**
 * @Author: Tao
 * @Time: 2020/12/4 15:36
 * @ProjectName：Design-pattern
 * @FileName: MicroUsbImpl.java
 * @IDE: IntelliJ IDEA
 */
public class MicroUsbImpl implements MicroUsb {
    @Override
    public void readData() {
        System.out.println("Micro Usb 读取数据");
    }

    @Override
    public void charge() {
        System.out.println("Micro Usb 普通充电");
    }
}
