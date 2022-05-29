package behavioral.mediator;

import behavioral.mediator.mediator.FrontDesk;

public class Guest {

    private final FrontDesk frontDesk;
    private final int roomNumber;

    public Guest(FrontDesk frontDesk, int roomNumber) {
        this.frontDesk = frontDesk;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void requestDinner() {
        frontDesk.getDinner(this);
    }

    public void requestGymTicket() {
        frontDesk.getGymTicket(this);
    }

    public void requestRoomCare() {
        frontDesk.cleanRoom(this);
    }

}
