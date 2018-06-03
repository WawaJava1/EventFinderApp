package entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
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
}
