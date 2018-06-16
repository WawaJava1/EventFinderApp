package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "ORGANIZER")
public class Organizer {


    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "idEvent")
    private Integer idEvent;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER",
            joinColumns = {@JoinColumn(name = "idUser")})
    private List <User> user;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "EVENT",
            joinColumns = {@JoinColumn(name = "idEvent")})
    private List <Event> event;

    private Organizer() {
    }

    public Organizer(Integer idEvent, List<User> user, List<Event> event) {
        this.idEvent = idEvent;
        this.user = user;
        this.event = event;
    }
}

