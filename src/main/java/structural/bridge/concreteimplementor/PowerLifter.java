package structural.bridge.concreteimplementor;

import structural.bridge.abstraction.GymRat;
import structural.bridge.implementor.Equipment;
import structural.bridge.refinedabstraction.Machine;

public class PowerLifter implements GymRat {

    private final Equipment equipment;

    public PowerLifter(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void chest() {
        if (equipment instanceof Machine) {
            System.out.println("난 머신은 쓰지 않아");
            return;
        }
        equipment.selectEquipment();
        System.out.println("쿵쾅쿵쾅 벤치프레스");
    }

    @Override
    public void shoulder() {
        if (equipment instanceof Machine) {
            System.out.println("난 머신은 쓰지 않아");
            return;
        }
        equipment.selectEquipment();
        System.out.println("쿵쾅쿵쾅 OHP");
    }

    @Override
    public void back() {
        if (equipment instanceof Machine) {
            System.out.println("난 머신은 쓰지 않아");
            return;
        }
        equipment.selectEquipment();
        System.out.println("쿵쾅쿵쾅 펜들레이 로우");
    }

    @Override
    public void lowerBody() {
        if (equipment instanceof Machine) {
            System.out.println("난 머신은 쓰지 않아");
            return;
        }
        equipment.selectEquipment();
        System.out.println("쿵쾅쿵쾅 스쿼트");
        System.out.println("쿵쾅쿵쾅 데드리프트");
    }

}
