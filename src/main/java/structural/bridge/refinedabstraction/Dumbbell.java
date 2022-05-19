package structural.bridge.refinedabstraction;

import structural.bridge.implementor.Equipment;

public class Dumbbell implements Equipment {

    @Override
    public void selectEquipment() {
        System.out.println("덤벨을 고른다");
    }

}
