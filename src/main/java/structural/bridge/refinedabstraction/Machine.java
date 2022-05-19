package structural.bridge.refinedabstraction;

import structural.bridge.implementor.Equipment;

public class Machine implements Equipment {

    @Override
    public void selectEquipment() {
        System.out.println("머신을 고른다");
    }

}
