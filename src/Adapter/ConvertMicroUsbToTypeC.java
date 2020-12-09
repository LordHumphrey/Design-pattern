package Adapter;

import Adapter.impl.MicroUsbImpl;

/**
 * @Author: Tao
 * @Time: 2020/12/4 15:26
 * @ProjectName：Design-pattern
 * @FileName: ConvertMicroUsbToTypeC.java
 * @IDE: IntelliJ IDEA
 */
public class ConvertMicroUsbToTypeC implements TypeC {
    private MicroUsb microUsb;

    public ConvertMicroUsbToTypeC(MicroUsb microUsb) {
        this.microUsb = microUsb;
    }


    @Override
    public void readData() {
        this.microUsb.readData();
    }

    @Override
    public void fastCharge() {
        this.microUsb.charge();
    }

    public static void main(String[] args) {
        ConvertMicroUsbToTypeC convertMicroUsbToTypeC =
                new ConvertMicroUsbToTypeC(new MicroUsbImpl());
        convertMicroUsbToTypeC.readData();
        convertMicroUsbToTypeC.fastCharge();
    }
}
