package entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "EVENT")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PARTICIPATION",
            joinColumns = {@JoinColumn(name = "idEvent")})
    private List<Participation> participation;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "COMMENT",
            joinColumns = {@JoinColumn(name = "idEvent")})
    private List<Comment> comment;

    private Event() {
    }

    public Event(LocalDateTime startDate, LocalDateTime endDate, String name, String address, String access, String organizer, List<Participation> participation, List<Comment> comment) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.address = address;
        this.access = access;
        this.organizer = organizer;
        this.participation = participation;
        this.comment = comment;
    }
}
