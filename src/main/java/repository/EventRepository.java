package repository;

import entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer> {

    List<Event> findEventByName (String name);
    List<Event> findEventsById(Integer idEvent);
    List<Event> findEventsByStartDate (LocalDateTime startDate);
    List<Event> findEventsByEndDate (LocalDateTime endDate);
    List<Event> findEventByAddress(String addres);
    List<Event> findEventByOrganizer (String organizer);
    List<Event> findEventByAccess (String access);

}
