package behavioral.mediator.mediator;

import behavioral.mediator.Guest;

public interface FrontDesk {

    void getDinner(Guest g);

    void getGymTicket(Guest g);

    void cleanRoom(Guest g);

}
