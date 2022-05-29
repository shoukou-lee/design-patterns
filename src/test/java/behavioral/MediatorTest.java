package behavioral;

import behavioral.mediator.Guest;
import behavioral.mediator.colleague.CleaningService;
import behavioral.mediator.colleague.DiningService;
import behavioral.mediator.colleague.GymService;
import behavioral.mediator.concretemediator.HotelFrontDesk;
import behavioral.mediator.mediator.FrontDesk;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    @DisplayName("mediator")
    void mediator() {
        // given
        FrontDesk frontDesk = new HotelFrontDesk(new CleaningService(), new DiningService(), new GymService());
        Guest guest = new Guest(frontDesk, 3113);

        // when
        guest.requestDinner();
        guest.requestGymTicket();
        guest.requestRoomCare();
        // then

    }

}
