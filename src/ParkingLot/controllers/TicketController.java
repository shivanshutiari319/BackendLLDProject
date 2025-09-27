package ParkingLot.controllers;

import ParkingLot.Services.TicketService;

public class TicketController {

    TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public void issueTicket(){
        ticketService.issueTicket();

    }
}
