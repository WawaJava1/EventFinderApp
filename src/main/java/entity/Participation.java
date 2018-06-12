package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
    private Integer idEvent;

    @Column(name = "idUser")
    private Integer idUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "USER",
            joinColumns = {@JoinColumn(name = "idUser")})
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "EVENT",
            joinColumns = {@JoinColumn(name = "idEvent")})
    private Event event;

}



