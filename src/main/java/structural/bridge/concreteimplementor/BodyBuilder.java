package structural.bridge.concreteimplementor;

import structural.bridge.abstraction.GymRat;
import structural.bridge.implementor.Equipment;

public class BodyBuilder implements GymRat {

    private final Equipment equipment;

    public BodyBuilder(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void chest() {
        equipment.selectEquipment();
        System.out.println("깔짝깔짝 벤치프레스");
    }

    @Override
    public void shoulder() {
        equipment.selectEquipment();
        System.out.println("깔짝깔짝 숄더프레스");
    }

    @Override
    public void back() {
        equipment.selectEquipment();
        System.out.println("깔짝깔짝 로우");
    }

    @Override
    public void lowerBody() {
        equipment.selectEquipment();
        System.out.println("깔짝깔짝 스쿼트");
    }

}
