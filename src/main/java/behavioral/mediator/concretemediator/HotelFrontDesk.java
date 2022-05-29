package behavioral.mediator.concretemediator;

import behavioral.mediator.Guest;
import behavioral.mediator.colleague.CleaningService;
import behavioral.mediator.colleague.DiningService;
import behavioral.mediator.colleague.GymService;
import behavioral.mediator.mediator.FrontDesk;

public class HotelFrontDesk implements FrontDesk {

    private final CleaningService cleaningService;
    private final DiningService diningService;
    private final GymService gymService;

    public HotelFrontDesk(CleaningService cleaningService, DiningService diningService, GymService gymService) {
        this.cleaningService = cleaningService;
        this.diningService = diningService;
        this.gymService = gymService;
    }

    @Override
    public void getDinner(Guest g) {
        diningService.serveDinner(g.getRoomNumber());
    }

    @Override
    public void getGymTicket(Guest g) {
        gymService.serveTicket(g.getRoomNumber());
    }

    @Override
    public void cleanRoom(Guest g) {
        CleaningService.clean(g.getRoomNumber());
    }
}
