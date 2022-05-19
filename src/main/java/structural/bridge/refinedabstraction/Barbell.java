package structural.bridge.refinedabstraction;

import structural.bridge.implementor.Equipment;

public class Barbell implements Equipment {

    @Override
    public void selectEquipment() {
        System.out.println("바벨을 고른다");
    }

}
