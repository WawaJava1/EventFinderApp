package controller;


import entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.EventRepository;

import java.util.List;


@RestController
@RequestMapping("api/event")
public class EventController {

    private EventRepository eventRepository;

    @Autowired
    public EventController(EventRepository eventRepository) { this.eventRepository = eventRepository; }

    @GetMapping(value = "/{name}")
    public ResponseEntity<List<Event>> findEventByName(@RequestParam String name) {
        List<Event> events = eventRepository.findEventByName(name);
        return ResponseEntity.ok().body(events);
    }

    @GetMapping(value = "/{number}")
    public ResponseEntity<List<Event>> findEventsById (@RequestParam Integer idEvent){
        List<Event> events = eventRepository.findEventsById(idEvent);
        return ResponseEntity.ok().body(events);
    }
}
