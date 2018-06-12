package query;

import java.time.LocalDateTime;

public class EventQuery {
    private String name;
    private Integer idEvent;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String organizer;

    public EventQuery() {
    }

    public String getName() {
        return name;
    }

    public Integer getIdEvent() {
        return idEvent;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getOrganizer() {
        return organizer;
    }
}
