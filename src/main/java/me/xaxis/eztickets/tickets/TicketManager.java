package me.xaxis.eztickets.tickets;

import me.xaxis.eztickets.api.CreateTicketRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketManager {

    private final TicketRepository ticketRepository;

    public TicketManager(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(String title, String description, String email) {
        return ticketRepository.save(new Ticket(title, description, email));
    }

    public Optional<Ticket> getTicketById(long id) {
        return ticketRepository.findById(id);
    }

}
