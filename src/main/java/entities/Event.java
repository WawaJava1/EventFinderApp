package entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "EVENT")
public class Event {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idEvent")
    private Integer idEvent;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "access")
    private String access;

    @Column(name = "organizer")
    private String organizer;


}
