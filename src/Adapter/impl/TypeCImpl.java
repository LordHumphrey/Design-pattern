package Adapter.impl;

import Adapter.TypeC;

/**
 * @Author: Tao
 * @Time: 2020/12/4 15:36
 * @ProjectName：Design-pattern
 * @FileName: TypeCImpl.java
 * @IDE: IntelliJ IDEA
 */
public class TypeCImpl implements TypeC {
    @Override
    public void readData() {
        System.out.println("Type-C 读取数据");
    }

    @Override
    public void fastCharge() {
        System.out.println("Type-C 快速充电");
    }
}
