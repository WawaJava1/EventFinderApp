package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PARTICIPATION")
public class Participation {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParticipation")
    private Integer idParticipation;

    @Column(name = "idEvent")
    private String idEvent;

    @Column(name = "idUser")
    private String idUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "USER",
            joinColumns = {@JoinColumn(name = "idUser")})
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "EVENT",
            joinColumns = {@JoinColumn(name = "idEvent")})
    private Event event;

}



